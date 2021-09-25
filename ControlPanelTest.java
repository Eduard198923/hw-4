class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumSum();
        FirTest firTest = new FirTest();

        //Should be 6
        System.out.println(firTest.test(firNum, 3));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum{
   int sum = 0 ;
    @Override
    public int calc(int n) {
        for(int i = 1; i <= n; i++){
            sum +=  i;
        }
        return sum;
}
      

}


