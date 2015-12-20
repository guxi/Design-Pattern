package edu.wust.dp.HFCommand;

import edu.wust.dp.HFCommand.command.Command;
import edu.wust.dp.HFCommand.command.noCommand;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	//初始化遥控器，每个按钮为空命令,含undo按钮
	public RemoteControl(){
		onCommands=new Command[7];
		offCommands=new Command[7];
		
		/// 设置7个空命令
		Command NoCommand=new noCommand();
		for(int i=0;i<7;i++)
		{
			onCommands[i]=NoCommand;
			offCommands[i]=NoCommand;
		}	
		undoCommand=NoCommand;
	}
	
	/**
	 * 设置遥控器每个按钮的命令
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
	 * slot排on按钮按下
	 * @param slot
	 */
	public void onButtonWasPushed(int slot){
		onCommands[slot].exe();
		undoCommand=onCommands[slot];
	}
	/**
	 * slot排off按钮按下
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
