package com.renchi.watchlist.controller;

import com.renchi.watchlist.model.Watchlist;
import com.renchi.watchlist.repo.WatchlistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/watchlist")
public class WatchlistController {

    @Autowired
    WatchlistRepo watchlistRepo;

    @PostMapping("/update")
    public void updateWatchlist(@RequestBody Watchlist watchlist) {
        watchlistRepo.saveWatchlist(watchlist);
    }

    @GetMapping("/fetch")
    public Watchlist updateWatchlist(@RequestParam String userId ) {
        return watchlistRepo.getWatchlistById(userId);
    }
}
