
package com.mycompany;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class memberDao {
    JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public memberDao(JdbcTemplate template) {
        this.template = template;
    }

   
    
    public int save(Member p) throws ParseException{   

    String sql="insert into member(id,firstName,lastName,address,city,gender,race,Fee) "
 + "values("+p.getId()+",'"+p.getFirstName()+"','"+p.getLastName()+"','"+p.getAddress()+"','"+p.getCity()+"','"+p.getGender()+"','"+p.getRace()+"',"+p.getFee()+")";    
    return template.update(sql);    
}    
  
    public Member getMemberById(int id){    
    String sql="select * from member where id=?"; 
        System.out.println("Get Member By Id "+sql);
        System.out.println(" == "+template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Member>(Member.class)));
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Member>(Member.class));    
}   
    public int update(Member p){    
    String sql="update member set firstName='"+p.getFirstName()+"', fee="+p.getFee()+" where id="+p.getId()+"";    
        System.out.println(" Sql "+sql);
    return template.update(sql);    
}    
    public int delete(int id){    
    String sql="delete from member where id="+id+"";    
    return template.update(sql);    
}   
    
    public List<Member> getMembers(){    
    return template.query("select * from member",new RowMapper<Member>(){    
        public Member mapRow(ResultSet rs, int row) throws SQLException {    
            Member e=new Member();    
            e.setId(rs.getInt(1));    
            e.setFirstName(rs.getString(2));    
           e.setLastName(rs.getString(3));
      e.setAddress(rs.getString(4));
      e.setCity(rs.getString(5));
      e.setGender(rs.getString(6));
      e.setRace(rs.getString(7));
      e.setFee(rs.getDouble(9));
            return e;    
        }    
  });    
}  //getMembers
    
   public List<Member> getMembersByPage(int pageid, int total){
       String sql="select * from member limit "+(pageid-1)+","+total;
    return template.query(sql,new RowMapper<Member>(){    
        public Member mapRow(ResultSet rs, int row) throws SQLException {    
            Member e=new Member();    
            e.setId(rs.getInt(1));    
            e.setFirstName(rs.getString(2));    
           e.setLastName(rs.getString(3));
      e.setAddress(rs.getString(4));
      e.setCity(rs.getString(5));
      e.setGender(rs.getString(6));
      e.setRace(rs.getString(7));
      e.setFee(rs.getDouble(9));
            return e;    
        }    
  });    
}  //getMembers
    
    
}


