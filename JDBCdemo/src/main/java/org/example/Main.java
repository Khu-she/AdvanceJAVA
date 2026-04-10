package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/studentDB";
        String username="test";
        String password="1234";

        try{
            Connection con= DriverManager.getConnection(url,username,password);
            System.out.println("connected");

            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
//            int rows=st.executeUpdate("insert into student(name, marks) values ('Radwa',89),('rishabh',50)");
//            if(rows>0){
//                System.out.println("data inserted");
//            }

            ResultSet rs=st.executeQuery("SELECT * FROM student");
            rs.moveToInsertRow();
            rs.updateString("name","Mohit");
            rs.updateDouble("marks",89);
            rs.insertRow();
            System.out.println("Id\tName\tMarks");
            while(rs.next()){}
            while(rs.previous()){
                double marks=rs.getDouble("marks");
//                if(marks<=70){
//                    rs.updateDouble("marks",marks+5);
//                    rs.updateRow();
//                }
                int id=rs.getInt("id");
                String name=rs.getString("name");
                 marks=rs.getDouble("marks");
                System.out.println(String.format("%d\t%s\t%f",id,name,marks));
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
