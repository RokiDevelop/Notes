package com.kiryukhin.notes.controllers.dtos;

import java.io.Serializable;

/**
 * DTO for {@link com.kiryukhin.notes.models.entities.TagEntity}
 */
public record TagEntityDto(Long id, String tag) implements Serializable {

    @Override
    public String toString() {
        return tag.toLowerCase();
    }
}