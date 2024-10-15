package br.com.miguel.todolist.task;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/tasks")
public class TaskController {
  
  @Autowired
  private ITaskRepository taskRepository;

  @PostMapping("/")
  public ResponseEntity create(@RequestBody TaskModel taskModel, HttpServletRequest request) {
    var idUser = request.getAttribute("idUser");
    taskModel.setIdUser((UUID) idUser);

    var currentDate = LocalDateTime.now();
    // 10/11/2024 - Current;
    // 10/10/2024 - StartAt;
    if (currentDate.isAfter(taskModel.getStartAt()) || currentDate.isAfter(taskModel.getEndAt())) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body("A data de inicio / data de término deve ser maior do que a data atual");
    }

    if (taskModel.getStartAt().isAfter(taskModel.getEndAt())) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body("A data de inicio deve ser menor do que a data de término");
    }

    var task = this.taskRepository.save(taskModel);
    return ResponseEntity.status(HttpStatus.OK).body(task);
  }
  
  @GetMapping("/")
  public List<TaskModel> list(HttpServletRequest request) {
    var idUser = request.getAttribute("idUser");
    var tasks = this.taskRepository.findByIdUser((UUID) idUser);
    return tasks;
  }

  // http>//localhost:8080/tasks/480b5442-aec9-477a-85fd-05f835e77faa
  @PutMapping("/{id}")
  public TaskModel update(@RequestBody TaskModel taskModel, HttpServletRequest request, @PathVariable UUID id) {
    
    taskModel.setId(id);
    return this.taskRepository.save(taskModel);
  }
}
