package oop1.ex;

public class Rectangle {
    int width;
    int height;

    void calculateArea(){
        System.out.println("넓이 : " + width * height);
    }
    void calculatePerimeter(){
        System.out.println("둘레 길이 : " + 2*(width + height));
    }
    void isSquare(){
        boolean data =width == height;
        System.out.println("정사각형 여부" + data);
    }

}
