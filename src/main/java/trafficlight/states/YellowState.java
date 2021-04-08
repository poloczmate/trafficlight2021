package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState implements State{
    private TrafficLightColor color = TrafficLightColor.YELLOW;


    public TrafficLightColor getColor() {
        return color;
    }

    @Override
    public State getState() {
        return this;
    }

    @Override
    public void nextState(TrafficLightCtrl tlc) {
        if (tlc.getPreviousState().getColor().equals(TrafficLightColor.RED)){
            tlc.setPreviousState(this);
            tlc.setCurrentState(new GreenState());
        }else{
            tlc.setPreviousState(this);
            tlc.setCurrentState(new RedState());
        }
    }
}
