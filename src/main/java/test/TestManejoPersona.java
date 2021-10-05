package test;

import datos.PersonaDAO;

import dominio.Persona;
import java.util.*;

public class TestManejoPersona {

    public static void main(String[] args) {

        PersonaDAO personaDao = new PersonaDAO();
       
       
//       Insertando un nuevo objeto de tipo persona
//       Persona persona2 = new Persona("Diego","Gonzalez","DGonzalez@gmial.com","121314115");
//       personaDao.insertar(persona2);
//        Persona personaModificar = new Persona(1,"Silvia Lorena","Carcamo","SLCarcamo@gmail.com","2223242526");
//        personaDao.actualizar(personaModificar);
         Persona personaEliminar = new Persona(2);
         personaDao.eliminar(personaEliminar);
        List<Persona> personas = personaDao.seleccionar();
       personas.forEach(persona -> {
           System.out.println("persona = " + persona);
       });
    }
 }
