package com.example.ServidorSura5.SERVICIOS;
import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.MODELOS.SignoVital;
import com.example.ServidorSura5.REPOSITORIO.IrepoPaciente;
import com.example.ServidorSura5.REPOSITORIO.IrepoSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPaciente
{
    //1. LLAMAR AL REPOSITORIO RESPECTIVO
    @Autowired
    IrepoPaciente irepoPaciente;


    //2. SE PROGRAMAN LAS FUNCIONES PARA LAS DISTINTAS OPERACIONES EN LA BASE DE DATOS

    //FUNCION PARA GUARDAR DATOS
    public Paciente guardarPaciente(Paciente datosPaciente)throws Exception{
        try{
            return irepoPaciente.save(datosPaciente);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<Paciente>buscarPaciente()throws Exception{
        try{
            return irepoPaciente.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
