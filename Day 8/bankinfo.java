class bankdetails{
    int balance;
    void initialbalance(int amount){
        balance=amount;
        System.out.println("balance: "+balance);
    }
    void deposit(int amount){
        balance+=amount;
        System.out.println("Amount deposited: "+amount);
        getbalance();
    }
    void withdrawal(int amount){
        if(amount<=balance){
        System.out.println("Amount withdrawed is: "+amount);
        balance-=amount;
        }else{
            System.out.println("insufficient amount!!");
        }
    }
    void getbalance(){
        System.out.println("balance amount: "+balance);
    }

}

public class bankinfo{
    public static void main(String[] args) {
        bankdetails bd1=new bankdetails();
        bankdetails bd2=new bankdetails();
        bd1.initialbalance(5000);
        bd1.deposit(1000);
        bd1.withdrawal(7000);
        bd1.getbalance();
    }
}