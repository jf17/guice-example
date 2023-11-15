package ru.jf17.guice.example.config;

import com.google.inject.AbstractModule;
import ru.jf17.guice.example.repository.Database;
import ru.jf17.guice.example.repository.MySqlDatabase;

public class DatabaseInjector extends AbstractModule {
    @Override
    protected void configure() {
//        bind(Database.class).to(InMemoryDatabase.class);
        bind(Database.class).to(MySqlDatabase.class);
    }
}