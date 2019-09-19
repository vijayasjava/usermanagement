package com.microservices.usermanagement.repo.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservices.usermanagement.model.mongo.UserDocument;

@Repository(value = "userMongoRepo")
public interface UserRepo extends MongoRepository<UserDocument, String> {

}
