package jypatia.util.misc;

public class Triple <T>{
	public T first;
	public T second;
	public T third;
	
	public Triple (){
		first = null;
		second = null;
		third = null;
	}
	
	public Triple (T first, T second, T third){
		this.first = first;
		this.second = second;
		this.third = third;
	}
}
