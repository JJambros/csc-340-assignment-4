package com.csc340.jpademo.TaskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public Object getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(int id) {
        return taskRepository.findById(id).orElse(null);
    }

    public void deleteTaskById(int id) {
        taskRepository.deleteById(id);
    }

    public Task updateTask(int id) { return taskRepository.findById(id).orElse(null); }

    public void updateTaskAction(Task task) { taskRepository.save(task); }

    public void addNewTask(Task task) {
        taskRepository.save(task);
    }

    public List<Task> getTasksByGoalId(int goalId) { return taskRepository.findByGoal_GoalId(goalId); }
}
