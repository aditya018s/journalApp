package net.engineeringdigest.journalApp.Repository;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);

    Optional<JournalEntry> findAllById(ObjectId id);

    void deleteByUserName(String username);
}
