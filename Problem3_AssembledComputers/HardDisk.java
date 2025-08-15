public class HardDisk {
    private int size, rpm; //rpm stands for "rotations per minute"
    private String manufacturer;
    HardDisk(int size, int rpm, String manufacturer){
        setSize(size);
        setRpm(rpm);
        setManufacturer(manufacturer);
    }

    public int getSize(){ return size; }
    public void setSize(int size){ if(size > 0) this.size = size;}

    public int getRpm(){ return rpm; }
    public void setRpm(int rpm){if(rpm > 0) this.rpm = rpm;}

    public String getManufacturer(){ return manufacturer;}
    public void setManufacturer(String manufacturer){ this.manufacturer = manufacturer;}



    @Override
    public String toString() {
        return size + " GB, " + rpm + " RPM, " + manufacturer;
    }
}
