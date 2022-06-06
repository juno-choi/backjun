package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.acmicpc.net/problem/1181
public class WordSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int read = Integer.valueOf(br.readLine());
        Set<String> set = new HashSet<>();
        Queue<Word> wordList = new PriorityQueue<>();

        //중복 처리
        for(int i=0; i<read; i++){
            String s = br.readLine();
            set.add(s);
        }

        for(String s : set){
            wordList.add(new Word(s, s.length()));
        }

        while(!wordList.isEmpty()){
            Word word = wordList.poll();
            System.out.println(word.str);
        }
    }

    static class Word implements Comparable<Word>{
        String str;
        int length;

        public Word(String str, int length) {
            this.str = str;
            this.length = length;
        }

        @Override
        public int compareTo(Word o) {
            //우선 순위 구현
            if(this.length == o.length) return this.str.compareTo(o.str);
            return this.length - o.length;
        }
    }
}
