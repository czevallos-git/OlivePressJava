package com.example.java;
import java.util.ArrayList;
import java.util.List;

import com.example.java.model.Kalamata;
import com.example.java.model.Ligurian;
import com.example.java.model.Olive;

public class Main {

    public static void main(String[] args) {
        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        Press press = new OlivePress();
        press.setOil(5);
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil is " + totalOil);

    }

}