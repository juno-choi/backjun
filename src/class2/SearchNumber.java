package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/1920
public class SearchNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        String[] s1 = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(s1[i]);
        }
        int M = Integer.parseInt(br.readLine().trim());
        int[] B = new int[M];
        String[] s2 = br.readLine().split(" ");
        for(int i=0; i<M; i++){
            B[i] = Integer.parseInt(s2[i]);
        }

        solve(A, B);
    }
    private static void solve(int[] A, int[] B){
        //A 정렬
        Arrays.sort(A);
        for(int b : B){
            int i = Arrays.binarySearch(A, b);
            if(i>=0) System.out.println("1");
            else System.out.println("0");
        }
    }
}
