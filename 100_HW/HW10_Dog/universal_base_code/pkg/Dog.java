package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
		String name;
		int age;
		String breed;
	public Dog() {
		name="Clifford";
		age=3;
		breed="Big Red Dog";
	}
	public Dog(String a){
		name=a;
		age=1;
		breed="dog dog";
	}
	public Dog(String a,String b){
		name=a;
		age=1;
		breed=b;
	}
	public Dog(String a,int b){
		name=a;
		age=b;
		breed="dog dog";
	}
	private void setName(String a){
		name=a;
	}
	private void setAge(int a){
		age=a;
	}
	private void setBreed(String a){
		breed=a;
	}
	private String getName(){
		return name;
	}
	private int getAge(){
		return age;
	}
	private String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		int rnjesus=(int)(Math.random()*2);
		if(rnjesus==0){
			return true;
		}
			return false;
	}
	
	public void bark(){
		System.out.println(name+" and it barks!");
	}


}
