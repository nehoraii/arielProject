package com.repository;

import com.entity.UsersEntity;
import com.entity.userEntityNehoraii;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<userEntityNehoraii, Long> {
    //List<userEntityNehoraii> findUsersEntityByUserNameContaining(String userName);
    @Query(value = "SELECT e FROM userEntityNehoraii e where e.name=:username")
    Optional<userEntityNehoraii> getByUserName(@Param("username") String userName);
}
