package com.javafullstackguru.springbatchprocessdbtocsv.repository;

import com.javafullstackguru.springbatchprocessdbtocsv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
