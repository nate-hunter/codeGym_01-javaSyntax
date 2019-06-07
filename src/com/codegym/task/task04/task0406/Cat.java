package com.codegym.task.task04.task0406;

/* 
Name register

*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        this.fullName = fullName;
        System.out.println(this.fullName);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("String", "Cheese");
        System.out.println("This cat's name is: " + cat.fullName);
    }
}
