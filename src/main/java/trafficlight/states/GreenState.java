package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class GreenState implements State{
    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.GREEN;
    }

    @Override
    public void nextState(TrafficLightCtrl tlc) {
        tlc.setPreviousState(this);
        tlc.setCurrentState(new YellowState());
    }
}
