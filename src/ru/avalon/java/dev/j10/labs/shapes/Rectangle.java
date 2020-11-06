package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Arrays;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{
    
    float xMax,yMax; // самая верхняя кордината по ординате и абциссе
    float a,b,c,d; // стороны треугольника
    
    public Rectangle(float x1, float y1,float x2, float y2,float x3,float y3,float x4,float y4){
        float []x={x1,x3,x2,x4};
        float []y={y1,y3,y2,y4};
        Arrays.sort(x);
        Arrays.sort(y);
        xMax=x[3];
        yMax=y[3];
        
        a = Shape.lengthSide(x1,y1,x2,y2);
        b = Shape.lengthSide(x2,y2,x3,y3);
        c = Shape.lengthSide(x3,y3,x4,y4);
        d = Shape.lengthSide(x4,y4,x1,y1);
    }
    
    public float getPerimeter(){
        return a+b+c+d;
    }
    
    public float getArea(){
        float area; // чтобы не умножить друг на друга параллельные стороны сделал проверку
        
        if(a==b){area=a*c;}
        else{area=a*b;}
        
        return area;
    }
    
    public float getX(){
        return xMax;
    }
    
    public float getY(){
        return yMax;
    }

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
