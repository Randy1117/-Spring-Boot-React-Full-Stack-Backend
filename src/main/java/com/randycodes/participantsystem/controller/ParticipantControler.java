package com.randycodes.participantsystem.controller;

import com.randycodes.participantsystem.models.Participant;
import com.randycodes.participantsystem.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participant")
@CrossOrigin
public class ParticipantControler {
    @Autowired
    private ParticipantService participantService;

    @PostMapping("/add")
    public String add(@RequestBody Participant participant) {
        participantService.saveParticipant(participant);
        return "New Participant is assigned";
    }

    @GetMapping("/getAll")
    public List<Participant> getAllParticipant(){
        return participantService.getAllParticipants();

    }
}
