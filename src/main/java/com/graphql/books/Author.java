package com.graphql.books;

import java.util.Arrays;
import java.util.List;

public class Author {

    private String id;
    private String firstName;
    private String lastName;

    public Author(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Author() {
        this.id = "No encontrado";
        this.firstName = "No encontrado";
        this.lastName = "No encontrado";
    }

    private static List<Author> authors = Arrays.asList(
            new Author("author-1", "Joanne", "Rowling"),
            new Author("author-2", "Herman", "Melville"),
            new Author("author-3", "Anne", "Rice")
    );

    public static Author getById(String id) {
        return authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElseGet(Author::new);
    }

    public String getId() {
        return id;
    }
}
