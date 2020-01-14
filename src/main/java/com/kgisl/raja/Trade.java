package com.kgisl.raja;
public class Trade{
    String symbol;
    Double rate;
    public Trade(){
        this.symbol = "unknown";
        this.rate = 0.0;
    }
    public Trade(String symbol,Double rate){
        this.symbol = symbol;
        this.rate = rate;
    }
    public void setSymbol(String symbol){this.symbol = symbol;}
    public void setRate(Double rate){this.rate = rate;}
    public String getSymbol(){return this.symbol;}
    public Double getRate(){return this.rate;}
}