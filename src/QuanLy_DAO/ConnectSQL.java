///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package QuanLy_DAO;
/*
DAO : Data access object
*/ 

import java.sql.*;

public class ConnectSQL {
protected Connection conn=null;
    public ConnectSQL() {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionurl="jdbc:sqlserver://localhost:1433;databaseName=QL_MYPHAMM;";
            conn=DriverManager.getConnection(connectionurl,"sa","123");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
