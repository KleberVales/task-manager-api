package com.kleber.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kleber.taskmanager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
