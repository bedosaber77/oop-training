public class PerformanceProcessor implements Processor {
    int load;
    final int cores = 4;
    @Override
    public void on() {
        this.load = 5;
    }

    @Override
    public void off() {
        this.load = 0;
    }

    @Override
    public void execute(int load) {
        int loadPerCore = load/this.cores;
        this.load += loadPerCore;
        if(this.load >100) this.load = 100;
    }

    @Override
    public void reduceUsage() {
        if(load>=30)
            load-=25;
    }
}
