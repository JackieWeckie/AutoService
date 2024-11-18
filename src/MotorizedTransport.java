import java.util.Objects;

public abstract class MotorizedTransport implements Service  {
    protected String engineType;
    protected String model;
    protected byte wheelCount;
    protected String color;

    public MotorizedTransport(String engineType, String model, String color) {
        this.engineType = engineType;
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MotorizedTransport that = (MotorizedTransport) o;
        return wheelCount == that.wheelCount && Objects.equals(engineType, that.engineType)
                && Objects.equals(model, that.model) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, model, wheelCount, color);
    }

    abstract public void showEngineType();
    abstract public void showModel();
    abstract public void makeRepaired();
    abstract public void makePumped();
    abstract public void makeColored();

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
