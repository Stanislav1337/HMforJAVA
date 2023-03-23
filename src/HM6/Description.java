package HM6;

import java.util.Objects;

public class Description {

    private Double SIZE;
    private String MODEL;
    private String CPU;
    private String OS;
    private Integer RAM;
    private Integer SSD;

    public Description(Double SIZE, String MODEL, String CPU, String OS, Integer RAM, Integer SSD) {
        this.SIZE = SIZE;
        this.MODEL = MODEL;
        this.CPU = CPU;
        this.OS = OS;
        this.RAM = RAM;
        this.SSD = SSD;
    }

    public Double getSIZE() {
        return SIZE;
    }

    public String getMODEL() {
        return MODEL;
    }

    public String getCPU() {
        return CPU;
    }

    public String getOS() {
        return OS;
    }

    public Integer getRAM() {
        return RAM;
    }

    public Integer getSSD() {
        return SSD;
    }


    public void setSIZE(Double SIZE) {
        this.SIZE = SIZE;
    }

    public void setMODEL(String MODEL) {
        this.MODEL = MODEL;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public void setSSD(Integer SSD) {
        this.SSD = SSD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Description that = (Description) o;
        return Objects.equals(SIZE, that.SIZE) && Objects.equals(MODEL, that.MODEL) && Objects.equals(CPU, that.CPU) && Objects.equals(OS, that.OS) && Objects.equals(RAM, that.RAM) && Objects.equals(SSD, that.SSD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SIZE, MODEL, CPU, OS, RAM, SSD);
    }

    @Override
    public String toString() {
        return "Description{" +
                "SIZE=" + SIZE +
                ", MODEL='" + MODEL + '\'' +
                ", CPU='" + CPU + '\'' +
                ", OS='" + OS + '\'' +
                ", RAM=" + RAM +
                ", SSD=" + SSD +
                '}';
    }

//    public int compareTo(Description n){
//         return MODEL.compareTo(n.getMODEL());
//    }
}


