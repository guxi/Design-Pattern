package edu.wust.dp.HFCommand;

import edu.wust.dp.HFCommand.command.Command;
import edu.wust.dp.HFCommand.command.noCommand;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	//��ʼ��ң������ÿ����ťΪ������,��undo��ť
	public RemoteControl(){
		onCommands=new Command[7];
		offCommands=new Command[7];
		
		/// ����7��������
		Command NoCommand=new noCommand();
		for(int i=0;i<7;i++)
		{
			onCommands[i]=NoCommand;
			offCommands[i]=NoCommand;
		}	
		undoCommand=NoCommand;
	}
	
	/**
	 * ����ң����ÿ����ť������
	 * @param slot
	 * @param onCommand
	 * @param offCommand
	 */
	public void setCommand(int slot,Command onCommand,Command offCommand)
	{
		onCommands[slot]=onCommand;
		offCommands[slot]=offCommand;
	}
	
	/**
	 * slot��on��ť����
	 * @param slot
	 */
	public void onButtonWasPushed(int slot){
		onCommands[slot].exe();
		undoCommand=onCommands[slot];
	}
	/**
	 * slot��off��ť����
	 * @param slot
	 */
	public void offButtonWasPushed(int slot){
		offCommands[slot].exe();
		undoCommand=offCommands[slot];
	}
	
	public void undoButtonWasPushed(){
		undoCommand.undo();
	}
	
	public String toString(){
		StringBuffer SB=new StringBuffer();
		SB.append("\n--- Remote Control ----\n");
		for(int i=0;i<onCommands.length;i++)
		{
			SB.append("[slot "+i+"]"+onCommands[i].getClass().getName()
					+" , "+offCommands[i].getClass().getName()+"\n");
		}
		return SB.toString();
	}

}
