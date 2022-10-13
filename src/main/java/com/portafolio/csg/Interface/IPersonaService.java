package com.portafolio.csg.Interface;

import com.portafolio.csg.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de persona
    public List<Persona> getPersonas();
    
    //guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
            
    //Eliminar un Objeto por ID
    public void deletePersona(Long id);
    
    //buscar una persona por ID
    public Persona findPersona(Long id);
}
