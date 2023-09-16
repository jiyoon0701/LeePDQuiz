package com.leepd.quiz.service;

import com.leepd.quiz.dto.Tester;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public interface TesterService{

    Tester createTester(String loginId);
}
