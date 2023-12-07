package com.bankservice.app.repository;

import com.bankservice.app.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientRepository extends  JpaRepository<Client, UUID> {
}
