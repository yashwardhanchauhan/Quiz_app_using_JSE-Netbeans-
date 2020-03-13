/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import quiz.dbutill.DBConnection;
import quiz.pojo.PerformancePojo;
import quiz.pojo.QuestionStore;
import quiz.pojo.QuestionsPojo;

/**
 *
 * @author admin
 */
public class QuestionDao
{
    public static void addQuestions(QuestionStore q)throws SQLException
    {
        String qry="Insert into Questions values(?,?,?,?,?,?,?,?,?)";
        ArrayList<QuestionsPojo> questionList= q.getAllQuestion();
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(qry);
        for(QuestionsPojo obj:questionList)
        {
            ps.setString(1,obj.getExamId());
            ps.setInt(2,obj.getQno());
            ps.setString(3,obj.getQuestion());
            ps.setString(4,obj.getAnswer1());
            ps.setString(5,obj.getAnswer2());
            ps.setString(6,obj.getAnswer3());
            ps.setString(7,obj.getAnswer4());
            ps.setString(8,obj.getCorrectAnswer());
            ps.setString(9,obj.getLanguage());
            ps.executeUpdate();
        } 
    }

    public static ArrayList<QuestionsPojo> getQuestionsByExamId(String examId)throws SQLException
    {
        String qry="Select question from Questions where examid=?";
        ArrayList<QuestionsPojo> questionlist=new ArrayList<>();
         Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(qry);
        ps.setString(1,examId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            String id=rs.getString(1);
             QuestionsPojo q=new QuestionsPojo(id);
            questionlist.add(q);
        }
        return questionlist;
        

    }
    
  }
