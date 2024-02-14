import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Operaciones{
    ArrayList<Persona> personas = new ArrayList<>();
    File archivoAlumnos = new File("Alumnos.txt");
    File archivoDocente = new File("Docentes.txt");

    public void agregar(Persona p){
        personas.add(p);
    }
    public void eliminar(Persona p){
        personas.remove(p);
    }
    public void eliminar(int indice){
        personas.remove(indice);
    }
    public void crearArchivo(String nombre) throws IOException{
        File archivo = new File(nombre);
        archivo.createNewFile();
    }
    public void guardarDatos() throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Alumnos.txt"))) {
            for (Persona p : personas) {
                if(p instanceof Alumno){
                    String elemento = p.toString();
                    writer.write(elemento);
                    writer.newLine();  // Agrega una nueva línea después de cada elemento
                }
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Docentes.txt"))) {
            for (Persona p : personas) {
                if(p instanceof Docente){
                    String elemento = p.toString();
                    writer.write(elemento);
                    writer.newLine();  // Agrega una nueva línea después de cada elemento
                }
            }
        }
    }
}