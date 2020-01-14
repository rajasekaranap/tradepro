package com.kgisl.raja;
import com.kgisl.raja.TradeFileProcess;
import com.kgisl.raja.Trade;
import com.kgisl.raja.DBHandler;
import java.util.Collections;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static ArrayList<Trade> tradeToList(String fileName){
        ArrayList<Trade> trades = new ArrayList<Trade>();
        File tradeSource = new File(fileName);
        try{
            Scanner fileRead = new Scanner(tradeSource);
            while(fileRead.hasNextLine()){
                String[] aTradeLine = fileRead.nextLine().split(",");
                trades.add(new Trade(aTradeLine[0],new Double(aTradeLine[1])));
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return trades;
    }
    public static void main( String[] args )
    {
        
        String fileName = "src/main/resources/trade14012020.csv";
        
        
        ArrayList<Trade> allTrades = TradeFileProcess.tradeToList(fileName);
        
        //ArrayList<Trade> allTrades = new ArrayList<Trade>();
        //Collections.addAll(allTrades,new Trade[]{new Trade("Apple",2.35),new Trade("Samsung",45.35)});
        for(Trade aTrade:allTrades){
            System.out.println(aTrade.getSymbol()+"  "+aTrade.getRate());
        }
        DBHandler.pushTrades(allTrades);
    }
}
