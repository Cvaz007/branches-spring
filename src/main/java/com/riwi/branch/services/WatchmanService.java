package com.riwi.branch.services;

import com.riwi.branch.models.Watchman;
import com.riwi.branch.repository.WatchmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchmanService {
    @Autowired
    private WatchmanRepository watchmanRepository;

    public List<Watchman> getAllWatchmen(){
        return watchmanRepository.findAll();
    }

    public Watchman getWatchmanById(String id){
        return watchmanRepository.findById(id).get();
    }

    public void saveWatchman(Watchman watchman){
        watchmanRepository.save(watchman);
    }

    public void deleteWatchman(String id){
        watchmanRepository.deleteById(id);
    }
}
