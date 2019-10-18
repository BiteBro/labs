package ru.avalon.java.dev.j10.labs.commons;

/*
 * TODO(Студент): Создайте класс Address.
 *
 *
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */

public class Address {
    private String postcode;
    private String personAddress;

    public Address(String address, String postcode) {
        this.postcode = postcode;
        this.personAddress = address;
    }

    public String toString() {
       if(postcode == null && personAddress == null) {
           return "Postcode and Address have not be set!";
       }
        return "Postcode: " + postcode + "  Address: " + personAddress;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
