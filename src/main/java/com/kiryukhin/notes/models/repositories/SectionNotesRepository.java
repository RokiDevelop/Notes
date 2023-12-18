package com.kiryukhin.notes.models.repositories;

import com.kiryukhin.notes.models.entities.SectionNotesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionNotesRepository extends JpaRepository<SectionNotesEntity, Long> {
}
