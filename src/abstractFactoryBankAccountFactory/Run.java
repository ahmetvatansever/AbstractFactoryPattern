package abstractFactoryBankAccountFactory;

public class Run {

    public static void main(String[] args) {
        //Factory Design Pattern
        BankAccount bankAccount = null;
        BankAccountFactory bankAccountFactory = new BankAccountFactory();

        bankAccount = bankAccountFactory.createBankAccount("Personal");
        bankAccount.registerAccount();


        //Abstract Factory Design Pattern
        BusinessAccount businessAccount = new BusinessAccount();
        String accountResultBusiness = businessAccount.registerAccount();
        System.out.println(accountResultBusiness);

        String accountResultPersonel = new PersonelAccount().registerAccount();
        System.out.println(accountResultPersonel);
    }
}
