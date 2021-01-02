package com.muratovic.noteservice.service;

import javax.persistence.EntityNotFoundException;
import com.muratovic.noteservice.domain.Note;

public interface NoteService {

    Note find(Long noteId) throws EntityNotFoundException;

    Note create(Note note);


}
