package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        query = query.substring(10);

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }

        if (query.toLowerCase().contains("bruno")) {
            return "Bruno is a student at Imperial College London";
        }

        if (query.toLowerCase().contains("your name")) {
            return "BW";
        }

        if (query.toLowerCase().contains("plus")) {
            System.out.println(query);
            String[] numbers = query.replace("what is ", "").replace(" ", "").split("plus");

            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            return String.valueOf(a + b);
        }

        if (query.toLowerCase().contains("multiplied")) {
            String[] numbers = query.replace("what is ", "").replace(" ", "").split("multipliedby");

            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            return String.valueOf(a * b);
        }

        if (query.toLowerCase().contains("minus")) {
            String[] numbers = query.replace("what is ", "").replace(" ", "").split("minus");

            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            return String.valueOf(a - b);
        }

        if (query.toLowerCase().contains("banana")) {
            return "yellow";
        }

        if (query.toLowerCase().contains("eiffel")) {
            return "France";
        }

        if (query.toLowerCase().contains("which of the following numbers is the largest: ")) {
            String[] numbers = query.substring(46).replace(" ", "").split(",");
            int max = Integer.parseInt(numbers[0]);
            for (String number : numbers) {
                int num = Integer.parseInt(number);

                if (num > max) {
                    max = num;
                }
            }

            return String.valueOf(max);
        }

        return "";
    }
}
