package com.senati.eti;
import java.util.Scanner;
import java.util.ArrayList;
import com.senati.eti.model.Alumno;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Alumno> arrAlumno = new ArrayList<Alumno>();
		
		// Forma 1: Crear el objeto de tipo Alumno (TIPADO CON LA CLASE ALUMNO)
		Alumno alum1 = new Alumno();
		
		alum1.setNombre("Joe");
		alum1.setApellido("Castillo");
		alum1.setGenero("M");
		alum1.setEdad(25);
		
		// Forma 2: Crear el objeto de tipo Alumno
		Alumno alum2 = new Alumno("Rosa", "Florees", "F", 15);
		
		// Forma 3 : Crear el objeto de tipo Alumno
		Alumno alum3 = null;
				
		String nom = "", ape = "", gen ="";
		int ed = 0;
				
		System.out.println("REGISTRO DE DATOS");
		System.out.println("=================");
		System.out.print("Nombre.......: ");
		nom = sc.nextLine();
		System.out.print("Apellido.....: ");
		ape = sc.nextLine();
		System.out.print("Género [M-F].: ");
		gen = sc.nextLine();
		System.out.print("Edad [15-30].....: ");
		ed = sc.nextInt();
				
		alum3 = new Alumno(nom, ape, gen, ed);
				
		arrAlumno.add(alum1);
		arrAlumno.add(alum2);
		arrAlumno.add(alum3);
		System.out.println("\n LISTA DE DATOS REGISTRADOS");
		System.out.println("=============================");
		String patron = "%-4s %-20s %-18s %-15s";
		
		System.out.println(String.format(patron, "N", "Nombres y Apellidos", "Género", "Estado"));
		System.out.println(String.format(patron, "-", "-------------------", "------", "------"));
		
		for (int x = 0; x < arrAlumno.size();x++)
			System.out.println(String.format(patron, (x + 1), 
					arrAlumno.get(x).NombreCompleto(),
					arrAlumno.get(x).MostrarGenero(),
					arrAlumno.get(x).MostrarEstado()));
	}

}
