package summaryexsersices.summary.emplement;

import summaryexsersices.summary.config.InputMethods;
import summaryexsersices.summary.design.IDepartment;
import summaryexsersices.summary.entity.Department;
import summaryexsersices.summary.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class ManageDepart implements IDepartment
{

    public static List<Department> departmentList = new ArrayList<>();


    @Override
    public Department display()
    {
        return null;
    }

    @Override
    public Department create()
    {
        return null;
    }

    @Override
    public Department update()
    {
        return null;
    }

    @Override
    public Department displayById()
    {
        return null;
    }

    @Override
    public Department delete()
    {
        return null;
    }

    @Override
    public Department inputdata()
    {
        Department newDepartment = new Department();
        System.out.println("Moi ban nhap ID");
        newDepartment.setDepartmentId(InputMethods.getString());
        System.out.println("Moi ban nhap ten phong ban");
        newDepartment.setDepartmentName(InputMethods.getString());
     //  newDepartment.setTotalMembers();
        return null;
    }


}
