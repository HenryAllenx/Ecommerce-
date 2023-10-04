package com.example.Json;

public class Clients {
    private String fullname;
    private String address;
    private String email;
    private String sex;
    private double cpf;
    private double balance;
    private double age;
    private double cep;

    public Clients(String fullname, String address, String email, String sex, double cpf, double balance, double age,
            double cep) {
        this.fullname = fullname;
        this.address = address;
        this.email = email;
        this.sex = sex;
        this.cpf = cpf;
        this.balance = balance;
        this.age = age;
        this.cep = cep;
    }
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getCep() {
        return cep;
    }

    public void setCep(double cep) {
        this.cep = cep;
    }
}
