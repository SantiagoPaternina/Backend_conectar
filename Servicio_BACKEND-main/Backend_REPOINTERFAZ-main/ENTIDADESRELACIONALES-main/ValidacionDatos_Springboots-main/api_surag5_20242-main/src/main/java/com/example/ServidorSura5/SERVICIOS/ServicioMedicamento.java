package com.example.ServidorSura5.SERVICIOS;
import com.example.ServidorSura5.MODELOS.Medicamento;
import com.example.ServidorSura5.MODELOS.Medico;
import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.REPOSITORIO.IrepoMedicamento;
import com.example.ServidorSura5.REPOSITORIO.IrepoMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioMedicamento
{
    //1. LLAMAR AL REPOSITORIO RESPECTIVO
    @Autowired
    IrepoMedicamento irepoMedicamento;


    //2. SE PROGRAMAN LAS FUNCIONES PARA LAS DISTINTAS OPERACIONES EN LA BASE DE DATOS

    //FUNCION PARA GUARDAR DATOS
    public Medicamento guardarMedicamento(Medicamento datosMedicamento)throws Exception{
        try{
            return irepoMedicamento.save(datosMedicamento);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<Medicamento> buscarMedicamento()throws Exception{
        try{
            return irepoMedicamento.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
