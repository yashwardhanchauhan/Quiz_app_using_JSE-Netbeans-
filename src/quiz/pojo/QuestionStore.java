/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pojo;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QuestionStore 
{
    ArrayList<QuestionsPojo>questionList;

        public QuestionStore()
        {
            questionList =new ArrayList<>();
            
        }
        public void addQuestion(QuestionsPojo q)
        {
            questionList.add(q);
            
        }
        public QuestionsPojo getQuestion(int pos) 
       {
           
           return questionList.get(pos);
       }
        public void removeQuestion(int pos)
        {
            questionList.remove(pos);
        }
        public void setQuestionAt(int pos,QuestionsPojo q)
        {
            questionList.add(pos,q);
            
        }
        public ArrayList<QuestionsPojo> getAllQuestion()
        {
            return questionList;
            
        }
        public int getCount()
        {
            return questionList.size();
        }
    
}
