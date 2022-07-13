package com.RESTAPI.API.entity;

public class ConsumingRestQuote {
    private String type;
    private Value value;

    public ConsumingRestQuote(){}

    public ConsumingRestQuote(String type, Value value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "ConsumingRestQuote {" +
                "type = " + type + '\'' +
                "value = " + value +
                '}';
    }
}
