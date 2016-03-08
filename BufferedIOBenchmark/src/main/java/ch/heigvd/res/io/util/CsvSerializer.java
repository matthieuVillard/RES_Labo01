package ch.heigvd.res.io.util;

import ch.heigvd.res.io.ExperimentData;

import java.io.PrintStream;

/**
 * Created by matthieu.villard on 08.03.2016.
 */
public class CsvSerializer
{
    public static void serialize(ExperimentData data, PrintStream ps){
        String csv = data.getOperation() + ";" + data.getStrategy() + ";" + data.getBlockSize() + ";" + data.getNumberOfBytes() + ";" + data.getDuration();
        ps.println(csv);
    }
}
