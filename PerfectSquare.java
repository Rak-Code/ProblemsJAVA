public class PerfectSquare {
    public static void main(String[] args) {
        int n = 25;
        boolean check = false;
        for(int i = 0;i <= n;i++){
            if(i*i == n){
                check = true;
        }
    }   
        if (check) {
            System.out.println(n + " is a perfect square");
        }
        else {
            System.out.println(n + " is not a perfect square");
        }       

}   
}
