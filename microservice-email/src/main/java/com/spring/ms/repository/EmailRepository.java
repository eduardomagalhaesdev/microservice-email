package com.spring.ms.repository;

import com.spring.ms.model.EmailModel;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {




	

}
