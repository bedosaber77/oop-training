public class BasicProcessor implements Processor {
    int load;
    @Override
    public void on() {
        load=5;
    }

    @Override
    public void off() {
        load=0;
    }

    @Override
    public void execute(int load) {
        this.load+=load;
        if(this.load>100) this.load=100;
    }

    @Override
    public void reduceUsage() {
        if(load>=30)
            load-=25;
    }
}
