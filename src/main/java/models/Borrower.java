package models;
import models.Book;

import java.util.Set;


    public class Borrower {

        private int id;
        private String name;
        private Set<Book> itemsBorrowed;

        public Borrower() {}

        public Borrower(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public Set<Book> getItemsBorrowed() {
            return itemsBorrowed;
        }
        public void setItemsBorrowed(Set<Book> itemsBorrowed) {
            this.itemsBorrowed = itemsBorrowed;
        }



    }

