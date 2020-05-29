package com.company;

public class Main {

    public static void main(String[] args) {
        String[] massive = new String[5];
        massive[0] = "Madam, I'm Adam!";
        massive[1] = "А муза – раба разума";
        massive[2] = "Ах, Ира – во повариха!";
        massive[3] = "блабла";
        massive[4] = "«Во, голое тело!», - вопи по воле теологов";


        for (String s : massive) {
            String text = s;
//
            text = text
                    .replaceAll("[^A-Za-z0-9_А-Яа-я]", "")
                    .toLowerCase();
            boolean p = true;
            for (int i = 0, j = text.length() - 1; i < text.length() / 2; i++, j--) {
                if (text.charAt(i) != text.charAt(j)) {
                    p = false;
                    break;
                }
            }
            if (p) {
                System.out.println(text + " true");
            } else {
                System.out.println(text + " false");
            }
        }

    }
}
