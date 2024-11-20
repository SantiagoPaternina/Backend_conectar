package com.example.ServidorSura5.SERVICIOS;
import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.MODELOS.SignoVital;
import com.example.ServidorSura5.REPOSITORIO.IrepoSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioSignoVital
{
    //1. LLAMAR AL REPOSITORIO RESPECTIVO
    @Autowired
    IrepoSignoVital irepoSignoVital;


    //2. SE PROGRAMAN LAS FUNCIONES PARA LAS DISTINTAS OPERACIONES EN LA BASE DE DATOS

    //FUNCION PARA GUARDAR DATOS
    public SignoVital guardarSignoVital(SignoVital datosSignoVital)throws Exception{
        try{
           return irepoSignoVital.save(datosSignoVital);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<SignoVital> buscarSignoVital()throws Exception{
        try{
            return irepoSignoVital.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
