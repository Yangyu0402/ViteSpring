package org.stellas.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.stellas.backend.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}