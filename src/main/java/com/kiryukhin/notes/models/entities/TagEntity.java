package com.kiryukhin.notes.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tags")
public class TagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "tag", unique = true)
    private String tag;

    public TagEntity(Long id, String tag, List<NoteEntity> notes) {
        this.id = id;
        setTag(tag);
        this.notes = notes;
    }

    public void setTag(String tag) {
        this.tag = tag.toLowerCase().trim();
    }

    public String getTag() {
        return tag.toLowerCase();
    }

    @ManyToMany(mappedBy = "tags")
    private List<NoteEntity> notes;
}
