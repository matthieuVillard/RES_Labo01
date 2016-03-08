package ch.heigvd.res.io;


/**
 * Created by matthieu.villard on 08.03.2016.
 */
public class ExperimentData
{
    private String operation;
    private BufferedIOBenchmark.IOStrategy strategy;
    private long numberOfBytes;
    private int blockSize;
    private long duration;

    public ExperimentData(String operation, BufferedIOBenchmark.IOStrategy strategy, long numberOfBytes, int blockSize, long duration){
        this.operation = operation;
        this.strategy = strategy;
        this.numberOfBytes = numberOfBytes;
        this.blockSize = blockSize;
        this.duration = duration;
    }

    public String getOperation(){
        return operation;
    }

    public BufferedIOBenchmark.IOStrategy getStrategy(){
        return strategy;
    }

    public long getNumberOfBytes(){
        return numberOfBytes;
    }

    public int getBlockSize(){
        return blockSize;
    }

    public long getDuration(){
        return duration;
    }
}
