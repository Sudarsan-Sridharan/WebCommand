package com.thoughtworks.webcommand.annotation;

public @interface RequestMapping {

    String urlPattern() default "/";

}
