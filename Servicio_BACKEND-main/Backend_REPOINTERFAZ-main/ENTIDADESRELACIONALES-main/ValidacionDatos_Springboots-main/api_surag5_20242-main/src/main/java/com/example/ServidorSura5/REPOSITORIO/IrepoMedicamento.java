package com.example.ServidorSura5.REPOSITORIO;

import com.example.ServidorSura5.MODELOS.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IrepoMedicamento extends JpaRepository<Medicamento,Long>
{
}