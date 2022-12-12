package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoneyComb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int i = 1;
        int result = 0;
        int index = 1;

        while(true){
            if(N == 1){
                result = 1;
                break;
            }
            int su = i*6;
            index += su;
            i++;
            if(N <= index){
                result = i;
                break;
            }

        }
        System.out.println(result);
    }
}
