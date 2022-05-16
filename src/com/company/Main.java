package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] array = new Animal[]{new Shark(), new Turtle(), new Eagle()};
        Shark [] shark = new Shark[3];
        Turtle [] turtle = new Turtle[3];
        Eagle [] eagle = new Eagle[3];
        int a =0;
        int b =0;
        int c =0;

        for (int i = 0; i < array.length; i++){
            array[i].eat();
        System.out.println();
        if (array[i] instanceof Shark) {
            System.out.println(((Shark) array[i]).attack());
            shark[a] = (Shark) array[i];
            a++;
        }
        else if (array[i] instanceof Turtle) {
            System.out.println(((Turtle) array[i]).swim());
            turtle[b] = (Turtle) array[i];
            b++;
        }
        else {
            System.out.println(((Eagle) array[i]).fly());
            eagle [c] = (Eagle) array [i];
            c++;
        }
        }}}
