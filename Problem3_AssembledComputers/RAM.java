public class RAM {
    private int size;
    private String type, manufacturer;
    RAM(int size, String type, String manufacturer){
        setSize(size);
        setType(type);
        setManufacturer(manufacturer);
    }

    public int getSize(){ return size; }
    public void setSize(int size){ if(size > 0) this.size = size; }

    public String getType(){ return type; }
    public void setType(String type){ if (type.equalsIgnoreCase("DDR") || type.equalsIgnoreCase("DDR2") || type.equalsIgnoreCase("DDR3")) this.type = type.toUpperCase(); }

    public String getManufacturer(){ return manufacturer; }
    public void setManufacturer(String manufacturer){ this.manufacturer = manufacturer; }


    @Override
    public String toString() {
        return size + " GB, " + type + ", " + manufacturer;
    }
}
