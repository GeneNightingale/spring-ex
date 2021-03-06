package com.me.todothing.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.me.todothing.model.Todo;
import com.me.todothing.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements ITodoService {

	@Autowired
	private TodoRepository todoRepository;

	@Override
	public List<Todo> getAllTodos() {
		return todoRepository.findAll();
	}

	@Override
	public Optional<Todo> getTodoById(long id) {
		return todoRepository.findById(id);
	}

	@Override
	public void updateTodo(Todo todo) {
		todoRepository.save(todo);
	}

	@Override
	public void addTodo(String desc, Date targetDate, boolean isDone) {
		todoRepository.save(new Todo(desc, targetDate, isDone));
	}

	@Override
	public void deleteTodo(long id) {
		Optional<Todo> todo = todoRepository.findById(id);
		todo.ifPresent(value -> todoRepository.delete(value));
	}

	@Override
	public void saveTodo(Todo todo) {
		todoRepository.save(todo);
	}
}