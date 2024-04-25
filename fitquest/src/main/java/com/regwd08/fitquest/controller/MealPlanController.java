package com.regwd08.fitquest.controller;

import com.regwd08.fitquest.model.MealPlan;
import com.regwd08.fitquest.service.MealPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mealplans")

public class MealPlanController {
    
    private final MealPlanService mealPlanService;

    @Autowired
    public MealPlanController(MealPlanService mealPlanService) {
        this.mealPlanService = mealPlanService;
    }

    @GetMapping
    public ResponseEntity<List<MealPlan>> getAllMealPlans() {
        List<MealPlan> mealPlans = mealPlanService.findAll();
        return new ResponseEntity<>(mealPlans, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MealPlan> getMealPlanById(@PathVariable Long id) {
        return mealPlanService.findById(id)
                .map(mealPlan -> new ResponseEntity<>(mealPlan, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<MealPlan> createMealPlan(@RequestBody MealPlan mealPlan) {
        MealPlan newMealPlan = mealPlanService.save(mealPlan);
        return new ResponseEntity<>(newMealPlan, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MealPlan> updateMealPlan(@PathVariable Long id, @RequestBody MealPlan mealPlan) {
        return mealPlanService.findById(id)
                .map(existingMealPlan -> {
                    existingMealPlan.setName(mealPlan.getName());
                    // Update other fields
                    MealPlan updatedMealPlan = mealPlanService.save(existingMealPlan);
                    return new ResponseEntity<>(updatedMealPlan, HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMealPlan(@PathVariable Long id) {
        mealPlanService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
