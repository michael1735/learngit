package Homework;

public class MyStock {
    public static void main(String[] args) {
        float[] myArray = {0.104f, -0.03f,-0.062f, 0.012f, -0.061f, -0.19f, -0.038f, 0.009f, -0.045f, 0.055f};
        float mostLucrative = myArray[0];
        float leastLucrative = myArray[0];
        float profits = 0;
        int lose = 0;
        int gain = 0;

        for (int i = 0; i < myArray.length; i++){
            profits = profits + myArray[i];

            if (mostLucrative < myArray[i]){
                mostLucrative = myArray[i];
            }

            if (leastLucrative > myArray[i]){
                leastLucrative = myArray[i];
            }

            if (myArray[i] > 0){
                gain++;
            }

            if (myArray[i] < 0){
                lose++;
            }
        }

        System.out.println("��׬Ǯ��: " + mostLucrative * 100 + "%");
        System.out.println("���Ǯ��: " + leastLucrative * 100 + "%");
        System.out.println("����ӯ��: " + profits * 100 + "%");
        System.out.println("�� " + gain + " ֻ׬��");
        System.out.println("�� " + lose + " ֻ����");
    }
}
