package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class GreenState implements State{
    public TrafficLightColor getColor() {
        return color;
    }

    private TrafficLightColor color = TrafficLightColor.GREEN;
    @Override
    public void nextState(TrafficLightCtrl tlc) {
        tlc.setPreviousState(this);
        tlc.setCurrentState(new YellowState());
    }
}
