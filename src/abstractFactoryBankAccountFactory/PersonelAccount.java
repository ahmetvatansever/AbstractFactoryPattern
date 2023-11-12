package abstractFactoryBankAccountFactory;

public class PersonelAccount implements BankAccount{
    @Override
    public String registerAccount() {
        return "PersonelAccount olusturuldu.";
    }
}
