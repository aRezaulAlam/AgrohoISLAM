package com.agroho.service;

import com.agroho.domain.Category;
import com.agroho.domain.Question;
import com.agroho.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AKM Rezaul Alam on 6/30/17.
 * Email: contact@rezaul.me
 * URL: rezaul.me
 */
@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question submitQuestion(Question question) {
        return null;
    }

    @Override
    public List<Question> getAllQuestions() {
        return null;
    }

    @Override
    public Question getQuestionById(Long id) {
        return null;
    }

    @Override
    public List<Question> getQuestionsByCategory(Category category) {
        return null;
    }

    @Override
    public List<Question> getEditorPickedQuestions() {
        return null;
    }

    @Override
    public Question answerQuestion(Question question) {
        return null;
    }
}
