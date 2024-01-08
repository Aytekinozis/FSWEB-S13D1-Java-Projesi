public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(shouldWakeUp(true,1));
        System.out.println(hasTeen(23,15,42));
        System.out.println(isCatPlaying(false,35));
        System.out.println(area(-1.0,4.0));
        System.out.println(circleArea(-1));
    }

    public static boolean shouldWakeUp(boolean bark, int clock){
        if(clock <0 || clock > 23){
            return false;
        } else return bark && clock > 20 || clock < 8;
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        return (num1 > 13 || num2 > 13 || num3 > 13) && (num1 < 19 || num2 < 19 || num3 < 19);
    }

    public static boolean isCatPlaying(boolean yaz, int degree){
        if(yaz){
            return degree >= 25 && degree <= 45;
        }
        else{
            return degree >= 25 && degree <= 35;
        }
    }
    public static double area(double num1, double num2){
        if(num1<0 || num2<0){
            return -1;
        } else {
            return num1*num2;
        }
    }

    public static double circleArea(double radius){
        if(radius<0){
            return -1;

        } else return radius*radius*Math.PI;
    }
}