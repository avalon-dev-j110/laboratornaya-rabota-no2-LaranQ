package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Application {
    
    static void maxArea(Shape[] shapes){
        int i = 0;
        Shape min;
        
        for(i=0; i<shapes.length; i++){
            for (int j=i+1; j<shapes.length; j++){
                if(shapes[j].getArea()<shapes[i].getArea()){
                    min = shapes[j];
                    shapes[j]=shapes[i];
                    shapes[i]=min; 
                }
            }
        }
        
        if (shapes[9] instanceof Circle){
            System.out.println("Наибольшая площадь у круга. Она составила : "+shapes[9].getArea())
                    ;}
        else {
            if (shapes[9] instanceof Rectangle){
                System.out.println("Наибольшая площадь у прямоугольника. Она составила : "+shapes[9].getArea());}
            else{System.out.println("Наибольшая площадь у треугольника. Она составила : "+shapes[9].getArea());}
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = {new Triangle(6.0f,5.0f,4.0f,3.0f,2.0f,1.0f),
            new Triangle(18.0f,5.0f,4.0f,3.0f,2.0f,-9.0f),
            new Triangle(20.0f,5.0f,4.0f,3.0f,2.0f,-5.0f),
            new Triangle(30.0f,5.0f,4.0f,3.0f,2.0f,-15.0f),
            new Triangle(40.0f,5.0f,4.0f,3.0f,2.0f,-20.0f),
            new Triangle(50.0f,5.0f,4.0f,3.0f,2.0f,-40.0f),
            new Rectangle(2.0f,2.0f,2.0f,4.0f,18.0f,2.0f, 18.0f, 4.0f),
            new Rectangle(2.0f,2.0f,2.0f,20.0f,6.0f,2.0f, 6.0f, 20.0f),
            new Circle(5.0f,8.0f,16.0f,12.0f),
            new Circle(2.0f,2.0f)};
        
        Application.maxArea(shapes);

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
    }
}
