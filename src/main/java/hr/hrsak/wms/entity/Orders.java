package hr.hrsak.wms.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "order_number")
    private int orderNumber;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "status")
    private String status;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Orders(int id, int orderNumber, Date orderDate, String status, String comment, Account account) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.status = status;
        this.comment = comment;
        this.account = account;
    }

    public Orders() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNumber=" + orderNumber +
                ", orderDate=" + orderDate +
                ", status='" + status + '\'' +
                ", comment='" + comment + '\'' +
                ", account=" + account +
                '}';
    }
}
