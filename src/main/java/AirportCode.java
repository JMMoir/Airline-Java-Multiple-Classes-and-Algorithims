public enum AirportCode {
    GLASGOW("GLA"),
    EDINBURGH("EDI"),
    DUBLIN("DUB");

    private String code;

    AirportCode(String code){
        this.code = code;
    }

    public String getAirportCode(){
        return code;
    }
}
