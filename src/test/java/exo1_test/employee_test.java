package exo1_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import exo1.Employee;
import exo1.EmployeeManager;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class employee_test {
Employee personneJunior = new Employee("boby","bob",1,"Junior"); 
Employee personneIntermedier = new Employee("Patée","Françis",5,"Intermédiaire");
Employee personneSenior = new Employee("Richard","Philipe",10,"Sénior");
Employee personneAutre = new Employee("Richard","Philipe",10,"Autre");

EmployeeManager junior = new EmployeeManager(personneJunior);
EmployeeManager inter = new EmployeeManager(personneIntermedier);
EmployeeManager senior = new EmployeeManager(personneSenior);
EmployeeManager autre = new EmployeeManager(personneAutre);
int coef = 0;
int salarie = 0;
int pourcentage = 0;
	@Test
	public void testcalculateSalaryJunior(){
		salarie = 20000; 
		int result = junior.calculateSalary(personneJunior);
		coef = junior.calculateExperienceMultiplier(1);
		for(int i=0;i<coef;i++) {
			pourcentage = (int) (salarie*0.05);
			salarie = salarie + pourcentage;
		}
		Assert.assertEquals(salarie,result);
	}
	@Test
	public void testcalculateSalaryInter(){
		salarie = 40000;
		int result = inter.calculateSalary(personneIntermedier);
		coef = inter.calculateExperienceMultiplier(5);
		for(int i=0;i<coef;i++) {
			pourcentage = (int) (salarie*0.05);
			salarie = salarie + pourcentage;
		}
		Assert.assertEquals(salarie,result);
	}
	@Test
	public void testcalculateSalarySenior(){
		salarie = 60000;
		int result = senior.calculateSalary(personneSenior);
		coef = junior.calculateExperienceMultiplier(10);
		for(int i=0;i<coef;i++) {
			pourcentage = (int) (salarie*0.05);
			salarie = salarie + pourcentage;
		}
		Assert.assertEquals(salarie,result);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testcalculateSalaryAutre(){
		int result = autre.calculateSalary(personneAutre);
	}
}
