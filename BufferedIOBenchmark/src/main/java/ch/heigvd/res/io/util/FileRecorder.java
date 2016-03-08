package ch.heigvd.res.io.util;

import ch.heigvd.res.io.ExperimentData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by matthieu.villard on 08.03.2016.
 */
public class FileRecorder
{
    File outputFile;
    PrintStream ps;

    public FileRecorder(String fileName)  {
        outputFile = new File(fileName);
    }

    public void record(ExperimentData data){
        CsvSerializer.serialize(data, ps);
    }

    public void init() throws FileNotFoundException{
        ps = new PrintStream(outputFile);
    }

    public void println(String ln){
        ps.println(ln);
    }

    public void close(){
        ps.flush();
        ps.close();
    }
}
