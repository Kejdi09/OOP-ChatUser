public class Test {
    public static void main(String[] args){
        CPU cpu1 = new CPU(3, "CISC", 32, 64, "AMD");
        RAM ram1 = new RAM(4, "DDR2", "Kingston");
        HardDisk hd1 = new HardDisk(500, 7200, "Maxtor");
        Motherboard mb1 = new Motherboard("AMD970", 6, 16, "AMD");

        CPU cpu2 = new CPU(4, "CISC", 32, 32, "INTEL");
        RAM ram2 = new RAM(8, "DDR3", "Kingston");
        HardDisk hd2 = new HardDisk(1000, 7200, "Seagate");
        Motherboard mb2 = new Motherboard("IntelZ77", 6, 64, "MSI");

        Computer computer1 = new Computer(cpu1, ram1, hd1, mb1, 2021, 482.5);
        Computer computer2 = new Computer(cpu2, ram2, hd2, mb2, 2022, 560.75);

        System.out.println(computer1);
        System.out.println();
        System.out.println(computer2);


    }
}
