package com.gurov.lesson5.task1;

import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args){

        Dictionary app = new Dictionary();
        app.Menu();
    }

    public static void Menu(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Russian text: ");
        String text = in.nextLine();
        BuildDictionary RussianText = new BuildDictionary(text);
        RussianText.RussianLang();
        System.out.print("Enter the English text: ");
        text = in.nextLine();
        BuildDictionary EnglishText = new BuildDictionary(text);
        EnglishText.EnglishLang();
    }
}
