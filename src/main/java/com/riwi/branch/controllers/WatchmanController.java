package com.riwi.branch.controllers;

import com.riwi.branch.models.Watchman;
import com.riwi.branch.services.WatchmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WatchmanController {
    @Autowired
    private WatchmanService watchmanService;
    @GetMapping("/watchman")
    public List<Watchman> getWatchman(){
        return  watchmanService.getAllWatchmen();
    }
    @GetMapping("/watchman/{id}")
    public ResponseEntity<Watchman> getWatchmanById(String id){
        try{
            Watchman watchman = watchmanService.getWatchmanById(id);
            return new ResponseEntity<Watchman>(watchman, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<Watchman>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/watchman")
    public void saveWatchman(@RequestBody Watchman watchman){
        watchmanService.saveWatchman(watchman);
    }
    @PutMapping("/watchman/{id}")
    public ResponseEntity<?> updateWatchman(@PathVariable String id, @RequestBody Watchman watchman){
        try{
            Watchman currentWatchman = watchmanService.getWatchmanById(id);
            currentWatchman.setName(watchman.getName());
            currentWatchman.setGenre(watchman.getGenre());
            currentWatchman.setSalary(watchman.getSalary());
            currentWatchman.setPhoneNumber(watchman.getPhoneNumber());
            currentWatchman.setIdentificationNumber(watchman.getIdentificationNumber());

            watchmanService.saveWatchman(currentWatchman);

            return new ResponseEntity<>( HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/watchman/{id}")
    public ResponseEntity<?> deleteWatchman(@PathVariable String id){
        try {
            Watchman currentWatchman = watchmanService.getWatchmanById(id);
            watchmanService.deleteWatchman(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
