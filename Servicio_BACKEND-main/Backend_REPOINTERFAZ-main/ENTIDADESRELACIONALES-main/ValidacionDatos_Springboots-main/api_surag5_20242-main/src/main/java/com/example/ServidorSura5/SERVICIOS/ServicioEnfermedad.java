package com.example.ServidorSura5.SERVICIOS;
import com.example.ServidorSura5.MODELOS.Enfermedad;
import com.example.ServidorSura5.MODELOS.Medico;
import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.REPOSITORIO.IrepoEnfermedad;
import com.example.ServidorSura5.REPOSITORIO.IrepoMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEnfermedad
{
    //1. LLAMAR AL REPOSITORIO RESPECTIVO
    @Autowired
    IrepoEnfermedad irepoEnfermedad;


    //2. SE PROGRAMAN LAS FUNCIONES PARA LAS DISTINTAS OPERACIONES EN LA BASE DE DATOS

    //FUNCION PARA GUARDAR DATOS
    public Enfermedad guardarEnfermedad(Enfermedad datosEnfermedad)throws Exception{
        try{
            return irepoEnfermedad.save(datosEnfermedad);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<Enfermedad> buscarEnfermedad()throws Exception{
        try{
            return irepoEnfermedad.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
