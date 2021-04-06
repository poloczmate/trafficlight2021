package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class RedState implements State{
    public TrafficLightColor getColor() {
        return color;
    }

    private TrafficLightColor color = TrafficLightColor.RED;
    @Override
    public void next(TrafficLightCtrl tlc) {
        tlc.setPreviousState(this);
        tlc.setCurrentState(new GreenState());
    }

    @Override
    public void prev(TrafficLightCtrl tlc) {
        tlc.setPreviousState(this);
        tlc.setCurrentState(new YellowState());
    }
}
