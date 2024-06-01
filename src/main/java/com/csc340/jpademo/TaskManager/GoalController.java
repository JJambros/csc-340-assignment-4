package com.csc340.jpademo.TaskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goals")
public class GoalController {

    @Autowired
    GoalService goalService;

    @GetMapping("/all")
    public String getAllGoals(Model model) {
        model.addAttribute("goalList", goalService.getAllGoals());
        return "goal-list";
    }

    @GetMapping("/{id}")
    public String getGoalById(@PathVariable int id , Model model) {
        model.addAttribute("goal", goalService.getGoalById(id));
        return "goal-detail";
    }

    @GetMapping("/delete/{id}")
    public String deleteGoalById(@PathVariable int id) {
        goalService.deleteGoalById(id);
        return "redirect:/goals/all";
    }

    @GetMapping("/update/{id}")
    public String updateGoal(@PathVariable int id, Model model){
        model.addAttribute("goal", goalService.getGoalById(id));
        return "goal-update";
    }

    @PostMapping("/update")
    public String updateGoalAction(Goal goal) {
        goalService.updateGoalAction(goal);
        return "redirect:/goals/" + goal.getGoalId();
    }

    @PostMapping("/create")
    public String addNewGoal(Goal goal) {
        goalService.addNewGoal(goal);
        return "redirect:/goals/all";
    }
}
