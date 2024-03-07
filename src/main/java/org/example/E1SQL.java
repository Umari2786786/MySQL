package org.example;

import java.sql.*;

public class E1SQL {
    public static void main(String[] args) throws SQLException {

        // specifying the API: to specify the database :then the address mac ip address
        String dbUrl="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName="syntax_hrm";
        String passWord="syntaxhrm123";

        // creates the connection between java and sql
        Connection connection = DriverManager.getConnection(dbUrl,userName,passWord);

        // takes our queries to sql and brings back results
        Statement statement = connection.createStatement();
        String query = "select * from person";
        ResultSet rs= statement.executeQuery(query);
        while (rs.next()){
        String id=rs.getString(5);
        String firstname=rs.getString("FirstName");
            System.out.println(id+" "+firstname);

        }





    }
}
