package components;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import tests.KinomanDescriptionPageTest;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

public class OpenCvsFile {
    String nameOfFile = "descriptionOfFilm.csv";

    public String openCsvFileAndGetDescription(String searchValueTitle) throws Exception {
        CSVParser parser = new CSVParserBuilder()
                .withSeparator('|')
                .build();

        final ClassLoader cl = KinomanDescriptionPageTest.class.getClassLoader();
        InputStream is = cl.getResourceAsStream(nameOfFile);
        Reader reader = new InputStreamReader(is);
        CSVReader csvFile = new CSVReaderBuilder(reader).withCSVParser(parser).build();
        List<String[]> data = csvFile.readAll();
        String[] arr;
        String filmDescription = "";
        int i = 0;
        while (i < data.size()) {
            arr = data.get(i);
            if (arr[i].equals(searchValueTitle)) {
                filmDescription = arr[i + 1];
                break;
            }
            i++;
        }
        return filmDescription;
    }
}
