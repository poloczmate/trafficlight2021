package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState implements State{
    private TrafficLightColor color = TrafficLightColor.YELLOW;

    public TrafficLightColor getColor() {
        return color;
    }

    @Override
    public void nextState(TrafficLightCtrl tlc) {
        tlc.setPreviousState(this);
        tlc.setCurrentState(new RedState());
    }
}
