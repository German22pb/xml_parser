import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Parser {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new XmlMapper();
        File xmlFile = new File("/tmp/statement.xml");
        Statements statements = objectMapper.readValue(
                StringUtils.toEncodedString(Files.readAllBytes(Paths.get(xmlFile.getPath())), StandardCharsets.UTF_8),
                Statements.class);
        List<Statement> statementsList = statements.getStatement();
        for (Statement statement : statementsList) {
            System.out.println("Account: " + statement.getAccount());
        }
        statementsList.add(new Statement("55", "4545454545", "ABB", 777));
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(statements);

        FileWriter writer = new FileWriter(xmlFile.getPath());
        writer.write(xml);
        System.out.println(xml);
        writer.close();
    }
}