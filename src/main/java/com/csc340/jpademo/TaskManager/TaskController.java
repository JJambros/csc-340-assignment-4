package com.csc340.jpademo.TaskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;
    GoalService goalService;

    @GetMapping("/all")
    public String getAllTasks(Model model) {
        model.addAttribute("taskList", taskService.getAllTasks());
        return "task-list";
    }

    @GetMapping("/{id}")
    public String getTaskById(@PathVariable int id , Model model) {
        model.addAttribute("task", taskService.getTaskById(id));
        return "task-detail";
    }

    @GetMapping("/delete/{id}")
    public String deleteTaskById(@PathVariable int id) {
        taskService.deleteTaskById(id);
        return "redirect:/tasks/all";
    }

    @GetMapping("/update/{id}")
    public String updateTask(@PathVariable int id, Model model){
        model.addAttribute("task", taskService.getTaskById(id));
        return "task-update";
    }

    @PostMapping("/update")
    public String updateTaskAction(Task task) {
        taskService.updateTaskAction(task);
        return "redirect:/tasks/" + task.getTaskId();
    }

    @PostMapping("/create")
    public String addNewTask(Task task) {
        taskService.addNewTask(task);
        return "redirect:/tasks/all";
    }

}
