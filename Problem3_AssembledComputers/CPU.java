public class CPU {
    private int clockFreq, type, numberOfRegisters;
    private String ISA, manufacturer;
    CPU(int clockFreq, String ISA, int type, int numberOfRegisters, String manufacturer){
        setClockFreq(clockFreq);
        setISA(ISA);
        setType(type);
        setNumberOfRegisters(numberOfRegisters);
        setManufacturer(manufacturer);
    }

    public int getClockFreq(){
        return clockFreq;
    }
    public void setClockFreq(int clockFreq){
        this.clockFreq = clockFreq;
    }

    public String getISA(){
        return ISA;
    }
    public void setISA(String ISA){
        this.ISA = ISA.toUpperCase();
    }

    public int getType(){
        return type;
    }
    public void setType(int type){
        if(type == 32 || type == 64)
            this.type = type;
    }

    public int getNumberOfRegisters(){
        return numberOfRegisters;
    }
    public void setNumberOfRegisters(int numberOfRegisters){
        this.numberOfRegisters = numberOfRegisters;
    }

    public String getManufacturer(){
        return manufacturer;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer.toUpperCase();
    }

    @Override
    public String toString() {
        return clockFreq + " GHz, " + ISA + ", " + type + " bit, "
                + numberOfRegisters + " registers, " + manufacturer;
    }
}
