package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1018
public class RePaintingChess {

    static String[][] chess;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] xy = br.readLine().split(" ");
        int x = Integer.valueOf(xy[0]);
        int y = Integer.valueOf(xy[1]);
        chess = new String[x][y];
        for(int i=0; i<x; i++){
            String[] WB = br.readLine().split("");
            for(int j=0; j<y; j++){
                chess[i][j] = WB[j];
            }
        }

        //체스판의 크기는 8x8이므로 그 이상은 체크할 필요가 없다.
        int nx = x-7;
        int ny = y-7;
        for(int i=0; i<nx; i++){
            for(int j=0; j<ny; j++){
                solve(i,j); //기준이 되는 x,y
            }
        }
        System.out.println(min);
    }

    private static void solve(int x, int y){
        int count = 0;
        String flagStr = chess[x][y];  //기준이되는 String 값

        for(int i=x; i<=x+7; i++){
            for(int j=y; j<=y+7; j++){
                if(!chess[i][j].equals(flagStr)){
                    count++;
                }
                flagStr = flagStr.equals("W") ? "B" : "W";
            }
            flagStr = flagStr.equals("W") ? "B" : "W";
        }

        //최소값 비교
        min = Math.min(min, count);

        //반대의 경우 비교
        min = Math.min(min, 64-count);
    }

}
