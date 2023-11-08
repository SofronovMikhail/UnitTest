package com.example;

import java.util.HashMap;

public class ChangeTelephonePhoneBook {
    public void ChangeTelephone(HashMap<String, Integer> phoneBook, String name, Integer newTelephone) {
        phoneBook.replace(name, newTelephone);
    }
}
