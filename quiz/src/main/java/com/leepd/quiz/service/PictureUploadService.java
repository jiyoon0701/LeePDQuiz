package com.leepd.quiz.service;

import com.leepd.quiz.dto.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

public interface PictureUploadService {

    Picture uploadPicture(MultipartFile multipartFile);
}
