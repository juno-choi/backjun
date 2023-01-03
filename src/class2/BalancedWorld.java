package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalancedWorld {
    public static void main(String[] args) throws IOException {
        //So when I die (the [first] I will see in (heaven) is a score list).
        //[ first in ] ( first out ).
        //Half Moon tonight (At least it is better than no Moon at all].
        //A rope may form )( a trail in a maze.
        //Help( I[m being held prisoner in a fortune cookie factory)].
        //([ (([( [ ] ) ( ) (( ))] )) ]).
        // .
        //.
        List<String> strList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String brRead = br.readLine();
            if(brRead.equals(".")){
                break;
            }
            strList.add(brRead);
        }

        for(String s : strList){
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            for(char c : chars){
                if(c == '.'){
                    if(!stack.isEmpty()){
                        System.out.println("no");
                        break;
                    }
                    System.out.println("yes");
                    break;
                }
                if(c == '(' || c == '['){
                    stack.push(c);
                }else if(c == ')'){
                    if(stack.isEmpty()){
                        System.out.println("no");
                        break;
                    }
                    Character peek = stack.peek();
                    if(peek == '('){
                        stack.pop();
                    }else{
                        System.out.println("no");
                        break;
                    }
                }else if(c == ']'){
                    if(stack.isEmpty()){
                        System.out.println("no");
                        break;
                    }
                    Character peek = stack.peek();
                    if(peek == '['){
                        stack.pop();
                    }else{
                        System.out.println("no");
                        break;
                    }
                }
            }
        }
    }
}
