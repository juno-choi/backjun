package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1085
public class EscapeRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] split = input.split(" ");
        int x = Integer.valueOf(split[0]);
        int y = Integer.valueOf(split[1]);
        int w = Integer.valueOf(split[2]);
        int h = Integer.valueOf(split[3]);
        solve(x,y,w,h);
    }
    private static void solve(int x, int y, int w, int h){
        int min = x > y ? y : x; //x,y중 작은 값이 0,0 기준 최소 값으로 됨
        min = Math.min(min, w-x);
        min = Math.min(min, h-y);
        System.out.println(min);
    }
}
