package edu.wust.dp.HFCommand.command;

import edu.wust.dp.HFCommand.light;

public class lightOffCommand implements Command {
private light Light;
	public lightOffCommand(light L){
		this.Light=L;		
	}
	@Override
	public void exe() {
		Light.off();
	}
	public void undo(){
		Light.on();
	}
}