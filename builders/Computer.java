package builders;

public class Computer{
  private final String cpu;
  private final int ram;

  private final int storage;
  private final String gpu;
  private final String operatingSystem;


  private Computer(Builder builder){
    this.cpu = builder.cpu;
    this.ram = builder.ram;
    this.storage = builder.storage;
    this.gpu = builder.gpu;
    this.operatingSystem = builder.operatingSystem;
  }

  public void displaySpecs() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("GPU: " + gpu);
        System.out.println("OS: " + operatingSystem);
    }
  
  public static class Builder{
    private final String cpu;
    private final int ram;

    private int storage = 256;
    private String gpu = "Integrated Graphics";
    private String operatingSystem = "No OS";

    public Builder(String cpu, int ram){
      this.cpu=cpu;
      this.ram=ram;
    }

    public Builder storage(int storage){
      this.storage=storage;
      return this;
    }

    public Builder gpu(String gpu) {
      this.gpu = gpu;
      return this;
    }

    public Builder operatingSystem(String os) {
      this.operatingSystem = os;
      return this;
    }

    public Computer build(){
      return new Computer(this);
    }

  }
}