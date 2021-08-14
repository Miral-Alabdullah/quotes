/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


public class AppTest {
    @Test public void constructorFromApi(){
        QuoteApi quoteApi = new QuoteApi();
        assertTrue(quoteApi instanceof QuoteApi);
    }
    @Test public void getAQuoteFromApi() {
        String url = "http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en";
        assertNotNull(App.getQuoteFroAPI(url));
    }

    @Test public void constructorFromGson(){
        Quote quote = new Quote();
        assertTrue(quote instanceof Quote);
    }
    @Test public void getAQuoteFromJson() throws FileNotFoundException {
        Gson gson = new Gson();
        Random randomNumber = new Random();
        int randomNum = randomNumber.nextInt(1);
        Scanner readFile = new Scanner(new File("../recentquotes.json"));
        StringBuilder quotes = new StringBuilder();
        while (readFile.hasNextLine()) {
            quotes.append(readFile.nextLine());
        }
        Quote[] allQuotes = gson.fromJson(quotes.toString(), Quote[].class);
        assertEquals(" “I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.” \n" +
                "     -Marilyn Monroe",allQuotes[randomNum].toString());
    }

}
