Algoritmo Ejercicio_13
	
	Definir n1, n2 Como Entero
	Definir suma, dividir Como Entero
	Definir salir Como Caracter
	Definir op Como Entero
	
	Escribir "Menu"
	Escribir "1.- Sumar  2.- Dividir  3.-Salir"
	leer op
	
	Mientras op<>3 Hacer
		
		Si op=1 Entonces
			Escribir "ingrese un numero"
			leer n1
			Escribir "ingrese un numero"
			leer n2
			suma= n1 + n2
			Escribir "La suma es " suma
		SiNo
			Escribir "ingrese el numerador"
			leer n1
			Escribir "ingrese El denominador"
			leer n2
			
			Si n2 <> 0 Entonces
				dividir= n1/n2
				Escribir "La division es " dividir
			SiNo
				Escribir "No se puede dividir por denominador = " n2
			Fin Si
			
		Fin Si
		
		Escribir "Menu"
		Escribir "1.- Sumar  2.- Dividir  3.-Salir"
		leer op 
		
	Fin Mientras
	
	
FinAlgoritmo
