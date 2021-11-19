package cz.educanet.lights.out;

import cz.educanet.lights.out.domain.interfaces.ILightsOut;

import java.util.Random;

public class Game implements ILightsOut {
    int count = 0;
    boolean ano = true;
    boolean[][] arr = new boolean[5][5];

    @Override
    public int getMoveCount() {
        return count;
    }

    @Override
    public boolean isGameOver() {
        int boolCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (getGrid()[i][j] == true) {
                    boolCount++;
                }
            }
        }
        if (boolCount == 24) return true;
        return false;
    }

    @Override
    public boolean[][] getGrid() {
        Random rd = new Random();
        if (ano) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = rd.nextBoolean();
                }
            }
            ano = false;
        }
        return arr;
    }

    //if (x == 0)           Levá                0
    //if (x == 0 && y == 4) Levá dole           11
    //if (x == 0 && y == 0) Levá nahoře         22
    //if (y == 0)           Nahoře              0
    //if (x == 4 && y == 0) Nahoře vpravo       33
    //if (x == 0 && y == 0) Nahoře vlevo        22
    //if (x == 4)           Pravá               0
    //if (y == 4)           Pravá nahoře        33
    //                      Pravá dole          44
    //                      Dole                0
    //                      Dole vpravo         44
    //                      Dole vlevo          11


    @Override                            // true == je zhaslí
    public void makeMove(int x, int y) { // false == není zhaslí
        if (x == 0){
            if (arr[x][y]){

            }
        }

        System.out.println(x);
        System.out.println(y);
        count++;
    }
}
