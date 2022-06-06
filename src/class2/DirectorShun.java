package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1436
public class DirectorShun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.valueOf(br.readLine());

        int count = 1;
        int su = 666;
        while(input != count){
            su++;
            if(String.valueOf(su).contains("666")){
                count++;
            }
        }
        System.out.println(su);
    }
}
