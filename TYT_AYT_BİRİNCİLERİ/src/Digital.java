
public class Digital extends Candidate{

	public Digital(int turkish, int math, int literature, int physic, String name) {
		super(turkish, math, literature, physic, name);
		
	}

	@Override
	public int calculatePoint() {
		
		return getTurkish()*5 + getMath()*5 + getPhysic()*4 + getLiterature()*1;
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
