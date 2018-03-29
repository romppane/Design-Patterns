
public class ComputerFacade {
	private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        processor.execute(ram.load(123, hd.read(333234, 77)));
        processor.jump(323);
    }

}
