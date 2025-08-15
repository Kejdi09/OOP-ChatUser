public class Motherboard {
    private String chipset_version, maufacturer;
    private int usb_ports, max_ram_capacity;
    Motherboard(String chipset_version, int usb_ports, int max_ram_capacity, String maufacturer){
        setChipset_version(chipset_version);
        setUsb_ports(usb_ports);
        setMax_ram_capacity(max_ram_capacity);
        setMaufacturer(maufacturer);
    }

    public String getChipset_version(){ return chipset_version; }
    public void setChipset_version(String chipset_version){ this.chipset_version = chipset_version.toUpperCase(); }

    public int getUsb_ports(){ return usb_ports; }
    public void setUsb_ports(int usb_ports){ if(usb_ports > 0) this.usb_ports = usb_ports; }

    public int getMax_ram_capacity(){ return max_ram_capacity; }
    public void setMax_ram_capacity(int max_ram_capacity){ if(max_ram_capacity > 0) this.max_ram_capacity = max_ram_capacity; }

    public String getMaufacturer(){ return  maufacturer;}
    public void setMaufacturer(String maufacturer){ this.maufacturer = maufacturer; }
}
