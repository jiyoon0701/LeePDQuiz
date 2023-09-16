package com.leepd.quiz.service;

import com.leepd.quiz.dto.Answer;
import com.leepd.quiz.dto.Picture;
import com.leepd.quiz.dto.QuizCreateRequest;
import com.leepd.quiz.dto.Tester;
import com.leepd.quiz.entity.Quiz;
import com.leepd.quiz.entity.QuizId;
import com.leepd.quiz.repository.QuizRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Transactional
@RequiredArgsConstructor
public class QuizCreateService {
    private final QuizRepository quizRepository;

    private final PictureUploadService pictureUploadService;
    // private final TesterService testerService;
    public void createQuiz(MultipartFile file, QuizCreateRequest request) {

        Answer answer = createAnswer(request);
        Picture picture = createPicture(file);
        Tester tester = createTester();
        Quiz quiz = new Quiz(QuizId.of(quizRepository.nextId()),
                tester, picture, answer);
        quizRepository.save(quiz);
    }

    private Answer createAnswer(QuizCreateRequest request) {
        return new Answer(request.getCharacterName());
    }

    private Tester createTester() {
        // session에 저장
        //return testerService.createTester("test");
        return new Tester("test");
    }

    private Picture createPicture(MultipartFile file) {
        return pictureUploadService.uploadPicture(file);
    }
}
