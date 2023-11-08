package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;

import org.junit.Test;

public class AppTest {
    @Test
    public void UnitTestAddTelephone() {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        AddTelephonePhoneBook addTelephonePhoneBook = new AddTelephonePhoneBook();
        addTelephonePhoneBook.AddTelephone(phoneBook, "Mikhail", 1111);
        assertThat(phoneBook.get("Mikhail")).isEqualTo(1111);
    }

    @Test
    public void IntegretionTestAddTelephone() {
        PhoneBook phoneBook = new PhoneBook();
        AddTelephonePhoneBook addTelephonePhoneBook = new AddTelephonePhoneBook();
        HashMap result = phoneBook.CreatePhoneBook();
        addTelephonePhoneBook.AddTelephone(result, "Mikhail", 1111);
        assertThat(result.get("Mikhail")).isEqualTo(1111);
    }

    @Test
    public void UnitTestChangeTelephone() {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Mikhail", 1111);
        ChangeTelephonePhoneBook changeTelephonePhoneBook = new ChangeTelephonePhoneBook();
        changeTelephonePhoneBook.ChangeTelephone(phoneBook, "Mikhail", 2222);
        assertThat(phoneBook.get("Mikhail")).isEqualTo(2222);
    }

    @Test
    public void IntegretionTestChangeTelephone() {
        PhoneBook phoneBook = new PhoneBook();
        AddTelephonePhoneBook addTelephonePhoneBook = new AddTelephonePhoneBook();
        HashMap result = phoneBook.CreatePhoneBook();
        addTelephonePhoneBook.AddTelephone(result, "Mikhail", 1111);
        ChangeTelephonePhoneBook changeTelephonePhoneBook = new ChangeTelephonePhoneBook();
        changeTelephonePhoneBook.ChangeTelephone(result, "Mikhail", 2222);
        assertThat(result.get("Mikhail")).isEqualTo(2222);
    }

    @Test
    public void UnitTestRemoveTelephone() {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Mikhail", 1111);
        RemoveTelephonePhoneBook removeTelephonePhoneBook = new RemoveTelephonePhoneBook();
        removeTelephonePhoneBook.RemoveTelephone(phoneBook, "Mikhail");
        assertThat(phoneBook.size()).isEqualTo(0);
    }

    @Test
    public void IntegretionTestRemoveTelephone() {
        PhoneBook phoneBook = new PhoneBook();
        AddTelephonePhoneBook addTelephonePhoneBook = new AddTelephonePhoneBook();
        HashMap result = phoneBook.CreatePhoneBook();
        addTelephonePhoneBook.AddTelephone(result, "Mikhail", 1111);
        RemoveTelephonePhoneBook removeTelephonePhoneBook = new RemoveTelephonePhoneBook();
        removeTelephonePhoneBook.RemoveTelephone(result, "Mikhail");
        assertThat(result.size()).isEqualTo(0);
    }
}
