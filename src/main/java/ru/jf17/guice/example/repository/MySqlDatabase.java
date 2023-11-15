package ru.jf17.guice.example.repository;

import com.google.inject.Singleton;

@Singleton
public class MySqlDatabase implements Database {
    @Override
    public String getData() {
        return "data from MySqlDatabase";
    }
}
