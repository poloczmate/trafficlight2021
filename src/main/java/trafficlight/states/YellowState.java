package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState implements State{
    private TrafficLightColor color = TrafficLightColor.YELLOW;

    public TrafficLightColor getColor() {
        return color;
    }

    @Override
    public void next(TrafficLightCtrl tlc) {
        tlc.setPreviousState(this);
        tlc.setCurrentState(new RedState());
    }

    @Override
    public void prev(TrafficLightCtrl tlc) {
        tlc.setPreviousState(this);
        tlc.setCurrentState(new GreenState());
    }
}
