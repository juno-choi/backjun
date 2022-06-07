package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1654
public class CuttingLanCable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long max = 0;

        //영식이가 가지고 있는 랜선
        int[] arr = new int[K];
        for(int i=0; i<K; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);    //가진 랜선 중 가장 긴 길이
        }

        long left = 0;
        long right = max+1;

        while(left < right){
            long mid = (left+right)/2;

            int count = 0;

            for(int i=0; i<arr.length; i++){
                count += arr[i]/mid;    //잘린 랜선 갯수
            }

            if(count<N) right = mid;  //자른 랜선의 수가 작으면 더 작게 잘라야 하므로 범위를 더 작은 쪽으로 줄인다.
            else left = mid+1;
        }
        System.out.println(right-1);  //이미 최소 길이를 구한 뒤에 한번 더 실행되므로 -1로 최소값을 맞춘다.
    }
}
