package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class RedState implements State{
    private TrafficLightColor color = TrafficLightColor.RED;

    public TrafficLightColor getColor() {
        return color;
    }

    @Override
    public State getState() {
        return this;
    }

    @Override
    public void nextState(TrafficLightCtrl tlc) {
        tlc.setPreviousState(this);
        tlc.setCurrentState(new YellowState());
    }
}
