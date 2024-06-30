
public class Equal_weight_student extends Candidate{

	public Equal_weight_student(int turkish, int math, int literature, int physic, String name) {
		super(turkish, math, literature, physic, name);
		
	}

	@Override
	public int calculatePoint() {
		
		return getTurkish()*5 + getMath()*5 + getPhysic()*1 + getLiterature()*4;
		
	}

}
