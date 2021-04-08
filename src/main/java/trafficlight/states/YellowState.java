package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState implements State{
    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.YELLOW;
    }

    @Override
    public void nextState(TrafficLightCtrl tlc) {
        if (tlc.getPreviousState().getState().equals(TrafficLightColor.RED)){
            tlc.setPreviousState(this);
            tlc.setCurrentState(new GreenState());
        }else{
            tlc.setPreviousState(this);
            tlc.setCurrentState(new RedState());
        }
    }
}
