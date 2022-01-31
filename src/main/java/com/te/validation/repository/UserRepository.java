package com.te.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.validation.model.User;
//@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
