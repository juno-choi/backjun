package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackJack {
    public static void main(String[] args) throws IOException {
        //5 21
        //5 6 7 8 9
        int result = Integer.MIN_VALUE;
        int[] arr = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArray = br.readLine().split(" ");
        int cardCnt = Integer.valueOf(strArray[0]);
        int target = Integer.valueOf(strArray[1]);
        arr = new int[cardCnt];

        strArray = br.readLine().split(" ");
        for(int i=0; i<cardCnt; i++){
            arr[i] = Integer.valueOf(strArray[i]);
        }

        for(int i = 0; i<cardCnt; i++){
            int su1 = arr[i];
            if(su1 > target){
                continue;
            }
            for(int j=0; j<cardCnt; j++){
                if(i==j){
                    continue;
                }
                int su2 = arr[j];
                if(su1 + su2 > target){
                    continue;
                }

                for(int h=0; h<cardCnt; h++){
                    if(i==h){
                        continue;
                    }
                    if(j==h){
                        continue;
                    }

                    int su3 = arr[h];
                    int sum = su1 + su2 + su3;
                    if(sum > target){
                        continue;
                    }
                    if(result < sum){
                        result = sum;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
