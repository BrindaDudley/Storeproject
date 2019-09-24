package com.tts.Store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.Store.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
