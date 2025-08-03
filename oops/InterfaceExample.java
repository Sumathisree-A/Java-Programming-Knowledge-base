/*

interface   - blueprint of class
            - it has static constants and abstract methods
            - methods declared inside are abstract by default
            - loose coupling
            - can support functionality of multiple inheritance
            - using interface keyword
            - all fields are public , final and static by default
            - class implements an interface must implement all methods declared in the interface

*/

interface IABCBank
{
    default void welcome()  // default or static method can have body
    {
        System.out.println("Welcome to ABC bank...");
    }
    void openAccount();
    void closeAccount();
}

interface IBankAccount
{
    // abstract methods by default
    void deposit();
    void withdraw();
    void balance();
}


class savingAccount implements IBankAccount , IABCBank  // directly add interface here
{
    public void openAccount()
    {
        System.out.println("Open Account...");
    }

    public void deposit()
    {
        System.out.println("Deposit in your account...");
    }

    public void withdraw()
    {
        System.out.println("Withdraw from your account");
    }

    public void balance()
    {
        System.out.println("check balance...");
    }

    public void closeAccount()
    {
        System.out.println("Close the acct");
    }
}

public class InterfaceExample
{
    public static void main(String[] args) {

        savingAccount sa = new savingAccount();
        sa.openAccount();
        sa.deposit();
        sa.withdraw();
        sa.balance();
        sa.closeAccount();
    }
}