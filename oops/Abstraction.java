/*
    Abstract class 
                - cannot be instantiated directly
                - restricted class that can't create obj. must be inherited from another cls.
                - provides a blueprint for other classes and meant to be subclassed
                - abstract keyword
                - can have both regular methods and abstract methods
                
    Abstract method - used in abstract class and has no body.

*/

abstract class BankAccount
{

    // provides blueprint
    public void message()
    {
        System.out.println("Savings Account");
    }
    abstract void deposit();
    abstract void withDraw();
    abstract void balance();
}

class SavingAccount extends BankAccount{
    
    @Override
    void deposit()
    {
        System.out.println("Deposit in your account");
    }

    @Override
    void withDraw()
    {
        System.out.println("Withdraw from your account");
    }

    @Override
    void balance()
    {
        System.out.println("checking the balance");
    }
}

public class Abstraction
{
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.message();
        sa.deposit();
        sa.balance();
        sa.withDraw();
        sa.balance();
    }
}