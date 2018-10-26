/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: tangqihua[tang_qh@suixingpay.com]
 * @date: 2018年10月26日 14时05分
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: tangqihua[tang_qh@suixingpay.com]
 * @date: 2018年10月26日 14时05分
 * @version: V1.0
 * @review: tangqihua[tang_qh@suixingpay.com]/2018年10月26日 14时05分
 */
@RestController
@RequestMapping
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping
    public List<User> list(){
        
        return null;
    }
    
}
