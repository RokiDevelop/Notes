package com.kiryukhin.notes.controllers.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * DTO for {@link com.kiryukhin.notes.models.entities.NoteEntity}
 */
public record NoteEntityDto(Long id, String title, String body, Date date, List<ImageEntityDto> images,
                            List<TagEntityDto> tags) implements Serializable {
}