public class Reformatory {
    private int weightMeasures=0;
    
    public int weight(Person person) {
        int weight = person.getWeight();
        weightMeasures+=1;
        return weight;
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    
    public int totalWeightsMeasured(){
        return weightMeasures;
    }

}
