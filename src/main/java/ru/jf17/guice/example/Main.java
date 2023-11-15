package ru.jf17.guice.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import ru.jf17.guice.example.config.DatabaseInjector;
import ru.jf17.guice.example.controller.MyController;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DatabaseInjector());
        MyController app = injector.getInstance(MyController.class);
        System.out.println(app.getDatabaseData());

    }
}
