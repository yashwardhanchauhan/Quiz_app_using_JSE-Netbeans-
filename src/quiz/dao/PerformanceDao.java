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
import quiz.pojo.PerformancePojo;
import quiz.pojo.StudentScore;

/**
 *
 * @author admin
 */
public class PerformanceDao {
    public static ArrayList<String> getAllStudentId()throws SQLException
    {
        String qry="Select distinct userid from performance";
        ArrayList<String> studentIdList=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(qry);
        while(rs.next())
        {
            String id=rs.getString(1);
            studentIdList.add(id);
        }
        return studentIdList;
    }
    public static ArrayList<String> getAllExamId(String studentId)throws SQLException
    {
        String qry="select examid from performance where userid=?";
        ArrayList<String> examidlist=new ArrayList<>();
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(qry);
        ps.setString(1,studentId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            String id=rs.getString(1);
            examidlist.add(id);
        }
        return examidlist;
    }
    public static StudentScore getScore(String studentid,String examId)throws SQLException
    {
        String qry="select language,per from Performance where userid=? and examid=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(qry);
        ps.setString(1,studentid);
        ps.setString(2,examId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        StudentScore scoreObj=new StudentScore();
        scoreObj.setLanguage(rs.getString(1));
        scoreObj.setPer(rs.getDouble(2));
        return scoreObj;
    }
    
    public static ArrayList<PerformancePojo> getAllData()throws SQLException
    {
        String qry="Select * from performance";
        ArrayList<PerformancePojo> performanceList=new ArrayList<PerformancePojo>();
        Connection con=DBConnection.getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(qry);
        while(rs.next())
        {
            String userid=rs.getString("Userid");
            String examid=rs.getString("Examid");
            String language=rs.getString("Language");
            int right=rs.getInt("right");
            int wrong=rs.getInt("wrong");
            int unattempted=rs.getInt("unattempted");
            double per=rs.getDouble("per");
            PerformancePojo p=new PerformancePojo(examid,language,userid,right,wrong,unattempted,per);
            performanceList.add(p);
        }
        return performanceList;
    }

   public static void addPerformance(PerformancePojo performance)throws SQLException
    {
      String qry="Insert into perfromance values(?,?,?,?,?,?,?)";
      Connection con=DBConnection.getConnection();
      PreparedStatement ps=con.prepareStatement(qry);
      ps.setString(1,performance.getUserid());
      ps.setString(2,performance.getExamid());
      ps.setInt(3,performance.getRight());
      ps.setInt(4,performance.getWrong());
      ps.setInt(5,performance.getUnattempted());
      ps.setDouble(6,performance.getPer());
      ps.setString(7,performance.getLanguage());
      ps.executeUpdate();
    }
    
}
