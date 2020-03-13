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
public class AnswerStore 
{
  ArrayList<AnswerPojo> answerlist;
    
  public AnswerStore()
  {
      answerlist=new ArrayList<>();
  }
  
  public void addAnswer(AnswerPojo answer)
  {
      answerlist.add(answer);
  }
  
  public AnswerPojo getAnswer(int pos)
  {
      return answerlist.get(pos);
  }
    
  public void removeAnswer(int pos)
  {
      answerlist.remove(pos);
  }
  
  public void setAnswerAt(int pos,AnswerPojo answer)
  {
      answerlist.add(pos, answer);
  }
  
  public ArrayList<AnswerPojo>getAnswers()
  {
      return answerlist;
  }
  
  public AnswerPojo getAnswerByQno(int qno)
  {
      for(AnswerPojo answer:answerlist)
      {
          if(answer.getQno()==qno)
              return answer;
        }
      return null;
  }
  
  public int removeAnswer(AnswerPojo answer)
  {
      int pos=answerlist.indexOf(answer);
      answerlist.remove(pos);
      return pos;
  }
  
}
