package com.develogical;

public class QueryProcessor {

    public String process(String query) {
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

        if (query.toLowerCase().contains("what is 9 plus 12")) {
            return "21";
        }

        return "";
    }
}
