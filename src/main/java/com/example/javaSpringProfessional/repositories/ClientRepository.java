package com.example.javaSpringProfessional.repositories;


import com.example.javaSpringProfessional.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
