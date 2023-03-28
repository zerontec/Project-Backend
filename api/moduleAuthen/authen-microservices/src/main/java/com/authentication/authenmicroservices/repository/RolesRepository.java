package com.authentication.authenmicroservices.repository;

import com.authentication.authenmicroservices.models.ERole;

import com.authentication.authenmicroservices.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolesRepository extends JpaRepository<Role, Long> {

Optional<Role> findByName(ERole name);



}
