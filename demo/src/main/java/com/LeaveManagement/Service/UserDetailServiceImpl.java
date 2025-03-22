package com.LeaveManagement.Service;

import com.LeaveManagement.Model.Employee;
import com.LeaveManagement.Model.UserPrincipal;
import com.LeaveManagement.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {


    @Autowired
    private EmployeeRepo employeeRepo;




    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Employee emp = employeeRepo.findEmployeeByUsername(username);
        System.out.println(emp);
        if(emp == null) {
            throw new UsernameNotFoundException(username);
        }

        return new UserPrincipal(emp);
    }
}
