package eu.epycsolutions.labyaddon.playeraccessories.configuration.milieu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MilieuSection {

  String value();

  String translation() default "";

  boolean center() default false;

}
