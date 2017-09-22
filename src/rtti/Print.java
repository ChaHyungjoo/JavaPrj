package rtti;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)		//생명주기를 런타임으로
@Target(ElementType.METHOD)		//메소드에만 사용하게
public @interface Print {
	boolean enable() default true;
}
