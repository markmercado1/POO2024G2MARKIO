package pe.edu.upeu.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.upeu.poo.cobjeto.Persona;

@SpringBootApplication
public class PrincipiosPooApplication {

	public static void main(String[] args) { 
                
          
		SpringApplication.run(PrincipiosPooApplication.class, args);
                Persona objP=new Persona();//concepto de objeto
                //concepto de encapsulamiento 
                objP.setNombre("Mark Emerson");
                objP.setEdad(18);
                System.out.println("hola mundo ");
                System.out.println("SU NOMBRE ES: " +objP.getNombre()+"y su edad es "+objP.getEdad());
                
                
                
	}

}
