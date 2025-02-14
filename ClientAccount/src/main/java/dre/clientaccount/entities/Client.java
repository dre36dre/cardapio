package dre.clientaccount.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_client")
public class Client {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String email;

@ManyToOne
@JoinColumn(name="account_id")
private Account account;

public Client() {
	
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}


}
