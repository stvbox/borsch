package com.example.monolith;

import com.example.cupboard.CupboardService;
import com.example.kitchener.KitchenConnector;
import com.example.refrigerator.RefrigeratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;

@Component
@RequiredArgsConstructor
public class KitchenConnectorMono implements KitchenConnector {

    private final CupboardService cupboardService;
    private final RefrigeratorService refrigeratorService;

    @Override
    public String getPot() throws URISyntaxException,
            IOException, InterruptedException {
        return cupboardService.getPot();
    }

    @Override
    public String getVegetables() throws URISyntaxException,
            IOException, InterruptedException {
        return refrigeratorService.getVegetables();
    }
}
