package java_8;


import java_8.data.Author;
import java_8.data.Book;

import java.util.Collections;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalDemo {

    public static void main(String[] args) {

        String str = "arghya";

        Optional.ofNullable(str).ifPresentOrElse(data -> System.out.println(data+ " me"), () -> System.out.println("its null"));


        String s = Optional.ofNullable(str).orElseGet(() -> getSomething());

        System.out.println(s);

        String s1 = Optional.ofNullable(str).orElse(getSomething());

        System.out.println(s1);


//        if(Optional.ofNullable(str).isPresent()) {
//
//        }

        Author author = new Author("auth1", "1234", new Book(null));


        if(author.getBook()!=null) {
            if(author.getBook().getBookName()!=null) {

            }
        }

        String taggedBook = Optional.ofNullable(author)
                .map(author1 -> author1.getBook())
                .map(book -> book.getBookName())
                .map(name -> name + "some tag")
                .orElseThrow(()-> new RuntimeException("my exception"));

        System.out.println(taggedBook);
    }

    private static String getSomething() {

        System.out.println("getSomething..");

        return "Default string";

    }
}
