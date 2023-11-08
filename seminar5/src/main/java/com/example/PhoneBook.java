package com.example;

import java.util.HashMap;

public class PhoneBook {

    public HashMap<String, Integer> CreatePhoneBook() {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        return phoneBook;
    }

    public int getKeyPhoneBook(HashMap<String, Integer> phoneBook, String name) {
        return phoneBook.get(name);
    }

}
