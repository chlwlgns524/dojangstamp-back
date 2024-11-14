package com.aiden.dojangstampback.domain.service;

import com.aiden.dojangstampback.domain.dto.StampDto;
import com.aiden.dojangstampback.domain.mapper.StampDtoMapper;
import com.aiden.dojangstampback.domain.repository.stamp.StampRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@RequiredArgsConstructor
@Service
public class StampService {

    private final StampRepository stampRepository;

    @Transactional(readOnly = true)
    public List<StampDto> findAllStamps() {
        return stampRepository.findAll().stream()
                .map(StampDtoMapper::mapToDto)
                .collect(Collectors.toList());
    }

}
