package edu.wust.dp.HFCommand.command;

import edu.wust.dp.HFCommand.light;

public class lightOnCommand implements Command {
private light Light;
	public lightOnCommand(light L){
		this.Light=L;		
	}
	
	@Override
	public void exe() {
		Light.on();

	}
	public void undo(){
		Light.off();
	}
}
