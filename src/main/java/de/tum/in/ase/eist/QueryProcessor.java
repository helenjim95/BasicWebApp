package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        //String query = "what is 12 plus 15"
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "HanYin";

        } else if (query.contains("plus")) {
//            Here we get a list of words
            String[] words = query.split(" ");
            int sum = 0;
            for (String word: words) {
                try {
                    int number = Integer.parseInt(word);
                    sum += number;
                } catch (Exception e) {
                    continue;
                }
            }
            return String.valueOf(sum);
        } else if (query.contains("largest")) {
            String[] words = query.replace(",", "").split(" ");
            int max = -1;
            for (String word: words) {
                try {
                    int number = Integer.parseInt(word);
                    if (number > max) {
                        max = number;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
            return String.valueOf(max);
        }
//            add a new comment here, please don't remove
            return "";
    }
}
