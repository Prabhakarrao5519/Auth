package com.quick.repository;

import com.quick.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findAllByEmail(String email);
    Boolean existsByEmail(String Email);

}
