package com.kiryukhin.notes.models.repositories;

import com.kiryukhin.notes.models.entities.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<TagEntity, Long> {
    List<TagEntity> findAllByTagIn(List<String> tag);
}
