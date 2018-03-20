import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Arrays;
import java.util.List;


@JacksonXmlRootElement(localName = "statements") public class Statements {
    @JacksonXmlElementWrapper(localName = "statement", useWrapping = false)
    private List<Statement> statement;

    public Statements() {}

    public Statements(List<Statement> statement) {
        this.statement = statement;
    }

    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(List<Statement> statement) {
        this.statement = statement;
    }

    @Override public String toString() {
        return "statements{" +
                "statements=" + Arrays.toString(statement.toArray()) +
                '}';
    }
}
