package ROB;

public class Arena {
	public String fight(robot ro1, robot ro2) {
		if(ro1.isDead() == false && ro2.isDead() ==false) {
			ro1.Fire(ro2);
			
			while(ro2.isDead() == false) {
				ro2.Fire(ro1);
				if(ro1.isDead() ==false) {
					ro1.Fire(ro2);
				}else {
					return"Le robot vainqueur est" +ro2.getNom();
				}
			}
			return "Le robot vainqueur est" +ro1.getNom();
		}
		
		else {
			if(ro1.isDead() == true) {
				return " Le" +ro1.getNom() + "est déjà mort";
			}
			
			else if(ro2.isDead() ==true) {
				return " Le " +ro2.getNom() + "est déjà mort"; 
			}
			
			else {
				return " Les deux robots sont déjà morts";
			}
		}
	}
}
