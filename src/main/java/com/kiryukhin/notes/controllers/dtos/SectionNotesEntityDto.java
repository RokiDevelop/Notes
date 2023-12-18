package com.kiryukhin.notes.controllers.dtos;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.kiryukhin.notes.models.entities.SectionNotesEntity}
 */
public record SectionNotesEntityDto(Long id,
                                    String title,
                                    String description,
                                    List<NoteEntityDto> noteEntities) implements Serializable {
}