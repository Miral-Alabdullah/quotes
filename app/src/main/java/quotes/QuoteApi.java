package quotes;

public class QuoteApi {
    private String quoteText;
    private String quoteAuthor;

    public QuoteApi(){

    }
    public QuoteApi(String quoteText, String quoteAuthor) {
        this();
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }

    @Override
    public String toString() {
        return  getQuoteText() +
                '\n' + "     -"+ getQuoteAuthor();
    }
}
