package test;

public class Q4 {
	public String name;
	public String grade;
	public Q4(String name) {
		this.name = name;
	}
}
public class Engineer extends Q4 {
	
	private String skillset;

	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	
}
