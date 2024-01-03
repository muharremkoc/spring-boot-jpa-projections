package com.spring.jpa.projections.repository;
import com.spring.jpa.projections.domain.User;
import com.spring.jpa.projections.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<UserDto> findAllBy();

    <T> T findById(int id, Class<T> type);

}
