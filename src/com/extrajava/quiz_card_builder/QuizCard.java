package com.extrajava.quiz_card_builder;

/**
 * Quiz Card
 * @autor EvgeniiTiurin
 * @version 1.1
 * Игра с вопросом и ответом на карточке
 */

public class QuizCard{
    private String question;
    private String answer;

    public QuizCard(String q, String a){
        answer = a;
        question = q;
    }

    public String getAnswer(){
        return answer;
    }

    public String getQuestion(){
        return question;
    }
}
