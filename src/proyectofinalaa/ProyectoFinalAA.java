/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalaa;

import Conexion.CreateConection;
import java.sql.SQLException;

//libreria para manipular datos
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
/**
 *
 * @author Roher
 */
public class ProyectoFinalAA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
         CreateConection conexionPostgres = new CreateConection ();
         Connection con = conexionPostgres.getConection();
          try{
          Statement smt = con.createStatement();
          String qry= "insert into public.empleado(nombre, apellido, salario)"
                  +"values ('Maria', 'catalan', 7500.25)";
          int filasInsertadas = smt.executeUpdate(qry);
          System.out.println("Total de Registros insertados"+filasInsertadas);
          smt.close();
          }catch (SQLException e){
              e.getMessage();
              
        }   
          
       
    }
    
}
