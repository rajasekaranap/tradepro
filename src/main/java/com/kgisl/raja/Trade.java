class Trade{
    String symbol;
    Double rate;
    Trade(){
        this.symbol = "unknown";
        this.rate = 0.0;
    }
    Trade(String symbol,Double rate){
        this.symbol = symbol;
        this.rate = rate;
    }
    public void setSymbol(String symbol){this.setSymbol = symbol;}
    public void setRate(Double rate){this.rate = rate;}
    public String getSymbol(String symbol){return this.setSymbol}
    public Double getRate(Double rate){return this.rate}
}