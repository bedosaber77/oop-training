public class HybridProcessor implements Processor {
    BasicProcessor Basicprocessor;
    PerformanceProcessor Performanceprocessor;
    int load;

    public HybridProcessor() {
        Basicprocessor = new BasicProcessor();
        Performanceprocessor = new PerformanceProcessor();
    }

    @Override
    public void on() {
        Basicprocessor.on();
        Performanceprocessor.on();
        this.load = 5;
    }

    @Override
    public void off() {
        this.Basicprocessor.off();
        this.Performanceprocessor.off();
        this.load = 0;
    }

    @Override
    public void execute(int load) {
        if(this.load+load<=30){
            this.Basicprocessor.execute(load);
        }
        else if(this.load+load>=30&&this.load+load<=70){
            this.Performanceprocessor.execute(load);
        }
        else{
            this.Performanceprocessor.execute(load/2);
            this.Basicprocessor.execute(load/2);
        }
        this.load = Math.min(load,100);
    }

    @Override
    public void reduceUsage() {
        if(this.load<30){
           this.Basicprocessor.reduceUsage();
        }
        else if(this.load>=30&&this.load<=70){
            this.Performanceprocessor.reduceUsage();
        }
        else if(this.load>=70){
            this.Performanceprocessor.reduceUsage();
            this.Basicprocessor.reduceUsage();
        }
        this.load-=25;
        if(this.load< 5) this.load=5;
    }
}
