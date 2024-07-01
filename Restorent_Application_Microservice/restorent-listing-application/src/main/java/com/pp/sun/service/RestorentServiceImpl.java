package com.pp.sun.service;

import com.pp.sun.dto.RestorentDTO;
import com.pp.sun.entity.RestorentEntity;
import com.pp.sun.mapper.RestorentMapper;
import com.pp.sun.repogitory.RestorentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestorentServiceImpl implements RestorentService {

    @Autowired
    private RestorentRepo restorentRepo;


    @Override
    public RestorentDTO saveRestorent(RestorentDTO restorentDTO) {
        Optional<RestorentEntity> restorentEntity = Optional.of(restorentRepo.save(RestorentMapper.INSTANCE.mapRestorentDTOToRestorentEntity(restorentDTO)));
        if (restorentEntity.isPresent()) {
            return RestorentMapper.INSTANCE.mapRestorentEntityToRestorentDTO(restorentEntity.get());
        } else {
            return null;
        }
    }

    @Override
    public List<RestorentDTO> getRestorents() {

        Optional<List<RestorentEntity>> restorentEntitys = Optional.of(restorentRepo.findAll());
        if (restorentEntitys.isPresent()) {
            List<RestorentDTO> restorentDTOS = restorentEntitys.get().stream().map(restorentEntity -> RestorentMapper.INSTANCE.mapRestorentEntityToRestorentDTO(restorentEntity)).toList();
            return restorentDTOS;
        } else {
            return null;
        }
    }
}
