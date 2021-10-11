package com.me.todothing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.todothing.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
}
