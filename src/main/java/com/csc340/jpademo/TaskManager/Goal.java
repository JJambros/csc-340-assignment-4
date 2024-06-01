package com.csc340.jpademo.TaskManager;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.sql.Date;

@Entity
@Table(name = "goals")
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goal_id")
    private int goalId;

    @Column(name = "user_id")
    private int userId;

    @NonNull
    private String title;

    private String details;

    @NonNull
    @Column(name = "target_date")
    private Date targetDate;

    @NonNull
    private String status;

    public Goal() {
    }

    public Goal(int goalId, int userId, @NonNull String title, String details, @NonNull Date targetDate, @NonNull String status) {
        this.goalId = goalId;
        this.userId = userId;
        this.title = title;
        this.details = details;
        this.targetDate = targetDate;
        this.status = status;
    }


    public int getGoalId() {
        return goalId;
    }

    public int getUserId() {
        return userId;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    @NonNull
    public Date getTargetDate() {
        return targetDate;
    }

    @NonNull
    public String getStatus() {
        return status;
    }

    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setTargetDate(@NonNull Date targetDate) {
        this.targetDate = targetDate;
    }

    public void setStatus(@NonNull String status) {
        this.status = status;
    }
}
