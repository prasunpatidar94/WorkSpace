package com.pp.sun.service;

import com.pp.sun.dto.RestorentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestorentService {
    List<RestorentDTO> getRestorents();

    RestorentDTO saveRestorent(RestorentDTO restorentDTO);
}
