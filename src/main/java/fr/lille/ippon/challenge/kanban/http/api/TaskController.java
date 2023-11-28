package fr.lille.ippon.challenge.kanban.http.api;

import java.util.List;

import fr.lille.ippon.challenge.kanban.domain.Task;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class TaskController {

    @GetMapping
    public List<Task> getTasks() {
        // TODO faire fonctionner. Refactorer ?
        return List.of(new Task("my first task"));
    }
    
}
