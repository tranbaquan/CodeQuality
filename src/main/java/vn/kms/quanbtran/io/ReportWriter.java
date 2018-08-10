package vn.kms.quanbtran.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ReportWriter {

    public Writer openFile(String folder, String fileName){
        try {
            File output = new File(folder);
            if (!output.exists()) {
                output.mkdirs();
            }
            Writer writer = new FileWriter(new File(output, fileName));
            return writer;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
