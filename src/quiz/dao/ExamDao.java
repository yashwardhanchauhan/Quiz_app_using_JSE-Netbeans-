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
import java.sql.Statement;
import java.util.ArrayList;
import quiz.dbutill.DBConnection;
import quiz.pojo.ExamPojo;

/**
 *
 * @author admin
 */
public class ExamDao {
    

    public static String getExamid()throws SQLException
    {
        String qry="Select count(*) as totalrows from exam";
        int rowCount=0;
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(qry);
        if(rs.next())
            rowCount=rs.getInt(1);
        String newId="Ex-"+(rowCount+1);
        return newId;
    }
    
    
    public static void addExam(ExamPojo newExam)throws SQLException
    {
        String q="Insert into Exam values(?,?,?)";
        Connection conn= DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(q);
        ps.setString(1,newExam.getExamId());
        ps.setString(2,newExam.getLanguage());
        ps.setInt(3,newExam.getTotalQuestions());
        ps.executeUpdate();
        
    }
    
    public static boolean isPaperset(String subject)throws SQLException
    {
        String qry="Select examid from exam where lanaguage=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(qry);
        ps.setString(1,subject);
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    
 
    
    public static ArrayList<String> getExamIdBySubject(String userid,String subject)throws SQLException
    {
        String qry="Select examid from exam where lanaguage=? minus select examid from performance where userid=?";
        ArrayList<String> examlist=new ArrayList();
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(qry);
        ps.setString(1, subject);
        ps.setString(2,userid);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
            examlist.add(rs.getString(1));
        return examlist;
    }
   
    public static int getQuestionCountByExam(String examid)throws SQLException
    {
       
        int count=-1;
        String qry="select total_question from exam where examid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(qry);
        ps.setString(1,examid);
        ResultSet rs=ps.executeQuery();
        if(rs != null)
        {     while(rs.next())
        {       count = rs.getInt(1);
        }
        }
         
       return count;
        
    
    }   
}

