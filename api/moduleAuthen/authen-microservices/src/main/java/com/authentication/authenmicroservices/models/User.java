package com.authentication.authenmicroservices.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;

@Entity

@Table(name="users", uniqueConstraints = {

        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email")

})
public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    @Size(max=10)
    private String username;
    private String name;


    @NotBlank
    @Size(max = 50)
    @Email
    private String email;


    private String phone;

    private String image;

    private String country;

    //private leased property;

    @NotBlank
    @Size(max = 120)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns =  @JoinColumn(name="role_id"))

            private Set<Role> roles= new HashSet<>();


    public User(){



    }
    public User(String username, String email, String password){

        this.username = username;
        this.email=email;
        this.password= password;




    }


    public User(String username, String password){


        this.username = username;
        this.password = password;


    }




    public User (String name, String phone, String country, String image){

        this.name = name;
        this.phone = phone;
        this.country = country;
        this.image = image;



    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }


}
