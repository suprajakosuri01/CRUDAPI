package com.RestApiexample.CrudAPI.Repo;

import com.RestApiexample.CrudAPI.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
