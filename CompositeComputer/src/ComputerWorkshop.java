
public class ComputerWorkshop {

	public static void main(String[] args) {
		Component cpu = new CPU();
		Component casing = new Case();
		Component gpu = new GPU();
		Component mb = new Motherboard();
		Component nc = new NetworkCard();
		Component ram1 = new RAM();
		Component ram2 = new RAM();

		cpu.setPrice(200.00);
		casing.setPrice(79.89);
		gpu.setPrice(219.55);
		mb.setPrice(179.00);
		nc.setPrice(54.95);
		ram1.setPrice(35.55);
		ram2.setPrice(35.55);

		ram1.Add(ram2);

		mb.Add(cpu);
		mb.Add(gpu);
		mb.Add(nc);
		mb.Add(ram2);
		mb.Add(ram1);

		casing.Add(mb);

		System.out.println(casing.getPrice());
		// TODO Auto-generated method stub

	}

}
