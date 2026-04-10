package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/";
        String username="test";
        String password="1234";
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
//            st.execute("create database collegeDb2");
//            System.out.println("database created");
//            ResultSet rs= st.executeQuery("show databases");
//            while(rs.next()){
//                System.out.println(rs.getString(1));
//            }
            st.execute("use collegeDb2");
//            st.execute("create table student(id int auto_increment primary key, name varchar(30), course varchar(30),marks double)");
//            ResultSet rs=st.executeQuery("desc student");
//            String query=("insert into student(name,course,marks) values (?,?,?);");
//            PreparedStatement ps = con.prepareStatement(query);
//            ps.setString(1,"khushi");
//            ps.setString(2,"mca");
//            ps.setDouble(3,89.7);
//            ps.executeUpdate();
//            ps.setString(1,"radwa");
//            ps.setString(2,"mca");
//            ps.setDouble(3,90.7);
//            ps.executeUpdate();
            String update="update student set marks=? where name=?;";
            PreparedStatement ps=con.prepareStatement(update);
            ps.setDouble(1,20);
            ps.setString(2, "radwa");
            ps.executeUpdate();
            ResultSet rs=st.executeQuery("select * from student");
            System.out.println("id\tname\tcourse\tmarks");
            while(rs.next()){
                int id= rs.getInt("id");
                String name=rs.getString("name");
                String course=rs.getString("course");
                Double marks=rs.getDouble("marks");

                System.out.println(String.format("%d\t%s\t%s\t\t%f",id,name,course,marks));
            }
//            ps.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
