package org.kosta;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Command> cmds = new ArrayList<Command>();
		  
		cmds.add(new CommandOne());
		cmds.add(new CommandTwo());
		  
		  //���⼭���ʹ� �����..
		  for (Command command : cmds) {
		   command.execute(); //�̳��� ���� �����Ű�� �� ������ �𸥴�!
		  }
	}
}
