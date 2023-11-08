package com.example;

import java.util.HashMap;

public class AddTelephonePhoneBook {

    public void AddTelephone(HashMap<String, Integer> phoneBook, String name, Integer telephone) {
        phoneBook.put(name, telephone);
    }
}
