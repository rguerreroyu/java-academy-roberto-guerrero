package com.hospital;
import com.hospitaldepartments.Department;

import java.util.List;


public class Hospital {
        private String name;
        private String location;
        private List<Department> departments;

        public Hospital(String name, String location, List<Department> departments) {
            this.name = name;
            this.location = location;
            this.departments = departments;
        }

        public void printDepartments() {
            System.out.println("Hospital: " + name);
            System.out.println("Departments:");
            for (Department d : departments) {
                System.out.println("- " + d.getInfo());
            }
        }
    }

