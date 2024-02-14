import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Operaciones{
    ArrayList<Persona> personas = new ArrayList<>();

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
}