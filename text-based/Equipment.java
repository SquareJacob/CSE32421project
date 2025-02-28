public class Equipment {
    String name;
    String serialNumber;

    Equipment(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }
    // get Info
    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Equipment [name=" + name + ", serialNumber=" + serialNumber + "]";
    }
}