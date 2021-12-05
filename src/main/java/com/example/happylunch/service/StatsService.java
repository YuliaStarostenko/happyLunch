package com.example.happylunch.service;

import com.example.happylunch.model.view.StatsView;

public interface StatsService {
    void onRequest();
    StatsView getStats();
}
