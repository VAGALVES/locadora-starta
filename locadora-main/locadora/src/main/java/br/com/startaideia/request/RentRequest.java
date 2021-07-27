package br.com.startaideia.request;

import java.util.Date;
import java.util.List;

public class RentRequest {
    private Integer id;
    private Integer id_User;
    private Integer id_Car;
    private Date startDate;
    private Date finishDate;
    private Double totalValue;
    private String observation;
    private List<UsersRequest>users;
    private List<CarRequest>cars;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_User() {
        return id_User;
    }

    public void setId_User(Integer id_User) {
        this.id_User = id_User;
    }

    public Integer getId_Car() {
        return id_Car;
    }

    public void setId_Car(Integer id_Car) {
        this.id_Car = id_Car;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public List<UsersRequest> getUsers() {
        return users;
    }

    public void setUsers(List<UsersRequest> users) {
        this.users = users;
    }

    public List<CarRequest> getCars() {
        return cars;
    }

    public void setCars(List<CarRequest> cars) {
        this.cars = cars;
    }
}
