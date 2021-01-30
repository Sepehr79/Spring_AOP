package main;

import logic.Processor;
import logic.Validator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Processor processor = factory.getBean("proxy", Processor.class);
        processor.logic();
        System.out.println();
        processor.process();

        /* output:
         *
         * additional concern before actual logic
         * Around advice: before
         * process
         * Around advice: after
         * Additional concern after returning advice
         *
         */
        System.out.println();

        Validator validator = factory.getBean("proxy2", Validator.class);
        validator.validate(-5);

        /*
         * output: additional concern if exception occurs
         * exception
         */
    }
}
