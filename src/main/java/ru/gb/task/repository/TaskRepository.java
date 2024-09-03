package ru.gb.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.task.model.Priority;
import ru.gb.task.model.Status;
import ru.gb.task.model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStatus(Status status);

    Task findByPriority(Priority priority);

    Task findByAuthorId(Long authorId);

    List<Task> findByUserId(Long assigneeId);

    Task findByStatusAndPriority(Status status, Priority priority);

    Task findByStatusAndPriorityAndAuthorId(Status status, Priority priority, Long authorId);

    Task findByStatusAndPriorityAndAssigneeId(Status status, Priority priority, Long assigneeId);
}
