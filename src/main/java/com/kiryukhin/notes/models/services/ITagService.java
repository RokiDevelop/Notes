package com.kiryukhin.notes.models.services;

import com.kiryukhin.notes.models.entities.TagEntity;

import java.util.List;

public interface ITagService {
    List<TagEntity> getAllByTagIn(List<String> tags);
}
