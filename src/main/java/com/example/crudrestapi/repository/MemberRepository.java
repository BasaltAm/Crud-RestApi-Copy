package com.example.crudrestapi.repository;
import com.example.crudrestapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
