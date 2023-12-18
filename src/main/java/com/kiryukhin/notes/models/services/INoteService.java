package com.kiryukhin.notes.models.services;

import com.kiryukhin.notes.models.entities.SectionNotesEntity;
import com.kiryukhin.notes.models.entities.TagEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface INoteService {
    void add(String title,
             String body,
             List<MultipartFile> imageFiles,
             SectionNotesEntity sectionNotesEntity,
             List<TagEntity> tagEntityList);
}
