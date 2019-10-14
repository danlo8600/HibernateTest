package it.d4n1x.hbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.d4n1x.hbtest.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
