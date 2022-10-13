package com.randycodes.participantsystem.service;

import com.randycodes.participantsystem.models.Participant;
import com.randycodes.participantsystem.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantServiceImplement implements  ParticipantService{

    @Autowired
    private ParticipantRepository participantRepository;

    @Override
    public Participant saveParticipant(Participant participant) {
        return participantRepository.save(participant);
    }

    @Override
    public List<Participant> getAllParticipants() {
        return participantRepository.findAll();
    }
}
