package com.example.ServidorSura5.REPOSITORIO;

import com.example.ServidorSura5.MODELOS.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IrepoMedico extends JpaRepository<Medico,Long>
{
}