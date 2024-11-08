public abstract class WheeledTransport implements Service {
    protected String type;
    protected byte wheelCount;

    public WheeledTransport(String type, byte wheelCount) {
        this.type = type;
        this.wheelCount = wheelCount;
    }

    abstract public void makeRepaired();
    abstract public void makePumped();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(byte wheelCount) {
        this.wheelCount = wheelCount;
    }
}
