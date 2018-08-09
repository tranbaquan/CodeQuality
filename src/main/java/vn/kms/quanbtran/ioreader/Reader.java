package vn.kms.quanbtran.ioreader;

import lombok.NoArgsConstructor;

import java.io.*;

@NoArgsConstructor
public class Reader {

    private BufferedReader br;

    public void openStream(String sourceFile) {

        try {
            InputStream is = new FileInputStream(sourceFile);
            this.br = new BufferedReader(new InputStreamReader(is));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("source file not found.");
        }
    }

    public String readLine() throws IOException {

        return br.readLine();

    }

    public void closeStream(){

        try {
            this.br.close();
        } catch (IOException e) {
            throw  new RuntimeException("can not close stream.");
        }

    }

}
