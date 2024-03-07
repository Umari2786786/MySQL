package org.example;

import java.sql.*;

public class E2SQL {
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
        ResultSetMetaData rsm = rs.getMetaData();
        System.out.println(rsm.getColumnCount());
        for (int i=1; i < rsm.getColumnCount(); i++){
            System.out.print(rsm.getColumnName(i)+ " ");
        }
        System.out.println();
        while (rs.next()){

            for (int i = 1; i <rsm.getColumnCount() ; i++){
                System.out.print(rs.getString(i)+" ");
            }
            System.out.println();
        }

    }
}
