
package com.portafolio.csg.Service;

import com.portafolio.csg.Entity.Persona;
import com.portafolio.csg.Interface.IPersonaService;
import com.portafolio.csg.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersonas() {
       List<Persona> persona=ipersonaRepository.findAll();
       return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
       ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona=ipersonaRepository.findById(id).orElse(null);
       return persona;
    }
    
}
