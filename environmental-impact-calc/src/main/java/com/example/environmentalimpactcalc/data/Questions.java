package com.example.environmentalimpactcalc.data;

public enum Questions {
    A("How much electricity does your household use per month?"),
    B("What percentage of your home’s electricity comes from renewable sources (solar, wind, hydro, etc.)?"),
    C("How many kilometers (or miles) do you drive in a typical week?"),
    D("How many hours do you spend flying per year?"),
    E("How often do you eat meat or dairy products?"),
    F("How much household waste do you produce per week?"),
    G("What percentage of your household waste is recycled or composted?"),
    H("How much water do you use daily per person (including showers, washing, etc.)?"),
    I("How often do you buy new non-essential items (clothes, electronics, etc.)?"),
    J("How much of your total footprint do you offset through green actions (carbon credits, tree planting, etc.)?");

    private final String question;
    Questions(String question){
        this.question = question;
    }

    public String getQuestion(){
        return this.question;
    }
}
