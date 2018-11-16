package com.company;

public class JackOLantern
{
    String[][]faceFeatures;
    public JackOLantern(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }
    public void edit(String replace, int row, int column)
    {
        this.faceFeatures[row][column] = replace;
    }
    public void fill(String str)
    {
        for(int i = 0; i < this.faceFeatures.length; i++)
        {
            for(int j = 0; j < this.faceFeatures[i].length; j++)
            {
                this.faceFeatures[i][j] = str;
            }
        }
    }
    public String toString()
    {
        String jack = "";
        for(int i = 0; i < this.faceFeatures.length; i++)
        {
            for (int j = 0; j < this.faceFeatures[i].length; j++)
            {
                jack += this.faceFeatures[i][j];
            }
            jack += "\n";
        }
        return jack;
    }
}