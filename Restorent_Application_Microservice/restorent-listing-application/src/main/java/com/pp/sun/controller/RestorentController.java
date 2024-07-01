package com.pp.sun.controller;

import com.pp.sun.dto.RestorentDTO;
import com.pp.sun.service.RestorentService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Restorent/")
@NoArgsConstructor
public class RestorentController {

    private RestorentService restorentService;
    @Autowired
    RestorentController(RestorentService restorentService){
        this.restorentService=restorentService;
    }

    @GetMapping(value = "/get/restorents/")
    public ResponseEntity<?> getRestorents() {
        return ResponseEntity.ok(restorentService.getRestorents());
    }

    @PostMapping(value = "/save/restorent/")
    public ResponseEntity<?> saveRestorent(@RequestBody RestorentDTO restorentDTO) {
        return ResponseEntity.ok(restorentService.saveRestorent(restorentDTO));
    }



}
