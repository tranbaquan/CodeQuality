package vn.kms.quanbtran.process;

import vn.kms.quanbtran.io.Reader;

public class ReaderReportProcess extends ReportProcessAbstract implements ReportProcess{

    private Reader reader;

    public void open(String sourceFile) {
        reader = new Reader();
        reader.openStream(sourceFile);
    }

    public void close() {
        reader.closeStream();
    }

    @Override
    public void extract() {
        reader.readLine();
        String line;
        while ((line = reader.readLine()) != null){
            data.add(line);
        }
    }
}
