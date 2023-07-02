package com.mycompany;


import jakarta.validation.Valid;
import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class memberController {
    @Autowired
    memberDao dao;
    
     @RequestMapping("/reg")    
    public String showform(Model m){    
        m.addAttribute("command", new Member());  
        return "registration";   
    }   
   @RequestMapping(value = "/Exitapp", method = RequestMethod.GET)
   public String finalPage() {
      return "Exitapp";
   }
    
     @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@Valid @ModelAttribute("mem") Member mem, BindingResult br) throws ParseException{    
        dao.save(mem);   
        if(br.hasErrors()){
            return "errorPage";
        }else{
           return "viewAddedMember"; 
        }
//        return "redirect:/viewemp";//will redirect to viewemp request mapping    

    }    
    
     @RequestMapping("/editmember/{id}")    
    public String edit(@PathVariable int id, Model m){    
         System.out.println(" Edit-------------"+id);
         //Member mem=new Member();
       Member member=dao.getMemberById(id);  
         System.out.println("Member "+member);
       m.addAttribute("command",member);  
        return "EditMemberForm";    
    }    
    
    
    
    
    
    /* It updates model object. */    
    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("member") Member member){    
       dao.update(member);    
        return "EditSaved";    
    }    
     /* It deletes record for the given id in URL and redirects to /viewemp */    
    @RequestMapping(value="/deletemember/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        dao.delete(id);    
        return "redirect:/viewmember";    
    }     

    
    
    
  @RequestMapping("/viewmember")    
    public String viewmember(Model member){    
        List<Member> list=dao.getMembers();    
        member.addAttribute("list",list);  
        return "viewmember";    
    } 
    @RequestMapping(value="/viewmemberByPage/{pageid}")    
    public String viewmemberByPage(@PathVariable int pageid,Model member){
        int total=3;
        if(pageid==1){}
        else{
            pageid=(pageid-1)*total+1;
        }
        List<Member> list=dao.getMembersByPage(pageid, total);    
        member.addAttribute("msg",list);  
        return "viewmemberByPage";    
    } 
    
    
    
}//End    
    


    

