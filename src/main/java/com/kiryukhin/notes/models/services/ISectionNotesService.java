package com.kiryukhin.notes.models.services;

import com.kiryukhin.notes.models.entities.SectionNotesEntity;

import java.util.List;
import java.util.Optional;

public interface ISectionNotesService {
    List<SectionNotesEntity> getAll();

    void add(String title, String description);

    Optional<SectionNotesEntity> findById(long sectionNotesId);
}
