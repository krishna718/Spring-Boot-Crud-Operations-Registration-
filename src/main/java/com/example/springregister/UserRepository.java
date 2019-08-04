package com.example.springregister;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User, String> {

}
