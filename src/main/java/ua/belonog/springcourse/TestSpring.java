/*
 * ====================================================================
 *
 * Follett Software Company
 *
 * Copyright (c) 2019 Follett Software Company
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, is not permitted without a written agreement
 * from Follett Software Company.
 *
 * ====================================================================
 */
package ua.belonog.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Follett Software Company
 * @copyright 2017
 */
public class TestSpring {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {
            TestBean testBean = context.getBean("testBean", TestBean.class);

            System.out.println(testBean.getName());
        }
    }
}
