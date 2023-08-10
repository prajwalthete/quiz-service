package com.prajwal.quizservice.controller;


import com.prajwal.quizservice.entity.QuestionWrapper;
import com.prajwal.quizservice.entity.QuizDto;
import com.prajwal.quizservice.entity.Response;
import com.prajwal.quizservice.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(

            @RequestBody QuizDto quizDto
            /*@RequestParam String category,
            @RequestParam Long numQ,
            @RequestParam String title*/) {

        return quizService.createQuiz(quizDto.getCategoryName(), Long.valueOf(quizDto.getNumQuestions()),quizDto.getTitle());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Long id) {

        return quizService.getQuizQuestions(Math.toIntExact(id));
    }

    @PostMapping("/submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses) {

        return quizService.calculateResult(id, responses);
    }
}
