package org.My.Daemon;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
private List<String> listOfRock = new ArrayList<>();
    {
        listOfRock.add("Bourne in Hell");
        listOfRock.add("Share the Death");
        listOfRock.add("Common bones");
    }
@Override
    public List<String> getSong() {
        return listOfRock;
    }
}
