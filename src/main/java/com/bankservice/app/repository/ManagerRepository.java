package com.bankservice.app.repository;

import com.bankservice.app.entity.Client;
import com.bankservice.app.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, UUID> {
}
