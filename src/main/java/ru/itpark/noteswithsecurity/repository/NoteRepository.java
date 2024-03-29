package ru.itpark.noteswithsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.noteswithsecurity.entity.NoteEntity;

public interface NoteRepository
        extends JpaRepository<NoteEntity, Integer> { // Integer - то, над чем написано @Id
    // boolean existsByOwnerIdAndId(int ownerId, int id);
}
