package com.epam.TddJunitTesting;

public class RemoveCharA {
	public String remove(String str) {
		if(str.length()>=2) {
			if(str.charAt(0)=='A' && str.charAt(1)!='A') {
				return str.substring(1, str.length());
			}
			if(str.charAt(0)=='A'&& str.charAt(1)=='A') {
				return str.substring(2, str.length());
			}
			if(str.charAt(0)!='A'&&str.charAt(1)!='A') {
				return str;
			}
			if(str.charAt(0)!='A'&&str.charAt(1)=='A') {
				return str.charAt(0)+str.substring(2,str.length());
			}
		}
		else {
			if(str.length()==1) {
					if(str.charAt(0)=='A') {
						return "";
					}
					if(str.charAt(0)!='A') {
						return str;
					}
			}
		}
		return str;
	}
}

