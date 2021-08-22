package org.doublem.bookstore.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@ToString
@Builder
public class Book {

    @Id
    public String id;

    public String title;
    public String author;
    public String publisher;
    public String subject;
    public String price;
}
