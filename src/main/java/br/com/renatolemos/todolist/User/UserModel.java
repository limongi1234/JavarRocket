package br.com.renatolemos.todolist.User;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Data
@Entity(name = "tb_user")
public class UserModel {
   
   @Id
   @GeneratedValue(generator = "UUDI")
   private UUID id;
   
   @Column(unique = true)
   private String username;
   private String name;
   private String password;
   
   @CreationTimestamp
   private LocalDateTime createdAt;
}
