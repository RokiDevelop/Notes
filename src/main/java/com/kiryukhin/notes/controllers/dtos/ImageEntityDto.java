package com.kiryukhin.notes.controllers.dtos;

import java.io.Serializable;

/**
 * DTO for {@link com.kiryukhin.notes.models.entities.ImageEntity}
 */
public record ImageEntityDto(Long id, byte[] image) implements Serializable {
}