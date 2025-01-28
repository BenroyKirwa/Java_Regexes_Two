package com.backreference;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackReference {

    public static void main(String[] args) {

        try {
            // [2025-01-07 14:34:15] INFO  User: JohnDoe, Ac on: Viewed profile
            String file = Files.readString(Paths.get("sampletwo.txt"));
//            Pattern pattern = Pattern.compile("(?s)(\\w+.+)\\1");
            Pattern pattern = Pattern.compile("(?s)(.+)\\1");
            Matcher matcher = pattern.matcher(file);

            while(matcher.find()){
                System.out.println(matcher.group());
            }

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
