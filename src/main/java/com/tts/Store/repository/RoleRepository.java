package com.tts.Store.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.Store.domain.Role;
import com.tts.Store.domain.RoleName;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
	
	List<Role> findByRoleNameIn(List<RoleName> roleNames);

}
