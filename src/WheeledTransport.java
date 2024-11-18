import java.util.Objects;

public abstract class WheeledTransport implements Service {
    protected String type;
    protected byte wheelCount;
    protected String color;

    public WheeledTransport(String type, byte wheelCount, String color) {
        this.type = type;
        this.wheelCount = wheelCount;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WheeledTransport that = (WheeledTransport) o;
        return wheelCount == that.wheelCount && Objects.equals(type, that.type) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, wheelCount, color);
    }


    abstract public void makeRepaired();
    abstract public void makePumped();
    abstract public void makeColored();

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
