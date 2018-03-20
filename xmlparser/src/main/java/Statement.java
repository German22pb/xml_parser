
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public final class Statement {
    @JacksonXmlProperty(localName = "id", isAttribute = true)
    private String id;
    @JacksonXmlProperty(localName = "account")
    private String account;
    @JacksonXmlProperty(localName = "bank")
    private String bank;
    @JacksonXmlProperty(localName = "amount")
    private int amount;
    public Statement() {
    }
    public Statement(String id, String account, String bank, int amount) {
        this.id = id;
        this.account = account;
        this.bank = bank;
        this.amount = amount;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getBank() {
        return bank;
    }
    public void setBank(String bank) {
        this.bank = bank;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override public String toString() {
        return "Statement{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", bank='" + bank + '\'' +
                ", amount=" + amount +
                '}';
    }
}