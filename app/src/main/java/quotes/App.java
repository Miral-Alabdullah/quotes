/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(new App().getGreeting());
        Random randomNumber = new Random();
        int randomNum = randomNumber.nextInt(138);
        System.out.println(getQuote(randomNum));

    }


    public static String getQuote(int randomNum) throws FileNotFoundException {
        Gson gson = new Gson();
        String root = System.getProperty("user.dir");
        String filePath = root+File.separator+"app/src/main/resources/recentquotes.json";
        Scanner readFile = new Scanner(new File(filePath));
        StringBuilder quotes = new StringBuilder();
        while(readFile.hasNextLine()){
            quotes.append(readFile.nextLine());
        }
        Quote[] allQuotes = gson.fromJson(quotes.toString(), Quote[].class);
        return allQuotes[randomNum].toString();
    }
}
