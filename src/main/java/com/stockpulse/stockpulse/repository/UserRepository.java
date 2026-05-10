package com.stockpulse.stockpulse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stockpulse.stockpulse.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
 
}
