package com.java.ee.capadatos;

import java.util.List;
import com.java.ee.capadatos.domain.Persona;

public interface PersonaDao {

    void insertPersona(Persona persona);

    void updatePersona(Persona persona);

    void deletePersona(Persona persona);

    Persona findPersonaById(long idPersona);

    List<Persona> findAllPersonas();

    long contadorPersonas();

    Persona getPersonaByEmail(Persona persona);
    
}
