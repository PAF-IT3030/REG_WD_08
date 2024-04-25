package com.regwd08.fitquest.service;

import com.regwd08.fitquest.model.MealPlan;
import com.regwd08.fitquest.repository.MealPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MealPlanService {

    private final MealPlanRepository mealPlanRepository;

    @Autowired
    public MealPlanService(MealPlanRepository mealPlanRepository) {
        this.mealPlanRepository = mealPlanRepository;
    }

    public List<MealPlan> findAll() {
        return mealPlanRepository.findAll();
    }

    public Optional<MealPlan> findById(Long id) {
        return mealPlanRepository.findById(id);
    }

    public MealPlan save(MealPlan mealPlan) {
        return mealPlanRepository.save(mealPlan);
    }

    public void deleteById(Long id) {
        mealPlanRepository.deleteById(id);
    }
    
}
