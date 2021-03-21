package com.company;

import java.util.ArrayList;

 public class Book{
   private String title;
   private String author;
   private int publishedDate;
   private String publisher;

    public Book(String title, String author, int publishedDate, String publisher) {
       this.title = title;
       this.author = author;
       this.publishedDate = publishedDate;
       this.publisher = publisher;
    }

    private boolean isAvailable;

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   void setAvailable(boolean available) {

      isAvailable = available;
   }

   public boolean isAvailable() {
      return isAvailable;
   }

   public int getPublishedDate() {
      return publishedDate;
   }

   public void setPublishedDate(int publishedDate) {
      this.publishedDate = publishedDate;
   }


   public String getPublisher() {
      return publisher;
   }

   public void setPublisher(String publisher) {
      this.publisher = publisher;
   }

   @Override
   public String toString() {
      return ("Title: " + getTitle() +
              "\nAuthor: " + getAuthor() +
              "\nPublished Date: " + publishedDate +
              "\nPublisher: " + publisher);
   }
}
