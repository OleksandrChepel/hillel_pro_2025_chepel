package org.example.lesson6;

public class Corrector {
    public String handleData(String[] strs) {
        StringBuilder stringBuilder  = new StringBuilder();
        int count = 0;
        for (String str : strs) {
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }
            count++;
            stringBuilder.append(count).append(") ").append(str).append(" ");
        }
        return stringBuilder.toString();
    }
}
