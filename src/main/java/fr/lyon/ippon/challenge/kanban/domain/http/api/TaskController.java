package fr.lyon.ippon.challenge.kanban.domain.http.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.lyon.ippon.challenge.kanban.domain.Task;

@RestController("/")
public class TaskController {

	@GetMapping
	public List<Task> getTasks() {
		return List.of(new Task("my first task"));
	}
}
