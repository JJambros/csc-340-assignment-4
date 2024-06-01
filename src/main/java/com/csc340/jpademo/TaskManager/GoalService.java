package com.csc340.jpademo.TaskManager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalService {

    @Autowired
    GoalRepository goalRepository;

    public Object getAllGoals() {
        return goalRepository.findAll();
    }

    public Goal getGoalById(int id) {
        return goalRepository.findById(id).orElse(null);
    }

    public void deleteGoalById(int id) {
        goalRepository.deleteById(id);
    }

    public Goal updateGoal(int id) { return goalRepository.findById(id).orElse(null); }

    public void updateGoalAction(Goal goal) { goalRepository.save(goal); }

    public void addNewGoal(Goal goal) {
        goalRepository.save(goal);
    }
}