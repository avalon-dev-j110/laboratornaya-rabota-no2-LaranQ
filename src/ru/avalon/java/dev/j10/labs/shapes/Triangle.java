package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{
    
    float xMax,yMax; // самая верхняя кордината по ординате и абциссе
    float a,b,c; // стороны треугольника
    
    public Triangle(float x1, float y1,float x2, float y2,float x3,float y3){
        if(x1>=x2){
            if(x1>=x3){xMax=x1;}
            else{xMax=x3;}}
        else{xMax=x2;}
        
        if(y1>=y2){
            if(y1>=y3){yMax=y1;}
            else{yMax=y3;}}
        else{yMax=y2;}
        
        a = Shape.lengthSide(x1,y1,x2,y2);
        b = Shape.lengthSide(x3,y3,x2,y2);
        c = Shape.lengthSide(x3,y3,x1,y1);
    }
    
    public float getPerimeter(){
        return a+b+c;
    }
    
    public float getArea(){
        float p = (a+b+c)/2;
        return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    public float getX(){
        return xMax;
    }
    
    public float getY(){
        return yMax;
    }

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
