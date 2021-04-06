package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.gui.TrafficLightGui;

public interface State {
    void next(TrafficLightCtrl tlc);
    void prev(TrafficLightCtrl tlc);
    TrafficLightColor getColor();
}