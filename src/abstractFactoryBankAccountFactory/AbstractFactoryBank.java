package abstractFactoryBankAccountFactory;

public class AbstractFactoryBank {
    public static void main(String[] args) {
        BankAccount bankAccount = null;
        BankAccountFactory bankAccountFactory = new BankAccountFactory();

        bankAccount = bankAccountFactory.createBankAccount("Personal");
        bankAccount.registerAccount();

    }
}
