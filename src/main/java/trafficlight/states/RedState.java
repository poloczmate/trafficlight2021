package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class RedState implements State{
    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.RED;
    }

    @Override
    public void nextState(TrafficLightCtrl tlc) {
        tlc.setPreviousState(this);
        tlc.setCurrentState(new YellowState());
    }
}
