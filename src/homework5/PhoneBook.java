package homework5;

import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    private HashMap<String, ArrayList<String>> book;


    public PhoneBook() {
        book = new HashMap();
    }

    public void addBook(String name, String number) {
        ArrayList<String> numbers;
        if (book.containsKey(name)) {
            numbers =book.get(name);
        }else {
            numbers = new ArrayList<String>();
        }
        numbers.add(number);
        book.put(name, numbers);
    }

    public void get(String name){
        if (book.containsKey(name)){
            System.out.println(name + ": " + book.get(name));
        }else{
            System.out.println("Такого контакта не существует");
        }
    }

    public  void getAll(){
        for(String name : book.keySet()){
            System.out.println(name + ": " + book.get(name));
        }
    }
}


