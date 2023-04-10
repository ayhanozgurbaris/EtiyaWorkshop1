package consoleUI;

import dataAccess.abstracts.BranchesDao;
import dataAccess.abstracts.CarDao;
import dataAccess.abstracts.CustomerDao;
import dataAccess.concretes.InMemoryBranchesDao;
import dataAccess.concretes.InMemoryCarDao;
import dataAccess.concretes.InMemoryCustomerDao;
import entities.Branches;
import entities.Car;
import entities.Customer;
import services.abstracts.BranchesService;
import services.abstracts.CarService;
import services.abstracts.CustomerService;
import services.concretes.BranchesManager;
import services.concretes.CarManager;
import services.concretes.CustomerManager;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(1, "Suv", "Opel", 2005, 150000);
        Car car2 = new Car(2, "Sedan", "Bmw", 2006, 140000);
        Car car3 = new Car(3, "Hatchback", "Mercedes", 2007, 180000);
        Car car4 = new Car(4, "Hatchback", "Audi", 2007, 180000);
        Car car5 = new Car(4, "Hatchback", "Skoda", 2007, 180000);
        Branches branch1 = new Branches(35, "Ankara");
        Branches branch2 = new Branches(36, "İstanbul");
        Branches branch3 = new Branches(37, "İzmir");
        Branches branch4 = new Branches(38, "Bursa");
        Branches branch5 = new Branches(38, "Antalya");
        Customer customer1 = new Customer(100, "Mert", "Aktaş");
        Customer customer2 = new Customer(101, "Barış", "Ayhan");
        Customer customer3 = new Customer(102, "Uğur", "Atasoy");
        Customer customer4 = new Customer(103, "Kenan", "Aksoy");
        Customer customer5 = new Customer(103, "Ahmet", "Atmaca");

        CarDao carDao = new InMemoryCarDao();
        CarService carService = new CarManager(carDao);
        carService.add(car1);
        carService.add(car2);
        carService.add(car3);
        carService.add(car4);
        carService.add(car5);


        for (Car car : carService.getAll()) {
            System.out.println(car.getCarId() + "-" + car.getCarModel());
        }

        System.out.println("---------------------------------------------------------------------------");

        carService.delete(car3);

        for (Car car : carService.getAll()) {
            System.out.println(car.getCarId() + "-" + car.getCarModel());
        }



        System.out.println("---------------------------------------------------------------------------");

        BranchesDao branchesDao = new InMemoryBranchesDao();
        BranchesService branchesService = new BranchesManager(branchesDao);
        branchesService.add(branch1);
        branchesService.add(branch2);
        branchesService.add(branch3);
        branchesService.add(branch4);
        branchesService.add(branch5);


        for (Branches branches : branchesService.getAll()) {
            System.out.println(branches.getBranchId() + "-" + branches.getBranchCity());
        }

        System.out.println("---------------------------------------------------------------------------");

        branchesService.delete(branch1);

        for (Branches branches : branchesService.getAll()) {
            System.out.println(branches.getBranchId() + "-" + branches.getBranchCity());
        }

        System.out.println("---------------------------------------------------------------------------");

        CustomerDao customerDao = new InMemoryCustomerDao();
        CustomerService customerService = new CustomerManager(customerDao);
        customerService.add(customer1);
        customerService.add(customer2);
        customerService.add(customer3);
        customerService.add(customer4);
        customerService.add(customer5);

        for (Customer customer : customerService.getAll()) {
            System.out.println(customer.getId() + "-" + customer.getFirstName() + " " + customer.getLastName());
        }

        System.out.println("---------------------------------------------------------------------------");


        customerService.delete(customer3);

        for (Customer customer : customerService.getAll()) {
            System.out.println(customer.getId() + "-" + customer.getFirstName() + " " + customer.getLastName());
        }


    }
}