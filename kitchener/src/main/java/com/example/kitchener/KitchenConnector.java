package com.example.kitchener;

import java.io.IOException;
import java.net.URISyntaxException;

public interface KitchenConnector {

    String getPot() throws URISyntaxException,
            IOException, InterruptedException;

    public String getVegetables() throws URISyntaxException,
            IOException, InterruptedException;
}