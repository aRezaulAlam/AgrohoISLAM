package com.agroho.domain;

import com.agroho.domain.enums.QuestionStatus;

import javax.persistence.*;

/**
 * Created by AKM Rezaul Alam on 6/30/17.
 * Email: contact@rezaul.me
 * URL: rezaul.me
 */
@Entity
public class Question extends BaseEntity {

    private Long questionId;
    private String questionTitle;
    private String questonDescription;
    private String questionAnswer;
    private Boolean isPrivate = true;
    private Boolean isEditorPicked = false;
    @Enumerated(EnumType.STRING)
    private QuestionStatus questionStatus;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User userAsked;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "scholar_id")
    private User userAnswered;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId")
    private Category category;

    //Submiting Question Constructor
    public Question(Long questionId, String questionTitle, String questonDescription, QuestionStatus questionStatus, User userAsked) {
        this.questionId = questionId;
        this.questionTitle = questionTitle;
        this.questonDescription = questonDescription;
        this.questionStatus = questionStatus;
        this.userAsked = userAsked;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestonDescription() {
        return questonDescription;
    }

    public void setQuestonDescription(String questonDescription) {
        this.questonDescription = questonDescription;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public Boolean getEditorPicked() {
        return isEditorPicked;
    }

    public void setEditorPicked(Boolean editorPicked) {
        isEditorPicked = editorPicked;
    }

    public QuestionStatus getQuestionStatus() {
        return questionStatus;
    }

    public void setQuestionStatus(QuestionStatus questionStatus) {
        this.questionStatus = questionStatus;
    }

    public User getUserAsked() {
        return userAsked;
    }

    public void setUserAsked(User userAsked) {
        this.userAsked = userAsked;
    }

    public User getUserAnswered() {
        return userAnswered;
    }

    public void setUserAnswered(User userAnswered) {
        this.userAnswered = userAnswered;
    }


}
