package com.kgisl.raja;
import java.util.*;
import com.kgisl.raja.Trade;
import java.sql.*;
class DBHandler{
    public static boolean pushTrades(ArrayList<Trade> trades){
        String dName="raja";
        String uName="root";
        String passWord="";
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dName,uName,passWord);
            Statement stmt = con.createStatement();
            
            for(Trade aTrade:trades){
                String qur = "insert into tradeinfo (Symbol,Rate) values('"+aTrade.getSymbol()+"','"+aTrade.getRate()+"');";;
                stmt.executeUpdate(qur);
                System.out.println(aTrade.getSymbol()+"\t"+aTrade.getRate()+"\t----Done");
            }
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}