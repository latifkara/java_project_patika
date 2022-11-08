package java101_final;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner scan = new Scanner(System.in);
    private int row, col;
    String[][] mineList;
    String[][] emptyList;
    int mineRow, mineCol;
    int firstRandomNumber, secondRandomNumber, resultRandomNumber;
    Random random;
    int counter = 0;
    int winCount = 0;
    boolean isLoss = false;
    public MineSweeper(int row, int col){
        this.row = row;
        this.col = col;
        random = new Random();
        mineList = new String[this.row][this.col];
        emptyList = new String[this.row][this.col];
        printList(setMine(mineList));
        printList(setEmptyList(emptyList));
    }
    public String[][] setMine(String[][] mineList){
        resultRandomNumber = (this.row * this.row) / 4;
        for (int i = 0; i < resultRandomNumber; i++){
            firstRandomNumber = random.nextInt(row);
            secondRandomNumber = random.nextInt(col);
            System.out.println();
            for (int row = 0; row < mineList.length; row++){
                for (int col = 0; col < mineList[row].length; col++){
                    if (row == firstRandomNumber && col == secondRandomNumber){
                        mineList[row][col] = " * ";
                    }else if(mineList[row][col] != " * "){
                        mineList[row][col] = " - ";
                    }
                }
            }
        }
        return mineList;
    }
    public void printList(String[][] mineList){
        for (int i = 0; i < mineList.length; i++){
            for (int j = 0; j < mineList[i].length; j++){
                System.out.print(mineList[i][j]);
            }
            System.out.println();
        }
        System.out.println("*****************************");
    }
    public void input(){
        System.out.print("Satır Giriniz : ");
        mineRow = scan.nextInt();
        System.out.print("Sütun Giriniz : ");
        mineCol = scan.nextInt();

    }
    public String[][] setEmptyList(String[][] emptyList){
        for (int row = 0; row < emptyList.length; row++){
            for (int col = 0; col < emptyList[row].length; col++){
                emptyList[row][col] = " - ";
            }
        }
        return emptyList;
    }

    public void findMine() {
        while (!isLoss && (winCount + resultRandomNumber) < (this.row * this.col)) {
            input();
            System.out.println("*******************");
            counter = 0;
            if ((mineRow >= this.row) && (mineCol >= this.col)){
                System.out.println("Array dışında bir sayı girdiniz!");
                continue;
            }
            for (int row = 0; row < mineList.length; row++) {
                for (int col = 0; col < mineList[row].length; col++) {

                    if (mineList[row][col] == " * " && !isLoss) {
                        if (mineRow == row && mineCol == col) {
                            System.out.println("Game Over!!");
                            isLoss = true;
                            break;
                        }
                        else if (checkMine(row, col)) {
                            emptyList[mineRow][mineCol] = " " + String.valueOf(++counter) + " ";

                        } else if(!checkMine(row, col)){
                            emptyList[mineRow][mineCol] = " 0 ";
                        }
                    }
                }
            }
            if (!isLoss){
                printList(emptyList);
                winCount++;
                if ((winCount + resultRandomNumber) == (this.row * this.col)){
                    System.out.println("Oyunu Kazandınız !");
                }
            }
        }
    }
    public boolean checkMine(int row, int col){

        return (mineRow-1 == row && mineCol-1 == col) || (mineRow-1 == row && mineCol == col) ||
                (mineRow-1 == row && mineCol+1 == col) || (mineRow+1 == row && mineCol+1 == col) ||
                (mineRow == row && mineCol-1 == col) || (mineRow+1 == row && mineCol == col) ||
                (mineRow+1 == row && mineCol-1 == col) || (mineRow == row && mineCol+1 == col);
    }

}
