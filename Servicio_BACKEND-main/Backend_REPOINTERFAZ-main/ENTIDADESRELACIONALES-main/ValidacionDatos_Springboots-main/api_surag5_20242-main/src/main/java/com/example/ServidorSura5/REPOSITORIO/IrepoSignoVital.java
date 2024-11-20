package com.example.ServidorSura5.REPOSITORIO;
import com.example.ServidorSura5.MODELOS.SignoVital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IrepoSignoVital extends JpaRepository<SignoVital,Long>
{

}