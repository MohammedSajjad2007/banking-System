import java.util.Scanner;
class bankaccount {
    protected int accountnum;
    protected double balance;

    bankaccount(int a2 , double b2){
        this.accountnum = a2;
        this.balance = b2;
    }

    public int getAccountnum(){
        return accountnum;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double dpamm){
        double bal = getBalance() + dpamm;
        System.out.println("Balance: " + bal);
    }
    public void widthraw(double wdamm){
        double ball = getBalance() - wdamm;
        System.out.println("Balance: " + ball);
    }
}
class savingacc extends bankaccount{
    private String accholdername;

    savingacc(int a2, double b2 , String c){
        super(a2,b2);
        this.accholdername = c;
    }
    public String getAccholdername(){
        return accholdername;
    }
}
class checkingacc extends bankaccount{
    checkingacc(int a, double b){
        super(a,b);
    }
}
class bankdrive{
    public static void main(String args[]){
        Scanner scs = new Scanner(System.in);
        System.out.println("Enter the deposite ammount: ");
        double dpamm = scs.nextDouble();
        System.out.println("Enter the Widthraw Ammount: ");
        double wdamm = scs.nextDouble();

        savingacc sa = new savingacc(1003834045 , 200000.00, "Alexa");
        checkingacc ca = new checkingacc(1003834045 , 200000.00);

        System.out.println("Account number: " + sa.getAccountnum());
        System.out.println("Account holder name: " + sa.getAccholdername());
        sa.widthraw(wdamm);
        sa.deposit(dpamm);
        System.out.println("Balance: " + ca.getBalance());
    }
}
