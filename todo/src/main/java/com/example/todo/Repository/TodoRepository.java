package com.example.todo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo.Model.Todo;

public interface  TodoRepository extends JpaRepository<Todo, Long>{
//	public Todo findById(long Id);
}


