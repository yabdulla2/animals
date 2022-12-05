
public class animal {
public animal(String movement, String bodypart, int numoflegs) {
this.movement = movement;
this.bodypart = bodypart;
this.numoflegs = numoflegs

}
public void printAnimalInformation() {
	System.out.printf("Movement; %s Bodypart; %s Numoflegs; %d %n", this.movement, this.bodypart, this.numoflegs);
}


}
