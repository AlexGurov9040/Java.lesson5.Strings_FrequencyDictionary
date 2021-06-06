package com.gurov.lesson5.task1;

import java.util.*;

public class BuildDictionary {

    private String text;

    public BuildDictionary(String text){

        this.text = text.toLowerCase();
    }

    public void RussianLang(){

        SortedMap<Character,Integer> masChar = new TreeMap<>();
        for (int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if (ch >= 'а' && ch <= 'я' || ch == 'ё')
                masChar.compute(ch,(key,sumValue)
                        -> (sumValue == null)
                        ? 1
                        : sumValue + 1);
        }
        System.out.println(masChar);
    }

    public void EnglishLang(){

        SortedMap<Character,Integer> masChar = new TreeMap<>();
        for (int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                masChar.compute(ch,(key,sumValue)
                        -> (sumValue == null)
                        ? 1
                        : sumValue + 1);
        }
        System.out.println(masChar);
    }
}
