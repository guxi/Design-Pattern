package edu.wust.dp.HFCommand;

import edu.wust.dp.HFCommand.command.lightOffCommand;
import edu.wust.dp.HFCommand.command.lightOnCommand;

public class test {
	public static void main(String[] str) {
		test t = new test();
		// t.simpletest();
		t.remoteControltest();
	}

	public void simpletest() {
		simpleRemoteControl Rcontrol = new simpleRemoteControl();
		light light = new light("living room");
		lightOnCommand lightOn = new lightOnCommand(light);

		Rcontrol.setCommand(lightOn);
		Rcontrol.buttonPressed();
	}

	public void remoteControltest() {
		RemoteControl RC = new RemoteControl();
		light light1 = new light("living room");
		light light2 = new light("Kitchen room");

		lightOnCommand lightOn1 = new lightOnCommand(light1);
		lightOnCommand lightOn2 = new lightOnCommand(light2);
		lightOffCommand lightOff1 = new lightOffCommand(light1);
		lightOffCommand lightOff2 = new lightOffCommand(light2);
		// …Ë÷√“£øÿ∆˜∞¥≈•
		RC.setCommand(0, lightOn1, lightOff1);
		RC.setCommand(1, lightOn2, lightOff2);
		System.out.println(RC);

		RC.onButtonWasPushed(0);
		RC.offButtonWasPushed(1);
		RC.undoButtonWasPushed();
	}
}
