package com.example.EjerJugadores.dao;

import com.example.EjerJugadores.modelo.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
