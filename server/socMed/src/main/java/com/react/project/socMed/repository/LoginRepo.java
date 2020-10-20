package com.react.project.socMed.repository;

import com.react.project.socMed.model.Login;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface LoginRepo extends MongoRepository<Login, UUID> {
}
