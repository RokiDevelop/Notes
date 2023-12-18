package com.kiryukhin.notes.models.services;

import com.kiryukhin.notes.models.entities.ImageEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    List<ImageEntity> saveAllAsBytes(List<byte[]> imageFiles);

    List<ImageEntity> saveAllAsMultipartFile(List<MultipartFile> imageFiles);
}
