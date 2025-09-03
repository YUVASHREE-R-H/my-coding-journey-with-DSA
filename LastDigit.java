class LastDigit{
    public static void main(String[] args) {
        int n=12345;
        while(n>0){
            int last = n%10;
            System.out.println(last);
            n=n/10;
        }
    }
}
