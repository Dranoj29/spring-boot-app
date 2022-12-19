package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

public interface UserRepo extends JpaRepository<User, Long>{

	@Query("FROM User")
	Slice<User> findAllUserSlice(Pageable pageable);
	
	@Query("FROM User")
	List<User> findAllUserList(Pageable pageable);
	
	Optional<User> findByUsername(String username);
}
