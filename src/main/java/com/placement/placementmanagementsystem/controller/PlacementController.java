package com.placement.placementmanagementsystem.controller;

import com.placement.placementmanagementsystem.entity.Placement;
import com.placement.placementmanagementsystem.service.IPlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/placements") // Base URL for all endpoints in this controller
public class PlacementController {

    @Autowired
    private IPlacementService placementService;

    // POST - Create a new placement
    @PostMapping("/")
    public ResponseEntity<Placement> addPlacement(@RequestBody Placement placement) {
        Placement newPlacement = placementService.addPlacement(placement);
        return new ResponseEntity<>(newPlacement, HttpStatus.CREATED);
    }

    // GET - Get all placements
    @GetMapping("/")
    public ResponseEntity<List<Placement>> getAllPlacements() {
        List<Placement> placements = placementService.getAllPlacements();
        return new ResponseEntity<>(placements, HttpStatus.OK);
    }

    // GET - Get a single placement by ID
    @GetMapping("/{id}")
    public ResponseEntity<Placement> getPlacementById(@PathVariable Long id) {
        Placement placement = placementService.searchPlacement(id);
        return new ResponseEntity<>(placement, HttpStatus.OK);
    }

    // DELETE - Cancel a placement
    @DeleteMapping("/{id}")
    public ResponseEntity<String> cancelPlacement(@PathVariable Long id) {
        placementService.cancelPlacement(id);
        return new ResponseEntity<>("Placement with ID " + id + " has been deleted.", HttpStatus.OK);
    }
}