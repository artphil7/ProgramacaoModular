package Poligons;

public class TestePoligons { 
	
	public static void main(String[] args) {

		// Declara c1 como vari�vel habilitada a armazenar uma referencia para objeto da classe Circle.
		Circle c1;
		
		// atribui a c1. A referencia retornada pelo construtor padr�o Circle ()
		c1 = new Circle();
		
		// Imprime os atributos da classe Circle invoacando seus metodos,
		System.out.println( "O circulo tem o raio de " + c1.getRadius() + " cor " + c1.getColor() 
		+ " area de " + c1.getArea() + " e comprimento " + c1.getPerimetro());
		
		// Declara e aloca uma segunda instancia da classe Circle chamada c2
		// com o valor do radius igual a 2.0 e color com valor padr�o.
		Circle c2 = new Circle(2.0);
		
		// Imprime os atributos da classe Circle invoacando o metodo toString()
		System.out.println( c2.toString());
		
		// Declara e aloca uma segunda instancia da classe Circle chamada c3
		// com o valor do radius igual a 2.0 e color com valor padr�o.
		Circle c3 = new Circle();
		c3.setRadius(3.0);
		c3.setColor("blue");
				
		// Para invocar os metodos a operar sobre a inst�ncia c3, usa-se o operador ponto (�.�)
		System.out.println( "O circulo tem raio de " + c3.getRadius() + " cor " + c3.getColor() 
		+ " area de " + c3.getArea() + " e comprimento " + c3.getPerimetro());
		
		// Modificar os atributos do circulo c2 atraves dos metodos set*()
		c2.setRadius(5.0);
		c2.setColor("green");
		
		// Invocar o metodo toString iplicitamente
		System.out.println(c2);
		
		// N�o � possivel acessar ou modificar o campo diretamente,
		// pois o mesmo est� com o modificador "private"
		// c3.radius = 2.5;
		//System.out.println( "O circulo tem raio de " + c3.radius);
				
		// Declara t1 como vari�vel pelo construtor padr�o Triangle ()
		Triangle t1 = new Triangle();
		
		// Imprime os atributos da classe Triangle invoacando o metodo toString()
		System.out.println(t1.toString());
		
		// Declara t2 como vari�vel pelo segundo construtor Triangle (args...)
		Triangle t2 = new Triangle(5.0, 6.0, 7.0);
		
		// Invocar o metodo toString iplicitamente
		System.out.println(t2);
					
	} 
}

