//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.28 at 07:46:50 PM IST 
//


package com.example.myschema;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.myschema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.myschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExamResult }
     * 
     */
    public ExamResult createExamResult() {
        return new ExamResult();
    }

    /**
     * Create an instance of {@link ExamResult.Subjects }
     * 
     */
    public ExamResult.Subjects createExamResultSubjects() {
        return new ExamResult.Subjects();
    }

    /**
     * Create an instance of {@link ExamResult.StudentInfo }
     * 
     */
    public ExamResult.StudentInfo createExamResultStudentInfo() {
        return new ExamResult.StudentInfo();
    }

    /**
     * Create an instance of {@link ExamResult.Subjects.Subject }
     * 
     */
    public ExamResult.Subjects.Subject createExamResultSubjectsSubject() {
        return new ExamResult.Subjects.Subject();
    }

}