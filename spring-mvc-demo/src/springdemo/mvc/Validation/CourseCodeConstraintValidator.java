package springdemo.mvc.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
implements ConstraintValidator<CourseCode, String>{

	
	
	private String coursePrefix;
	
	public void initialize(CourseCode theCourse)
	{
		coursePrefix=theCourse.value();
	}
	@Override
	public boolean isValid(String theCode
			, ConstraintValidatorContext theConstraintValidatorContext) {
		// TODO Auto-generated method stub
		
		boolean result;
		
		if(theCode!=null)
		{
			result=theCode.startsWith(coursePrefix);
			
		}
		else
		{
			return true;
		}
		
		
		return result;
	}
	

}
