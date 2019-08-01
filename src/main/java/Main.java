import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Path path = Paths.get("text.json");
        try {
            String content = new String(Files.readAllBytes(Paths.get("text.json")));
            WikiContent wikiContent = gson.fromJson(content, WikiContent.class);
            int i = 0;
            for (Datum datum : wikiContent.data) {
                i++;
                Path newPath = Paths.get("content/File_" + datum.pageTitle +"_"+i);
                BufferedWriter bufferedWriter = Files.newBufferedWriter(newPath, StandardOpenOption.CREATE_NEW);
                bufferedWriter.write(datum.oldText+"\n\n");
                bufferedWriter.write(datum.pageTitle);
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
