package com.randycodes.participantsystem.service;

import com.randycodes.participantsystem.models.Participant;

import java.util.List;

public interface ParticipantService {
    public Participant saveParticipant(Participant participant);
    public List<Participant> getAllParticipants();
}
