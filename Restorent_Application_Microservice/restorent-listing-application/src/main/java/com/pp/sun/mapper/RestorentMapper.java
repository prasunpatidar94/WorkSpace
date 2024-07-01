package com.pp.sun.mapper;

import com.pp.sun.dto.RestorentDTO;
import com.pp.sun.entity.RestorentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestorentMapper {
    RestorentMapper INSTANCE = Mappers.getMapper(RestorentMapper.class);
    RestorentEntity mapRestorentDTOToRestorentEntity(RestorentDTO restorentDTO);
    RestorentDTO mapRestorentEntityToRestorentDTO(RestorentEntity restorentEntity);
}
