package com.myprog.program;

public class JavaSwitchLoop {

	public static void main(String[] args) {
		String reg="17MIS7146";
		switch(reg)
		{
		case "17mis7146":
			System.out.println("chukka prasad:17mis7146");  //break
			break;
		case "17MIS7146":
			System.out.println("CHUKKA PRASAD : 17MIS7146");
			break;							//continue should not used in switches
		default:
				System.out.println("please mention proper reg id");
				
		
		}
	}

}
