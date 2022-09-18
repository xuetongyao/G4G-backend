package com.auth.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * 系统用户表
 *
 * @author tongyao
 * @site  
 * @date 2022-08-09
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sys_user")
public class SysUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    @Column
    private String password;

    @Column
    private String username;

    @Column
    private Integer orgId;

    @Column
    private Boolean enabled;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private Date createTime;
}
