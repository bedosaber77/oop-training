public class Phone {
    Processor processor;

    public Phone(Processor processor) {
        this.processor = processor;
    }

    public void swapProcessor(Processor processor) {
        if(this.processor != null) {
            this.processor.off();
        }
        this.processor = processor;
        this.processor.on();
    }
    void PowerOn(){
        processor.on();
    }
    void PowerOff(){
        processor.off();
    }
    void ProcessTask(int Load){
        processor.execute(15);
    }
    void SleepMode(){
        processor.reduceUsage();
    }
    void UpdateSoftware() {}
    void OptimizePerformance() {}
}
