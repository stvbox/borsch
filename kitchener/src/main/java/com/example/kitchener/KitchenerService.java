package com.example.kitchener;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;

@Service
public class KitchenerService {

    private final KitchenConnector kitchenConnector;


    public KitchenerService(KitchenConnector kitchenConnector) {
        this.kitchenConnector = kitchenConnector;
    }

    public String cookBorscht() throws URISyntaxException, IOException, InterruptedException {
        String pot = kitchenConnector.getPot();
        String vegetables = kitchenConnector.getVegetables();

        return String.format("%s + %s = БОРЩ",
                pot, vegetables);
    }
}
