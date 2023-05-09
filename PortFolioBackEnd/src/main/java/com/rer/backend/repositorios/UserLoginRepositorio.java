package com.rer.backend.repositorios;

import com.rer.backend.modelos.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepositorio extends JpaRepository<UserLogin,Long> {
}
