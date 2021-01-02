package com.muratovic.noteservice.service;

import com.muratovic.noteservice.domain.Note;
import com.muratovic.noteservice.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Note find(Long noteId) throws EntityNotFoundException {
        return noteRepository.findById(noteId).get();
    }

    @Override
    public Note create(Note note) {
        return noteRepository.save(note);
    }
}
