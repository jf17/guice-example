package ru.jf17.guice.example.controller;

import com.google.inject.Inject;
import ru.jf17.guice.example.repository.Database;

public class MyController {
    private final Database db;

    @Inject
    public MyController(final Database db) {
        this.db = db;
    }

    public String getDatabaseData() {
        return db.getData();
    }
}
