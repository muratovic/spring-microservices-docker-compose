package com.muratovic.noteservice.repository;

import com.muratovic.noteservice.domain.Note;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long>, JpaSpecificationExecutor<Note> {
}
