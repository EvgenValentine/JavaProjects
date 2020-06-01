/*
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Evgen Khnyznytskij
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        // first task - about myself
        byte age = 21;
        short year = 1998;
        int cardNumber = 12881822;
        float gravity = (float) 9.8;
        double height = 184.4;
        char grade = 'A';
        boolean sex = true;
        String city = "Chernivtsi";

        System.out.println("I'm " + age + ".\nI was born in " + year +
                ".\nMy students card number is " + cardNumber + ".\nG is " +
                "equal " + gravity + "m/s.\nMy height is " + height +
                "cm.\nI have an '" + grade + "' rating in my favorite game" +
                ".\nI am a man - it's " + sex + ".\nI study in" + city + ".\n");

        // second task - palindrome
        String[] massive = new String[5];
        massive[0] = "Madam, I'm Adam!";
        massive[1] = "А муза – раба разума";
        massive[2] = "Ах, Ира – во повариха!";
        massive[3] = "блабла";
        massive[4] = "«Во, голое тело!», - вопи по воле теологов";


        for (String s : massive) {
            String text = s;
            text = text
                    .replaceAll("[^A-Za-z0-9_А-Яа-я]", "")
                    .toLowerCase();
            boolean palindromeSign = true;
            for (int i = 0, j = text.length() - 1; i < text.length() / 2; i++, j--) {
                if (text.charAt(i) != text.charAt(j)) {
                    palindromeSign = false;
                    break;
                }
            }
            if (palindromeSign) {
                System.out.println(text + " true");
            } else {
                System.out.println(text + " false");
            }
        }

        // third task - integral
        double y = 1;
        double deltaX = 0.01;
        double PI = Math.PI;
        double area = 0;
        for (double x = 0; x < PI; x+=deltaX) {
            if(Math.sin(x) < y){
                area += Math.sin(x) * deltaX;
            }else{
                area += y * deltaX;
            }
        }
        System.out.println("\nArea = " + area);
    }
}
