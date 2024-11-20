package com.example.ServidorSura5.REPOSITORIO;

import com.example.ServidorSura5.MODELOS.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface IrepoEnfermedad extends JpaRepository<Enfermedad,Long>
{
}

