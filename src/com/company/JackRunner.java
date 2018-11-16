package com.company;

public class JackRunner
{

    public static void main(String[] args)
    {
        String[][] featuresArr ={
                {"*","-","-","-","-","-","-","*"},
                {"|","#","-","#","#","-","#","|"},
                {"|","#","0","#","#","0","#","|"},
                {"|","#","#","{","}","#","#","|"},
                {"|","#","#","#","#","#","#","|"},
                {"|","[","$","$","$","$","]","|"},
                {"|","#","#","#","#","#","#","|"},
                {"*","_","_","_","_","_","_","*"}
        };
        JackOLantern Jack = new JackOLantern(featuresArr);
        System.out.println(Jack.toString());
    }
}