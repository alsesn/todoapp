package me.alsesn.todoapp.controller;

import lombok.RequiredArgsConstructor;
import me.alsesn.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TodoController {
    private final TodoRepository todoRepository;

    @GetMapping({"", "/", "/home"})
    public String showHomePage(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "index";
    }
}