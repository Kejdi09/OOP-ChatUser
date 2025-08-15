public class Computer {
    private CPU cpu;
    private RAM ram;
    private HardDisk hard_disk;
    private Motherboard motherboard;
    private int assembled_year;
    private double price;

    Computer(CPU cpu, RAM ram, HardDisk hard_disk, Motherboard motherboard, int assembled_year, double price){
        this.cpu = cpu;
        this.ram = ram;
        this.hard_disk = hard_disk;
        this.motherboard = motherboard;
        setAssembled_year(assembled_year);
        setPrice(price);
    }

    public CPU getCpu(){ return cpu; }
    public void setCpu(CPU cpu){ this.cpu = cpu; }

    public RAM getRam(){ return ram; }
    public void setRam(RAM ram){ this.ram = ram; }

    public HardDisk getHard_disk(){ return hard_disk; }
    public void setHard_disk(HardDisk hard_disk){ this.hard_disk = hard_disk; }

    public Motherboard getMotherboard(){ return motherboard; }
    public void setMotherboard(Motherboard motherboard){ this.motherboard = motherboard; }

    public int getAssembled_year(){ return assembled_year; }
    public void setAssembled_year(int assembled_year){ if (assembled_year > 1970) this.assembled_year = assembled_year; }

    public double getPrice(){ return price; }
    public void setPrice(double price){ if (price >= 0) this.price = price; }


    @Override
    public String toString() {
        return "Computer assembled in " + assembled_year + ", priced at $" + price + "\n" +
                "CPU: " + cpu.toString() + "\n" +
                "RAM: " + ram.toString() + "\n" +
                "Hard Disk: " + hard_disk.toString() + "\n" +
                "Motherboard: " + motherboard.toString();
    }
}
