package bookcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BookCollectionManager {
    private List<BookCollection> collections;


    public BookCollection createCollection(String name){
        collections.add(new BookCollection(name));
        return collections.get(collections.size() - 1);
    }

    public BookCollection getCollectionByName(String name){
        while (collections.iterator().hasNext()){
            BookCollection collection = collections.iterator().next();
            String comparation = collection.getName();
            if(comparation.equals(name)){
                return collection;
            }
        }
        return null;
    }

    public void deleteCollectionByName(String name){
        while (collections.iterator().hasNext()){
            BookCollection collection = collections.iterator().next();
            String comparation = collection.getName();
            if(comparation.equals(name)){
                collections.remove(collection);
            }
        }
    }

    public void AddBookToCollection(String CollectionName, Book book){
        while (collections.iterator().hasNext()){
            BookCollection collection = collections.iterator().next();
            String comparation = collection.getName();
            if(comparation.equals(CollectionName)){
                collection.addBook(book);
                return;
            }
        }
        BookCollection newCollection = createCollection(CollectionName);
        newCollection.addBook(book);
    }
    public List<String> getCollectionNames(){
        List<String> names = new ArrayList<String>();
        while (collections.iterator().hasNext()){
            names.add(collections.iterator().next().getName());
        }
        return names;
    }
}
