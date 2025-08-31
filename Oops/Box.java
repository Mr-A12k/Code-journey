import java.util.*;

public class Box{
    int w;
    int h;
    int l;

    Box(){
        this.l=1;
        this.h=1;
        this.w=1;
    }

    Box(int side){
        this.w=side;
        this.l=side;
        this.h=side;
    }

    Box(Box old){
        this.w=old.w;
        this.l=old.l;
        this.h=old,h;
    }

    Box(int l, int w, int h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    public void printBox(){
        System.out.println("Box is running!");
    }
}