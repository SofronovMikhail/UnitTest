package com.example;

import java.util.HashMap;

public class RemoveTelephonePhoneBook {
    public void RemoveTelephone(HashMap<String, Integer> phoneBook, String name) {
        phoneBook.remove(name);
    }

}
