package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class GreenState implements State{
    public TrafficLightColor getColor() {
        return color;
    }

    private TrafficLightColor color = TrafficLightColor.GREEN;
    @Override
    public void next(TrafficLightCtrl tlc) {
        tlc.setPreviousState(this);
        tlc.setCurrentState(new YellowState());
    }

    @Override
    public void prev(TrafficLightCtrl tlc) {
        tlc.setPreviousState(this);
        tlc.setCurrentState(new RedState());
    }
}
