package edu.wust.dp.HFCommand;

import edu.wust.dp.HFCommand.command.Command;

public class simpleRemoteControl {
	Command slot;
	public simpleRemoteControl(){}
	public void setCommand(Command command){
		slot = command;
	}
	public void buttonPressed(){
		slot.exe();
	}
}
