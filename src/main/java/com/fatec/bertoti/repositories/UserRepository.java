package com.fatec.bertoti.repositories;

import com.fatec.bertoti.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
