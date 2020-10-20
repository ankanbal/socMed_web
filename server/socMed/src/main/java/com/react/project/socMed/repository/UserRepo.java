package com.react.project.socMed.repository;

import com.react.project.socMed.model.Register;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserRepo extends MongoRepository<Register, UUID> {
}
