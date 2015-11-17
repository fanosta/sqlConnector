package org.nageler.sqlconnector.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * use this annotation to exclude this field from insert statements
 * @author Marcel Nageler &lt;coding@nageler.org&gt;
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SqlReadOnly {

}
