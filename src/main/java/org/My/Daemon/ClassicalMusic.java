package org.My.Daemon;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class ClassicalMusic implements Music{

    List<String> listOfClassic = new ArrayList<>();
    {
        listOfClassic.add("True story of the Bird");
        listOfClassic.add("Many changes");
        listOfClassic.add("Lar de' fa'un");
    }

    public void doMyInit(){
        System.out.println("Doing my initialisaition");
    }
    public void doMyDestroy(){
        System.out.println("Lord of Destruction");
    }
    @Override
    public List<String> getSong() {
        return listOfClassic;
    }
}
