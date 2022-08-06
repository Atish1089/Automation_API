package org.Test.Runner;

import java.io.IOException;

import org.testing.TestCases.TestCase_1;
import org.testing.TestCases.TestCase_2;
import org.testing.TestCases.TestCase_3;
import org.testing.TestCases.TestCase_4;
import org.testing.TestCases.TestCase_5;
import org.testing.TestCases.TestCase_6;
import org.testing.TestCases.TestCase_7;
import org.testing.TestCases.TestCase_8;

public class Runner {



    public static void main(String[] args) throws IOException {

//        TestCase_1 testCase1 = new TestCase_1();
//        TestCase_2 testCase2 = new TestCase_2();
//        TestCase_3 testCase3 = new TestCase_3();
//        TestCase_4 testCase4 = new TestCase_4();
//        TestCase_5 testCase5 = new TestCase_5();
        TestCase_6 testCase6 = new TestCase_6();
        TestCase_7 testCase7 = new TestCase_7();
        TestCase_8 testCase8 = new TestCase_8();
        
//        System.out.println("----------------------------Test Case 1------------------------");
//        testCase1.postMethodwithPermeterizedId();
//        System.out.println("----------------------------Test Case 2------------------------");
//        testCase2.getAll();
//        System.out.println("----------------------------Test Case 3------------------------");
//        testCase3.getValueAsPerID();
//        System.out.println("----------------------------Test Case 4------------------------");
//        testCase4.updateRecord();
//        System.out.println("----------------------------Test Case 5------------------------");
//        testCase5.removerRecord();
        System.out.println("----------------------------Test Case 6------------------------");
       testCase6.postDummyApi();
        System.out.println("----------------------------Test Case 7------------------------");
       testCase7.getDummyApi();
       System.out.println("----------------------------Test Case 8------------------------");
       testCase8.getByID();
       
    }


}