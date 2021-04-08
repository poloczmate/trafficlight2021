package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.gui.TrafficLightGui;

public interface State {
    void nextState(TrafficLightCtrl tlc);
    TrafficLightColor getState();
}