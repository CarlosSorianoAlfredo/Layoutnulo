package controlador;

import ConexionBD.ConexionBD;
import modelo.Alumno;

public class AlumnoDAO {

    ConexionBD conexion = new ConexionBD();
    //=============Metodos ABCC (CRUD)================

    //================Altas=====================
    public boolean agregarAlumno(Alumno a){
        boolean res= false;
        /*
        PROCESO PARA ALTAS EN MySQL

            insert into Alumnos values('01',"Dominic", "Toreto", 'Garcia', 43, 8, "ISC");

         */
        String sql= "insert into Alumnos values('"+a.getNumControl()+"','"+a.getNombre()+"', '"+a.getPrimerAp()+"', '"+a.getSegundoAp()+"','"+a.getEdad()+"', '"+a.getSemestre()+"', '"+a.getCarrera()+"')";
        res= conexion.ejecutarInstruccionDML(sql);
        return res;
    }


    //================Bajas=====================
    public boolean eliminarAlumno(String numControl){
        boolean res = false;

        //   DELETE from Alumnos where NumControl = '01';
        String sql= "DELETE from Alumnos where NumControl = '"+numControl+"'";

        res = conexion.ejecutarInstruccionDML(sql);

        return res;
    }

    //================Cambios===================
    public boolean actualizarAlumno(Alumno a){
        boolean res = false;
        //UPDATE Alumnos SET Nombre='x', PrimerAp='x', SegundoAp='x', Edad=10, Semestre=2, Carrera='x', WHERE NumControl = '"a.getNumcontrol"'";
        String sql="UPDATE Alumnos SET Nombre='"+a.getNombre() +
                "', PrimerAp='"+a.getPrimerAp() +
                "', SegundoAp='"+a.getSegundoAp() +
                "', Edad="+a.getEdad() +
                ", Semestre="+a.getSemestre() +
                ", Carrera='"+a.getCarrera() +
                "' WHERE NumControl = '"+a.getNumControl()+"'"; //Esta linea es para poder seleccionar el objeto a modificar por medio de su numero de control
        res=conexion.ejecutarInstruccionDML(sql);
        return res;
    }

    //================Consultas=================



}//clase alumnoDAO
