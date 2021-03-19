package test;

import java.util.Arrays;

public class Questionario {
    private long id;
    private  Question[] questions;

    public Questionario(long id, Question[] questions) {
        this.id = id;
        this.questions = questions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public long getLastQuestionID(){
        long qID = 0;
        for(Question q : this.questions) {
            qID = q.getId();
        }
        return qID;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Questionario{" +
                "id=" + id +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }
}
