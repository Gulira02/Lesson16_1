package polymorphism;

public class Main {
    public static void main(String[] args) {
        //Shapes деген класс түзүңүз, анын findArea() деген методу болсун.
        //Shape классты Triangle, Rectangle, Circle, Square деген класстар мурастасын.
        //Жана өзүлөрүнө жараша полялары болсун. Ар бир класс Shape класстын findArea()
        // методун Override кылып,  аянтын тапкан логика жазыңыз.
        //Main класстан ар бир фигуранын объекттерин түзүп, параметрилерин берип,
        // findArea() методун чыкырып,
        //аянтын табыңыз
        Shapes triangle=new Triangle(2,4);
        Shapes circle=new Circle(2.1);
        Shapes square =new Square(3.3,3.0);
        Shapes rectangle=new Rectangle(2,5);

        System.out.println(triangle.findArea());
        System.out.println(circle.findArea());
        System.out.println(square.findArea());
        System.out.println(rectangle.findArea());





    }
}