package org.example.gettingStarted;

public class Client {

    private int age;

    private boolean isLogged;

    public Client(int age, boolean isLogged) {
        this.age = age;
        this.isLogged = isLogged;
    }

    public Client() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }
}
