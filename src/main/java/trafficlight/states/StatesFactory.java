package trafficlight.states;

public class StatesFactory {
    public State getState(String stateType){
        if (stateType == null){
            return null;
        }else if(stateType.equals("red")){
            return new RedState();
        }else if(stateType.equals("green")){
            return new GreenState();
        }else if(stateType.equals("yellow")){
            return new YellowState();
        }
        return null;
    }
}
