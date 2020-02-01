package com.elite.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.elite.beans.Emp;  
  
public class EmpDao {  
JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
public int save(Emp p){  
    String sql="insert into Employee_spring(id,name,age,salary,designation,gender,location) values( "+p.getId()+",'"+p.getName()+"',"+p.getAge()+","+p.getSalary()+",'"+p.getDesignation()+"','"+p.getGender()+"','"+p.getLocation()+"')";  
    
return template.update(sql); 
    
}  
public int update(Emp p){  
    String sql="update Employee_spring set name='"+p.getName()+"', age = "+p.getAge()+", salary="+p.getSalary()+",designation='"+p.getDesignation()+"',gender='"+p.getGender()+"',location='"+p.getLocation()+"' where id="+p.getId()+"";  

    return template.update(sql);  
}  
public int delete(int id){  
    String sql="delete from Employee_spring where id="+id+"";  
    return template.update(sql);  
}  
public Emp getEmpById(int id){  
    String sql="select * from Employee_spring where id=?";  
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class)); 
}  
public List<Emp> getEmployees(){  
    return template.query("select * from Employee_spring",new RowMapper<Emp>(){  
        public Emp mapRow(ResultSet rs, int row) throws SQLException {  
            Emp e=new Emp();  
            e.setId(rs.getInt(1));  
            e.setName(rs.getString(2)); 
            e.setAge(rs.getInt(3));
            e.setSalary(rs.getFloat(4));  
            e.setDesignation(rs.getString(5));  
            e.setGender(rs.getString(6));
            e.setLocation(rs.getString(7));
            return e;  
        }  
    });  
}  
}  