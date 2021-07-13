package com.company;
import java.util.Comparator;
import java.util.TreeSet;

class Main {
            public static void main(String[] args) {
                System.out.println("sorting on the basis of name Ascending");

                TreeSet<Employee>Emp=new TreeSet<>(new FirstComparator());

                Emp.add(new Employee(1,"ram",24));
                Emp.add(new Employee(2,"shayam",25));
                Emp.add(new Employee(3,"parveen",26));
                Emp.add(new Employee(4,"nitin",27));

                for(Employee employee :Emp)
                {
                    System.out.println(employee);
                }


                System.out.println("sorting on the basis of id ascending order");

                TreeSet<Employee>Emp2=new TreeSet<>(new SecondComparator());

                Emp2.add(new Employee(1,"ram",24));
                Emp2.add(new Employee(2,"shayam",25));
                Emp2.add(new Employee(3,"parveen",26));
                Emp2.add(new Employee(4,"nitin",27));

                for(Employee employee :Emp2)
                {
                    System.out.println(employee);
                }

            }
        }

class FirstComparator implements Comparator<Employee> {
    @Override public int compare(Employee e1, Employee e2)
    {
        return (e1.name).compareTo(e2.name);
    }
}

class SecondComparator implements Comparator<Employee> {
    @Override public int compare(Employee e1, Employee e2)
    {
        if (e1.id > e2.id) {
            return +1;
        }
        else if (e1.id < e2.id) {
            return -1;
        }
        else {
            return (e1.id).compareTo(e2.id);
        }
    }
}




class Employee {

            public Integer id;
            public String name;
            public Integer age;

            Employee(){}


            Employee(int id,String name,int age)
            {
                this.id=id;
                this.name=name;
                this.age=age;
            }

            @Override public String toString()
            {
                return "" + this.id + " " + this.name + " "
                        + this.age;
            }
        }

