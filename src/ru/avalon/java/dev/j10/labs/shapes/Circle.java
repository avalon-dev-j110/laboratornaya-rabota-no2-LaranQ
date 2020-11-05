package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{
    
    float xMax,yMax, x2,y2; // центр окружности, вводится в первую очередь и любая точка на ней
    float r; // радиус

    public Circle(float x1, float y1,float x2, float y2) {
        xMax=x1;
        yMax=y1;
        this.x2=x2;
        this.y2=y2;
        
        r = Shape.lengthSide(x1,y1,x2,y2);
    }
    
    public Circle(float x1, float y1) { //Если нет точек поверхности - это точка.
        xMax=x1;
        yMax=y1;
        
        r = 0; // Превратит длину и площадь окружности в ноль.
    }
    
    public float getLength(){
        return 2*pi*r;
    };
    
    public float getArea(){
        return pi*r*r;
    };
    
    public float getX(){
        return xMax;
    }
    
    public float getY(){
        return yMax;
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
