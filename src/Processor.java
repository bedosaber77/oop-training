public interface Processor {
    void on();

    void off();

    void execute(int load);

    void reduceUsage();
}
