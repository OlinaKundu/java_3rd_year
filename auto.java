public class auto {
    public static void main(String args[]){
        for(int num=11;num<=40;num++){
            int square=num*num;
            int tempNum=num;
            int tempSquare= square;
            boolean isAuto=true;

            while(tempNum>0){
                int digitNum=tempNum%10;
                int digitSquare=tempSquare %10;

                if(digitNum!=digitSquare){
                    isAuto=false;
                    break;
                }
                tempNum/=10;
                tempSquare/=10;
            }
            if(isAuto){
                System.out.println(num + " is Automorphic");
            }
        }
    }
}
