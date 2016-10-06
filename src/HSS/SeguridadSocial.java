package HSS;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class SeguridadSocial {


    Map<String,Persona> personamapdni;
    Map<String,Persona> personamapnumss;



    public SeguridadSocial() {


        personamapdni = new HashMap<>();

        personamapnumss = new HashMap<>();


    }


    public void altaPersona(Persona persona) {


        // comprobamos si esta repetido
        if (!personamapdni.containsKey(persona.getDni()) && !personamapnumss.containsKey(persona.getNumSS())) {

            personamapdni.put(persona.getDni(), persona);
            personamapnumss.put(persona.getNumSS(), persona);

        }
    }

    public void bajaPersona(String dni) {
        Persona p = personamapdni.get(dni);
        personamapdni.remove(p.getDni());
        personamapnumss.remove(p.getNumSS());

    }

    public Persona obtenerPersonaPorDNI(String dni) {
        return personamapdni.get(dni);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        return personamapnumss.get(numSS);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        System.out.println("Antes"+ System.currentTimeMillis());

        List<Persona> resultado = personamapdni.values().parallelStream().filter(persona -> persona.getSalario() >= min && persona.getSalario() <= max).collect(Collectors.toList());
        System.out.println(System.currentTimeMillis());
        return resultado;
        // values y stream para recorrer la lista en un flujo, filter hace la funcion de "if"
        //.collect para añadir el resultado de la busqueda y mostrarlo en un string

    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        return personamapdni.values().stream().filter(persona -> persona.getEdad() > edad).collect(Collectors.toList());
    }

    public List<Persona> obtenerTodas(){
        return personamapdni.values().stream().collect(Collectors.toList());
    }

    public List<Persona> ordenarporedad (){
        // los :: se usan en las comparaciones
        List<Persona> ordenaredad = new ArrayList<>(personamapdni.values());

        Collections.sort(ordenaredad, Comparator.comparing(Persona::getEdad));

        return ordenaredad;

    }



}
