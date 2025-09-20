package com.placement.placementmanagementsystem.service;

import com.placement.placementmanagementsystem.entity.Placement;
import java.util.List;

public interface IPlacementService {
    Placement addPlacement(Placement placement);
    Placement updatePlacement(Placement placement);
    Placement searchPlacement(Long id);
    void cancelPlacement(Long id);
    List<Placement> getAllPlacements();
}