package employeeApp;

import com.workintech.models.Company;
import com.workintech.models.Employee;
import com.workintech.models.HealthPlan;
import com.workintech.models.Plan;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Company company=new Company(3,"Technology Company",3000000,null);
        System.out.println("--------COMPANY--------");
        System.out.println(company);
        System.out.println("company id:"+company.getId());
        System.out.println("company giro:"+company.getGiro());
        company.setGiro(-50000);
        System.out.println("company giro:"+company.getGiro());
        System.out.println("^if last giro value is 0.0, editGiroValue method is working");
        company.setDeveloperNames(new String[] {"DEV1","DEV2","DEV3",null});
        System.out.println("developerNames array:"+Arrays.toString(company.getDeveloperNames()));
        company.addEmployee(3,"DEV1");
        System.out.println("developer names (after tyring to add an existing plan to empty index):"+Arrays.toString(company.getDeveloperNames()));
        company.addEmployee(-1,"newDev");
        System.out.println("developer names (after tyring to add new plan to invalid index):"+Arrays.toString(company.getDeveloperNames()));
        company.addEmployee(3,"newDev");
        System.out.println("developer names (after adding new plan to empty index):"+Arrays.toString(company.getDeveloperNames()));
        company.addEmployee(1,"newDev2");
        System.out.println("developer names (after trying to add new plan to full index):"+Arrays.toString(company.getDeveloperNames()));
        company.addEmployee(5,"newDev2");
        System.out.println("developerNames new array after all tests:"+ Arrays.toString(company.getDeveloperNames()));


        HealthPlan healthPlan=new HealthPlan(7,"health plan",Plan.PLAN1);
        System.out.println("--------HEALTHPLAN--------");
        System.out.println(healthPlan);
        System.out.println("healthPlan id:"+healthPlan.getId());
        healthPlan.setId(10);
        System.out.println("healthPlan new id:"+healthPlan.getId());
        System.out.println("original plan:"+healthPlan.getPlan());
        healthPlan.setPlan(Plan.PLAN3);
        System.out.println("new plan:"+healthPlan.getPlan());


        Employee employee= new Employee(5,"Ali Veli","ali@veli.com","12345", null);
        System.out.println("--------EMPLOYEE--------");
        System.out.println(employee);
        System.out.println("employee email:"+employee.getEmail());
        System.out.println("employee fullName:"+employee.getFullName());
        employee.setFullName("Ali Veli 4950");
        System.out.println("employee new fullName:"+employee.getFullName());
        employee.setHealthPlans(new String[] {null,"healthPlan1","healthPlan2","healthPlan3"});
        System.out.println("employee healthplans:"+Arrays.toString(employee.getHealthPlans()));
        employee.addHealthPlan(0,"healthPlan2");
        System.out.println("employee healthplans (after tyring to add an existing plan to empty index):"+Arrays.toString(employee.getHealthPlans()));
        employee.addHealthPlan(-1,"new health Plan");
        System.out.println("employee healthplans (after tyring to add new plan to invalid index):"+Arrays.toString(employee.getHealthPlans()));
        employee.addHealthPlan(0,"new Health Plan");
        System.out.println("employee healthplans (after adding new plan to empty index):"+Arrays.toString(employee.getHealthPlans()));
        employee.addHealthPlan(3,"new Health Plan2");
        System.out.println("employee healthplans (after trying to add new plan to full index):"+Arrays.toString(employee.getHealthPlans()));
        employee.addHealthPlan(5,"new Health Plan2");
        System.out.println("new employee healthPlans after all tests:"+Arrays.toString(employee.getHealthPlans()));
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
