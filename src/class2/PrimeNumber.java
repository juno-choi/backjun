package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1929
public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        solve(start, end);
    }

    private static void solve(int start, int end){
        int[] arr = new int[end+1];   //배열을 검사할때 배열과 index값을 맞추기 위해
        for(int i=2; i<=end; i++){
            if(arr[i]==0){  //arr[i] == 0일 경우 해당 index는 소수이므로 카운트
                if(i>=start)System.out.println(i);
                for(int j=i; j<=end; j+=i){  //해당 수의 배수들은 모두 체크
                    arr[j] = 1;
                }
            }
        }
    }
}
