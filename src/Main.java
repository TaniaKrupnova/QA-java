public class Main {

    public static void main(String[] args){
        boolean program = false;
        int sumTicket = 500;

       int accrual;
        if(program) {
             accrual = 20;
        }else {
             accrual = 1;
        }
        int mili = sumTicket/20 * accrual;
        System.out.println("Количество миль:" + mili);
    }
}
