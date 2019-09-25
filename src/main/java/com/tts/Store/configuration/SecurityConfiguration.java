package com.tts.Store.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private DataSource dataSource;
	
	private String usersQuery="select user_name from user where user_name=?";
	private String rolesQuery="select u.user_name,r.role_name from user u inner join user_role ur on (u.id=ur.user_id)inner join role r on(ur.role_id=r.id) where u.user_name=?";
	
	   @Override
	    protected void configure(AuthenticationManagerBuilder auth)
	            throws Exception {
	        auth.
	                jdbcAuthentication()
	                .usersByUsernameQuery(usersQuery)
	                .authoritiesByUsernameQuery(rolesQuery)
	                .dataSource(dataSource)
	                .passwordEncoder(bCryptPasswordEncoder);
	    }
	   
	   @Override
	    protected void configure(HttpSecurity http) throws Exception {

	        http.
	                authorizeRequests()
	                .antMatchers("/console/**").permitAll()
	                .antMatchers("/signin").permitAll()
	                .antMatchers("/signUp").permitAll()
	                .antMatchers("/custom.js").permitAll()
	                .antMatchers("/custom.css").permitAll()
	                .antMatchers("/index").permitAll()
	                .antMatchers("/seller/**").hasAuthority("SELLER")
	                .antMatchers().hasAuthority("USER").anyRequest()
	                
	                .authenticated().and().csrf().disable().formLogin()
	                .loginPage("/sigin").failureUrl("/sigin?error=true")
	                .defaultSuccessUrl("/home")
	                .usernameParameter("username")
	                .passwordParameter("password")
	                .and().logout()
	                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	                .logoutSuccessUrl("/login").and().exceptionHandling();
	        
	        http.headers().frameOptions().disable();
	    }

	
	
	   @Override
	    public void configure(WebSecurity web) throws Exception {
	        web.ignoring()
	                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**","/webjars/**");
	    }

}
