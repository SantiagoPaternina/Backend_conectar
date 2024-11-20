package com.example.ServidorSura5.REPOSITORIO;

import com.example.ServidorSura5.MODELOS.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IrepoPaciente extends JpaRepository<Paciente,Long>
{
}