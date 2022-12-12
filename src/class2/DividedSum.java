package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DividedSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int sum = 0;
        int result = 0;

        for(int i=1; i<=N; i++){
            int num = i;
            while(num > 0){
                sum += num%10;
                num = num/10;
            }
            if(i+sum == N){
                result = i;
                break;
            }
            sum = 0;
        }

        System.out.println(result);
    }
}
