package summaryexsersices.summary.emplement;

import summaryexsersices.summary.config.InputMethods;
import summaryexsersices.summary.design.IEmployee;
import summaryexsersices.summary.entity.Department;
import summaryexsersices.summary.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class ManageEm implements IEmployee
{
    public static List <Employee> employeeList = new ArrayList<>();



    @Override
    public void salaryAverage()
    {

    }

    @Override
    public void maxfiveEmApart()
    {

    }

    @Override
    public void manMaxEmployee()
    {

    }

    @Override
    public void maxFiveAge()
    {

    }

    @Override
    public void maxFiveSalary()
    {

    }
    public static int totalMembers(String id){
        int sum =0;
        for (Employee Employee : employeeList)
        {
            if (id.equals(Employee.getDepartment().getDepartmentId())){
                sum++;
            }
        }
        return sum;
    }

    @Override
    public Employee display()
    {
        return null;
    }

    @Override
    public Employee create()
    {
        return null;
    }

    @Override
    public Employee update()
    {
        return null;
    }

    @Override
    public Employee displayById()
    {
        return null;
    }

    @Override
    public Employee delete()
    {
        return null;
    }

    @Override
    public Employee inputdata()
    {
        Employee employee = new Employee();

        System.out.println("Moi ban nhap ID");
        employee.setEmployeeId(InputMethods.getString());
        System.out.println("Moi ban nhap Ten");
        employee.setEmployeeName(InputMethods.getString());
        System.out.println("Moi ban nhap ngay sinh");
        employee.setBirthday(InputMethods.getDate());
        System.out.println("Moi ban nhap Gioi Tinh");
        employee.setSex(InputMethods.getBoolean());
        System.out.println("Moi ban nhap Salary");
        employee.setSalary(InputMethods.getDouble());
        System.out.println("Moi ban chon quan ly");

        if (employeeList.isEmpty())
        {
            System.out.println("Ban dang khong co nguoi quan ly nao");
            System.out.println("Them quan ly");
        }else {
            employeeList.forEach(System.out::println);
            System.out.println("Moi ban nhap ID nguoi quan ly");
            String idManager = InputMethods.getString();
            for (Employee employee1 : employeeList)
            {
                if (idManager.equals(employee1.getEmployeeId())){
                    employee.setManager(employee1);
                }
            }
        }
        if (ManageDepart.departmentList.isEmpty()){
            System.out.println("Moi ban them phong ban");
            ManageDepart callDepart = new ManageDepart();
            callDepart.inputdata();
        }else {
            ManageDepart.departmentList.forEach(System.out::println);
            System.out.println("Moi ban nhap ID phong ban");
            String idDepart = InputMethods.getString();
            for (Department department : ManageDepart.departmentList)
            {
                if (idDepart.equals(department.getDepartmentId())){
                    employee.setDepartment(department);
                }
            }
        }
        return employee;
    }
}
