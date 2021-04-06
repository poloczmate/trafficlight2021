import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.states.GreenState;
import trafficlight.states.RedState;
import trafficlight.states.YellowState;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

public class AppTest {
    @Test
    public void check_Colors(){
        TrafficLightCtrl tlc = new TrafficLightCtrl();

        assertThat(tlc.getCurrentState(), instanceOf(RedState.class));
        tlc.nextState();
        assertThat(tlc.getCurrentState(), instanceOf(GreenState.class));
        tlc.nextState();
        assertThat(tlc.getCurrentState(), instanceOf(YellowState.class));
        tlc.nextState();
        assertThat(tlc.getCurrentState(), instanceOf(RedState.class));
    }
}
