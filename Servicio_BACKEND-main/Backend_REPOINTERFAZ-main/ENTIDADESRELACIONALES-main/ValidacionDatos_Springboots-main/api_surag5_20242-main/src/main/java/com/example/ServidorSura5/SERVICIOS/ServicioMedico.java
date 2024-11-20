package com.example.ServidorSura5.SERVICIOS;
import com.example.ServidorSura5.MODELOS.Medico;
import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.MODELOS.SignoVital;
import com.example.ServidorSura5.REPOSITORIO.IrepoMedico;
import com.example.ServidorSura5.REPOSITORIO.IrepoSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioMedico
{
    //1. LLAMAR AL REPOSITORIO RESPECTIVO
    @Autowired
    IrepoMedico irepoMedico;


    //2. SE PROGRAMAN LAS FUNCIONES PARA LAS DISTINTAS OPERACIONES EN LA BASE DE DATOS

    //FUNCION PARA GUARDAR DATOS
    public Medico guardarMedico(Medico datosMedico)throws Exception{
        try{
            return irepoMedico.save(datosMedico);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<Medico> buscarMedico()throws Exception{
        try{
            return irepoMedico.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}

