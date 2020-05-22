package springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import springdemo.mvc.Validation.CourseCode;

import com.sun.istack.internal.NotNull;

public class Student {
	private String firstName;
	@NotNull
	@Size(min=5)
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] languagesWorked;
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 digits/char")
	private String postalCode;
	
	@NotNull
	@Min(value=3,message="must be greator than 3")
	@Max(value=6,message="must be less than 6")
	
	private Integer subjects;
	
	@CourseCode(value="LUV",message="should start with Luv")
	private String courseCode;
	
	private LinkedHashMap <String ,String> countryOptions;
	public Student()
	{
		countryOptions=new LinkedHashMap();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("Ind", "India");

		countryOptions.put("US", "US");

		countryOptions.put("UK", "UK");

		
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String[] getLanguagesWorked() {
		return languagesWorked;
	}
	public void setLanguagesWorked(String[] languagesWorked) {
		this.languagesWorked = languagesWorked;
	}
	public Integer getSubjects() {
		return subjects;
	}
	public void setSubjects(Integer subjects) {
		this.subjects = subjects;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	

}
