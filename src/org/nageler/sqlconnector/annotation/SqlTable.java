package org.nageler.sqlconnector.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation may be added to any Java Class and indicates,
 * that the class may be stored in an SQL-database
 * 
 * @author Marcel Nageler &lt;coding@nageler.org&gt;
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SqlTable {
	String value();
}
