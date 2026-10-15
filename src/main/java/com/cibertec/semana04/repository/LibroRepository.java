package com.cibertec.semana04.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.semana04.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findByEditorialIdEditorial(Long idEditorial);

    List<Libro> findByNombreContaining(String nombre);
    
    List<Libro> findByNombreContainingIgnoreCaseOrAutorContainingIgnoreCase(
            String nombre, String autor);
    
    List<Libro> findByNombreContainingIgnoreCase(String nombre);

    List<Libro> findByAutorContainingIgnoreCase(String autor);

}