package com.company;

public class Generator {
    private final String[] str = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
    public String getNumber(){
        return str[(int)(Math.random()*12)]+((int)(Math.random()*10))+((int)(Math.random()*10))+((int)(Math.random()*10))+str[(int)(Math.random()*12)]+str[(int)(Math.random()*12)]+((int)((Math.random()*199)+1));
    }
}