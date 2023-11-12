package abstractFactoryBankAccountFactory;

public class BankAccountFactory {
    public BankAccount createBankAccount(String bankType){
        BankAccount bankAccount = null;

        if (bankType.equals("Personal")) {
            bankAccount = new PersonelAccount();
        }
        else if (bankType.equals("Business")) {
            bankAccount = new PersonelAccount();
        }
        else{
          System.out.println("Geçersiz hesap tipi:" + bankType);
        }

        return bankAccount;
    }
}
