package com.randycodes.participantsystem.repository;

import com.randycodes.participantsystem.models.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Integer>  {
}
