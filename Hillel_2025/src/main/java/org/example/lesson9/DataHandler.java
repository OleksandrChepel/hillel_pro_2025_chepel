package org.example.lesson9;

public class DataHandler {
    public String handleData(String[] data) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (String item : data) {
            result.append("(").append(count).append(") ").append(item).append(" ");
            count++;
        }
        return result.toString().trim();
    }

    public String handleData(Double[] data) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (Double item : data) {
            result.append("(").append(count).append(") ").append(String.format("%.2f", item)).append(" ");
            count++;
        }
        return result.toString().trim();
    }
}

