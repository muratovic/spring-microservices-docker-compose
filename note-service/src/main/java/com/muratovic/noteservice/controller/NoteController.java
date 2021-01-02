package com.muratovic.noteservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.muratovic.noteservice.domain.Note;
import com.muratovic.noteservice.service.NoteService;

@RestController
@RequestMapping("v1/notes")
public class NoteController {

    private static final Logger LOG = LoggerFactory.getLogger(NoteController.class);

    private final NoteService noteService;

    @Autowired
    public NoteController(final NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Note createNote(@RequestBody Note note)
    {
        LOG.debug("create note...: " + note);
        return noteService.create(note);
    }

    @GetMapping("/{noteId}")
    public Note findNote(@PathVariable long noteId) {
        return this.noteService.find(noteId);
    }
}
