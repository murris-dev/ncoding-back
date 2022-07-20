package com.ncoding.ncodingcode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ncoding.ncodingcode.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
}
