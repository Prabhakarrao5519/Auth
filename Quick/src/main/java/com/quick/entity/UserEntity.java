package com.quick.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name="tbl_user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique=true)
    private String userId;
    private String name;
    @Column(unique=true)
    private String email;
    private String password;
    private String verifyOtp;
    private boolean isAccountVerified;
    private long verifyOtpExpireAt;
    private String resetOtp;
    private long resetOtpExpireAt;
    @CreationTimestamp
    @Column(updatable=false)
    private Timestamp createTime;
   @UpdateTimestamp
    private Timestamp updateTime;



}
