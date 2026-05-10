package com.exam.physics.controller;

import com.exam.physics.model.Question;
import com.exam.physics.service.QuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/physics")
@Api(value = "Physics Questions API", description = "Endpoints for Physics exam questions (Grade 9-12)")
@CrossOrigin(origins = "*")
public class QuestionController {

    private static final Logger logger = LogManager.getLogger(QuestionController.class);

    @Autowired
    private QuestionService questionService;

    @GetMapping("/health")
    @ApiOperation(value = "Health check endpoint")
    public ResponseEntity<Map<String, String>> health() {
        Map<String, String> status = new HashMap<>();
        status.put("service", "physics-service");
        status.put("status", "UP");
        status.put("version", "1.0.0");
        return ResponseEntity.ok(status);
    }

    @GetMapping("/questions/grade/{grade}/top/{n}")
    @ApiOperation(value = "Get top N questions for a specific grade",
                  notes = "Returns the top N physics questions for the given grade level (9-12)")
    public ResponseEntity<List<Question>> getTopQuestionsByGrade(
            @ApiParam(value = "Grade level (9-12)", required = true) @PathVariable int grade,
            @ApiParam(value = "Number of questions to return", required = true) @PathVariable int n) {

        logger.info("Request: top {} questions for grade {}", n, grade);

        if (grade < 9 || grade > 12) {
            logger.warn("Invalid grade requested: {}", grade);
            return ResponseEntity.badRequest().build();
        }

        List<Question> questions = questionService.getTopNQuestionsByGrade(grade, n);
        logger.info("Returning {} questions for grade {}", questions.size(), grade);
        return ResponseEntity.ok(questions);
    }

    @GetMapping("/questions/topic/{topic}/count/{n}")
    @ApiOperation(value = "Get N questions for a specific topic",
                  notes = "Returns N physics questions for the selected topic")
    public ResponseEntity<List<Question>> getQuestionsByTopic(
            @ApiParam(value = "Topic name e.g. Mechanics, Optics, Electricity", required = true)
            @PathVariable String topic,
            @ApiParam(value = "Number of questions to return", required = true) @PathVariable int n) {

        logger.info("Request: {} questions for topic '{}'", n, topic);
        List<Question> questions = questionService.getQuestionsByTopic(topic, n);
        return ResponseEntity.ok(questions);
    }

    @GetMapping("/questions/complexity/{complexity}/count/{n}")
    @ApiOperation(value = "Get N questions by complexity level",
                  notes = "Returns N questions filtered by complexity: easy, medium, or hard")
    public ResponseEntity<List<Question>> getQuestionsByComplexity(
            @ApiParam(value = "Complexity level: easy, medium, hard", required = true)
            @PathVariable String complexity,
            @ApiParam(value = "Number of questions to return", required = true) @PathVariable int n) {

        logger.info("Request: {} questions with complexity '{}'", n, complexity);

        if (!complexity.equalsIgnoreCase("easy") &&
            !complexity.equalsIgnoreCase("medium") &&
            !complexity.equalsIgnoreCase("hard")) {
            return ResponseEntity.badRequest().build();
        }

        List<Question> questions = questionService.getQuestionsByComplexity(complexity, n);
        return ResponseEntity.ok(questions);
    }

    @GetMapping("/questions/grade/{grade}/topic/{topic}/count/{n}")
    @ApiOperation(value = "Get N questions by grade and topic")
    public ResponseEntity<List<Question>> getQuestionsByGradeAndTopic(
            @PathVariable int grade,
            @PathVariable String topic,
            @PathVariable int n) {

        logger.info("Request: {} questions for grade {} and topic '{}'", n, grade, topic);
        List<Question> questions = questionService.getQuestionsByGradeAndTopic(grade, topic, n);
        return ResponseEntity.ok(questions);
    }

    @GetMapping("/topics")
    @ApiOperation(value = "Get all available physics topics")
    public ResponseEntity<List<String>> getAvailableTopics() {
        return ResponseEntity.ok(questionService.getAvailableTopics());
    }
}
