import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexTwo {

    public void errorLogs(){

        try {
            String file = Files.readString(Paths.get("sample.txt"));
            Pattern pattern = Pattern.compile(".+\\sInvalid\\spassword");
            Matcher matcher = pattern.matcher(file);

            while(matcher.find()){
                System.out.println(matcher.group());
            }

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public void actionPassword(){

        try {
            String file = Files.readString(Paths.get("sample.txt"));
            Pattern pattern = Pattern.compile(".+(?=password).+");
            Matcher matcher = pattern.matcher(file);

            while(matcher.find()){
                System.out.println(matcher.group());
            }

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public void backReferences(){

        try {
            // [2025-01-07 14:34:15] INFO  User: JohnDoe, Ac on: Viewed profile
            String file = Files.readString(Paths.get("sample.txt"));
            Pattern pattern = Pattern.compile("(?s)(.+User:\\sJohnDoe,\\s\\w+:\\sViewed\\sprofile.+)\\1");
//            Pattern pattern = Pattern.compile("(?s)(.+Action:\\s\\w+.+)\\1");
            Matcher matcher = pattern.matcher(file);

            while(matcher.find()){
                System.out.println(matcher.group());
            }

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public void capturingGroups(){

        try {
            String file = Files.readString(Paths.get("sample.txt"));
            Pattern pattern = Pattern.compile(".*([A-Za-z]\\sUser:\\s[A-Za-z]+,\\s)(Action:\\s[A-Za-z]+\\s[A-Za-z]+)");
            Matcher matcher = pattern.matcher(file);

            while(matcher.find()){
                System.out.println(matcher.group());
            }

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        RegexTwo rt = new RegexTwo();
        // rt.errorLogs();
        System.out.println();
        // rt.actionPassword();
        System.out.println();
        rt.backReferences();
        System.out.println();
       //  rt.capturingGroups();

    }
}