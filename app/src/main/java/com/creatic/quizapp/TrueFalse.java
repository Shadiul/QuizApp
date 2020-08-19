package com.creatic.quizapp;

public class TrueFalse {
    private int questionID;
    private boolean answer;

    public TrueFalse(int questionID, boolean answer) {
        this.questionID = questionID;
        this.answer = answer;
    }

    public int getQuestionID() {
        return questionID;
    }

    public boolean isAnswer() {
        return answer;
    }
}
