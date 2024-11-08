public abstract class MotorizedTransport implements Service  {
    protected String engineType;
    protected String model;

    public MotorizedTransport(String engineType, String model) {
        this.engineType = engineType;
        this.model = model;
    }

    abstract public void showEngineType();
    abstract public void showModel();
    abstract public void makeRepaired();
    abstract public void makePumped();

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
}
