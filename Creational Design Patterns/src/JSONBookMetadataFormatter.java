import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONArray jsonArray;
    
    public JSONBookMetadataFormatter() {
        reset();
    }
    
    @Override
    public BookMetadataFormatter reset() {
        jsonArray = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject bookObject = new JSONObject();
        bookObject.put(Book.Metadata.ISBN.value, b.getISBN());
        bookObject.put(Book.Metadata.TITLE.value, b.getTitle());
        bookObject.put(Book.Metadata.PUBLISHER.value, b.getPublisher());
        
        JSONArray authors = new JSONArray();
        for (String author : b.getAuthors()) {
            authors.add(author);
        }
        bookObject.put(Book.Metadata.AUTHORS.value, authors);
        jsonArray.add(bookObject);
        
        return this;
    }

    @Override
    public String getMetadataString() {
        return jsonArray.toString();
    }
}