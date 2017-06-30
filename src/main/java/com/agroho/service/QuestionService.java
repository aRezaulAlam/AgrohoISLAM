package com.agroho.service;

import com.agroho.domain.Category;
import com.agroho.domain.Question;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AKM Rezaul Alam on 6/30/17.
 * Email: contact@rezaul.me
 * URL: rezaul.me
 */
@Service
public interface QuestionService {

    Question submitQuestion(Question question);
    List<Question> getAllQuestions();
    Question getQuestionById(Long id);
    List<Question> getQuestionsByCategory(Category category);
    List<Question> getEditorPickedQuestions();
    Question answerQuestion(Question question);
}
