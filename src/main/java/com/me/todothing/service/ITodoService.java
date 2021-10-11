package com.me.todothing.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import com.me.todothing.model.Todo;

public interface ITodoService {

	List<Todo> getAllTodos();

	Optional<Todo> getTodoById(long id);

	void updateTodo(Todo todo);

	void addTodo(String desc, Date targetDate, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(Todo todo);

}