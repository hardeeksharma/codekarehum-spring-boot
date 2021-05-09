package com.example.company.utils;

import com.example.company.model.*;

import java.util.Arrays;

//Singleton mock DB
final public class MockDB {

    private static CompanyDB db = null;

    private MockDB() {
    }

    public static CompanyDB getMockDB() {
        if (db == null) {
            db = new CompanyDB();
            int ecode = 101;
            Address address1 = new Address();
            address1.setCity("New Delhi");
            address1.setPinCode(110088);
            address1.setState("Delhi".toUpperCase());
            address1.setStreet("Mars Sector 420");

            Address address2 = new Address();
            address2.setCity("New Delhi");
            address2.setPinCode(110052);
            address2.setState("Delhi".toUpperCase());
            address2.setStreet("Jupiter 123");

            Address address3 = new Address();
            address3.setCity("BTM Stage 2");
            address3.setPinCode(234566);
            address3.setState("Bengaluru".toUpperCase());
            address3.setStreet("Gali no 2");

            Address address4 = new Address();
            address4.setCity("BTM Stage 2");
            address4.setPinCode(234566);
            address4.setState("Bengaluru".toUpperCase());
            address4.setStreet("Gali no 2");

            Address address5 = new Address();
            address5.setCity("Alwar");
            address5.setPinCode(32101);
            address5.setState("Rajasthan".toUpperCase());
            address5.setStreet("House No 2");

            Department itDept = new Department();
            itDept.setDname("IT");
            itDept.setId(1);

            Department hrDept = new Department();
            hrDept.setDname("HR");
            hrDept.setId(2);

            Department wiz = new Department();
            wiz.setDname("WIZARD");
            wiz.setId(3);

            db.getDepartments().add(itDept);
            db.getDepartments().add(hrDept);
            db.getDepartments().add(wiz);

            Employee hardeek = new Employee();
            hardeek.setEcode(ecode++);
            hardeek.setName("Hardeek Sharma");
            hardeek.setEmail("hs@hardeeksharma.me");
            hardeek.setSalary(10000);
            hardeek.setDob("20-July-1993");
            hardeek.setHireDate("01-01-2021");
            hardeek.setAddress(address1);
            hardeek.setContact(Arrays.asList("9898989898", "9999999999"));
            hardeek.setDepartment(itDept);
            hardeek.setQualifications(
                    Arrays.asList(
                            new Qualification(1, "MCA", 90.0, "LBSIM", 2018),
                            new Qualification(2, "B.Sc(H) Comp.Sc", 80.0, "DU", 2014)
                    )
            );


            Employee goku = new Employee();
            goku.setEcode(ecode++);
            goku.setName("Goku");
            goku.setEmail("goku@dragonballz.com");
            goku.setSalary(20000);
            goku.setDob("2-May-1990");
            goku.setHireDate("05-03-2020");
            goku.setAddress(address2);
            goku.setContact(Arrays.asList("8989909090"));
            goku.setDepartment(hrDept);
            goku.setQualifications(
                    Arrays.asList(
                            new Qualification(1, "Ultra Instincts", 100, "Angle Whis", 2010),
                            new Qualification(2, "Super Saiyan", 80.0, "Master Roshi", 2007)
                    )
            );

            Employee harry = new Employee();
            harry.setEcode(ecode++);
            harry.setName("Harry Potter");
            harry.setEmail("harry@hogwats.wiz");
            harry.setSalary(20000);
            hardeek.setDob("31-July-1980");
            harry.setHireDate("05-03-2020");
            harry.setAddress(address3);
            harry.setContact(Arrays.asList("1234567890", "3344556677", "7838860079"));
            harry.setDepartment(hrDept);
            harry.setQualifications(
                    Arrays.asList(
                            new Qualification(1, "Auror", 95, "Ministry of Magic", 2005),
                            new Qualification(2, "Wizard", 80.0, "Hogwarts", 2000)
                    )
            );


            db.getEmployees().add(hardeek);
            db.getEmployees().add(goku);
            db.getEmployees().add(harry);
        }
        return db;
    }
}
