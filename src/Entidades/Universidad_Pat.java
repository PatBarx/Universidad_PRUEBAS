package Entidades;

import Data.AlumnoData;
import Data.CursadaData;
import Data.MateriaData;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 * @author PatB
 */
public class Universidad_Pat {
    public static void main(String[] args) {
        System.out.println("---  PRUEBAS PRACTICA  ---\n");               

//Prueba Conexion:
//Connection con = Coneccion.getConeccion();

//INSERT INTO `alumno`(`idAlumno`, `nombre`, `apellido`, `fechaNac`, `dni`, `activo`)
    //Creo alumnos harcode para pruebas:
        //Alumno a1 = new Alumno("Lupe","Castro",LocalDate.of(2010,5,14),45334566,true);
        //Alumno a2 = new Alumno("Santy","Barcos",LocalDate.of(2002,7,29),50123523,true);
    //Creo un control "AlumnoData":
        AlumnoData ad = new AlumnoData();
//--ALUMNOS------ 
    //---GUARDAR ALUMNO:
        //ad.guardarAlumno(a1);
        //ad.guardarAlumno(a2);
       
    //---BUSCAR ALUMNO:
        //System.out.println("---  Alumno buscado  ---\n");
        //System.out.println(ad.buscarAlumno(11));
        
    //---ACTUALIZAR ALUMNO:
        //Alumno a2 = new Alumno(11,"Santy","Barcos",LocalDate.of(2002,7,29),50123523,true);
        //Alumno a2 = new Alumno(11,"Santiago","Barcos",LocalDate.of(2002,7,29),44123523,true);
        //ad.actualizarAlumno(a2);
        
    //---BORRAR ALUMNO:
        //Alumno a2 = new Alumno(11,"Santiago","Barcos",LocalDate.of(2002,7,29),44123523,true);
        //ad.borrarAlumno(a2);

    //---LISTAR y MOSTRAR ALUMNOS:
        //---Probar listar alumnos   
        //System.out.println("---  LISTA Alumnos  ---\n");
        //System.out.println(ad.listarAlumnos());
//        ArrayList<Alumno>lista =ad.listarAlumnos();
//        for (Alumno alu : lista) {
//            System.out.println("-DNI: \t"+alu.getDni()
//                    +"\t| -Legajo-Nº: " + alu.getIdAlumno()
//                    +"\n-Apellido: "+alu.getApellido()
//                    + "\t| -Nombre: "+alu.getNombre()
//                    +"\n-Fecha de nacimiento: \t"+alu.getFechaNac()
//                    + "\n");
//        }        
        System.out.println("-------------------------------------------------");
        
//--MATERIAS------  
        //Creo materias harcode para pruebas:
        //INSERT INTO `materia`(`idMateria`, `nombre`, `anio`, `activo`)
        //Materia mat1 = new Materia("WEB",1,true);
        //Materia mat2 = new Materia("LAB",2,true);
        //Creo un control "MateriaData":
        //MateriaData mDat = new MateriaData();        
    //---GUARDAR MATERIA: - 
        //mDat.guardarMateria(mat1);//ok
        //mDat.guardarMateria(mat2);
    //---BUSCAR MATERIA:
        //System.out.println("---  Materia buscada  ---\n");
        //System.out.println(mDat.buscarMateria(1)+"\n");
    //---BORRAR MATERIA:
        //System.out.println("---  Materia borrada  ---\n");
        //mDat.borrarMateria(2);
    //---ACTUALIZAR MATERIA:
        //System.out.println("---  Materia actualizada  ---\n");
        //Materia mat1 = new Materia(18,"WEB MAteria",1,true);
        //mDat.actualizarMateria(mat1);
        
    //---LISTAR y MOSTRAR MATERIAS:
        //System.out.println("---  LISTA MATERIAS  ---\n");
        //System.out.println(mDat.listarMateria());

//--CURSADA/INSCRIPCIONES------ 
        //Creo un control "AlumnoData":
        System.out.println("---  1  ---\n");
        CursadaData cDat=new CursadaData();        
        Materia mat1 = new Materia(18,"WEB MAteria",1,true);
        Alumno a1 = new Alumno(13,"Guadalupe","Castro",LocalDate.of(2010,5,14),50765345,true);
        System.out.println("---  2  ---\n");
        //Cursada cu =new Cursada(a1,mat1,8);        
        
    //---GUARDAR CURSADA:
        //System.out.println("---  GUARDAR cursada  ---\n");
        //cDat.guardarCursada(cu);

    //---BUSCAR CURSADA:
        System.out.println("---  Buscar cursada  ---\n");
        System.out.println(cDat.buscarCursada(13, 18)); //Cdata: buscar x id alu + id mat
    //---ACTUALIZAR CURSADA:
        //Cursada cu =new Cursada(a1,mat1,8);
        cDat.actualizarNota(13, 18, 10);
        System.out.println("---  Cursada Actualizada  ---\n");
        System.out.println(cDat.buscarCursada(13, 18));
        
    //---BORRAR CURSADA:
        //cDat.borrarCursada(5);



        System.out.println("-------------------------------------------------");

        
        
        
        
        //---LISTAR y MOSTRAR MATERIAS INSCRIPTAS x Alumno:
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("MATERIAS EN LAS QUE ESTA INSCRIPTO EL ALUMNO:");
        System.out.println(cDat.inscMateriaXalu(a1));
        
        
        //---LISTAR y MOSTRAR MATERIAS NO INSCRIPTAS:
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("MATERIAS EN LAS QUE NO ESTA INSCRIPTO EL ALUMNO:");
        System.out.println(cDat.noInscMateriaXalu(a1));
        
        //---LISTAR y MOSTRAR ALUMNOS POR MATERIA:         
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("ALUMNOS que estan inscriptos en la materia:");
        System.out.println(cDat.inscAlumnoXmat(mat1));

}  
}
