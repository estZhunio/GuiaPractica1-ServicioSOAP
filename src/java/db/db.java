package db;

import clases.Persona;
import clases.Rol;
import clases.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class db {
    public static List<Usuario> usuarios = new ArrayList<>();
    
    public static void llenarDB() {
        usuarios.clear();
        Persona persona1 = new Persona(1, "Miguel", "Perez", "1234567890", "0987654321", "miguel.perez@example.com");
        Persona persona2 = new Persona(2, "Ana", "Ramirez", "2345678901", "0981122334", "ana.ramirez@example.com");
        Persona persona3 = new Persona(3, "Carlos", "Gomez", "3456789012", "0982233445", "carlos.gomez@example.com");
        Persona persona4 = new Persona(4, "Laura", "Lopez", "4567890123", "0983344556", "laura.lopez@example.com");
        Persona persona5 = new Persona(5, "Luis", "Martinez", "5678901234", "0984455667", "luis.martinez@example.com");
        
        Rol rol1 = new Rol(1, "Administrador", true);
        Rol rol2 = new Rol(2, "Usuario", true);
        Rol rol3 = new Rol(3, "Invitado", false);
        Rol rol4 = new Rol(4, "Supervisor", true);
        Rol rol5 = new Rol(5, "Editor", true);
        Rol rol6 = new Rol(6, "Lector", false);
        Rol rol7 = new Rol(7, "Auditor", true);
        Rol rol8 = new Rol(8, "Coordinador", true);
        Rol rol9 = new Rol(9, "Gerente", false);
        Rol rol10 = new Rol(10, "Desarrollador", true);
        Rol rol11 = new Rol(11, "Tester", false);
        Rol rol12 = new Rol(12, "Consultor", true);
        Rol rol13 = new Rol(13, "Soporte", true);
        Rol rol14 = new Rol(14, "Mantenimiento", false);
        Rol rol15 = new Rol(15, "Analista", true);
        Rol rol16 = new Rol(16, "Capacitador", true);
        Rol rol17 = new Rol(17, "Contador", false);
        Rol rol18 = new Rol(18, "Vendedor", true);
        Rol rol19 = new Rol(19, "Marketing", true);
        Rol rol20 = new Rol(20, "Logística", false);
        
        Usuario usuario1 = new Usuario(1, persona1, "miguel123", "passMiguel1", Arrays.asList(rol1, rol2, rol10));
        Usuario usuario2 = new Usuario(2, persona2, "ana456", "passAna2", Arrays.asList(rol2, rol4, rol7));
        Usuario usuario3 = new Usuario(3, persona3, "carlos789", "passCarlos3", Arrays.asList(rol3, rol5, rol6));
        Usuario usuario4 = new Usuario(4, persona4, "laura101", "passLaura4", Arrays.asList(rol8, rol9, rol4));
        Usuario usuario5 = new Usuario(5, persona5, "luis202", "passLuis5", Arrays.asList(rol5, rol10, rol2, rol3));
        
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        usuarios.add(usuario5);
        
    }

}
