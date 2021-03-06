package com.ciperlabs.unicodepleco.repository;

import com.ciperlabs.unicodepleco.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface UserRepository extends JpaRepository<User, Long>{

    Integer countUsersByCreatedAtAfter(LocalDateTime localDateTime);

//    List<Conversion> getAllConversions();


}
