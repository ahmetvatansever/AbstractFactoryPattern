package abstractFactoryBankAccountFactory;

public class BusinessAccount implements BankAccount{
    @Override
    public String registerAccount() {
        return "BusinessAccount olusturuldu.";
    }
}
