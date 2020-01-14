package com.kgisl.raja;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import com.kgisl.raja.Trade;
public class TradeFileProcess{
    public static ArrayList<Trade> tradeToList(String fileName){
        ArrayList<Trade> trades = new ArrayList<Trade>();
        File tradeSource = new File(fileName);
        try{
            Scanner fileRead = new Scanner(tradeSource);
            fileRead.nextLine();
            while(fileRead.hasNextLine()){
                String[] aTradeLine = fileRead.nextLine().split(",");
                trades.add(new Trade(aTradeLine[0],new Double(aTradeLine[1])));
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return trades;
    }
}
