package com.placement.placementmanagementsystem.service;

import com.placement.placementmanagementsystem.entity.Placement;
import com.placement.placementmanagementsystem.repository.IPlacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlacementServiceImpl implements IPlacementService {

    @Autowired
    private IPlacementRepository placementRepository;

    @Override
    public Placement addPlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    @Override
    public Placement updatePlacement(Placement placement) {
        // save() method works for both creating and updating
        return placementRepository.save(placement);
    }

    @Override
    public Placement searchPlacement(Long id) {
        Optional<Placement> placementOptional = placementRepository.findById(id);
        // Handle case where placement is not found
        return placementOptional.orElseThrow(() -> new RuntimeException("Placement not found with id: " + id));
    }

    @Override
    public void cancelPlacement(Long id) {
        placementRepository.deleteById(id);
    }

    @Override
    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }
}