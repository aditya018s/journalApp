package net.engineeringdigest.journalApp.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection="journal_entries")
//@Getter
//@Setter
@Data // it's Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@NoArgsConstructor
public class JournalEntry {    //pojo class
    @Id
    private ObjectId id;
    @NonNull
    private String title;
    private String content ;
    private LocalDateTime date;

   }
