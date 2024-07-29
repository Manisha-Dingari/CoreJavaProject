package com.corejavaproject.strings;

public class StringComparison {
    public static void main(String[] args) {
        StringComparison stringComparison = new StringComparison();
        String str1 = "Scotland";
        String str2 = new String("Scotland");

        boolean result = stringComparison.equals(str1, str2);
        System.out.println(result);
    }
    public boolean equals(String str1, String str2){
        if(str1 == str2){
            return true;
        } else {
            return false;
        }
    }

    public boolean Equals(String str1, String str2){
        if(str1.equalsIgnoreCase(str2)){
            return true;
        }
        return false;
    }

    public boolean CompareTo(String str1, String str2){
        if(str1.compareToIgnoreCase(str2) == 0){
            return true;
        }

        return false;
    }
}
