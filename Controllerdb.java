package com.example.SandhiyaDBB.ControllerDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SandhiyaDBB.Entity.Entitydb;
import com.example.SandhiyaDBB.ServiceDb.Servicedb;
import java.util.*;
//import jakarta.persistence.Column;

@RequestMapping("/welcome")
@RestController
public class Controllerdb {
	@Autowired
	Servicedb sr;
 
 @PostMapping("/posts")
	public Entitydb method1(@RequestBody Entitydb ed) {
		return sr.methodservice1(ed);		
	}
 
  @GetMapping("/getsss")
 public List<Entitydb> method2(){
	 return sr.methodservice2();
 }
  @GetMapping("get/{ids}")
  public Optional<Entitydb> getDataById(@PathVariable("ids")int ids){
	  return sr.methodservice3(ids);
  }
  @PutMapping("/updates/{data}")
  public Entitydb method3( @RequestBody Entitydb edd,@PathVariable(value="data") int id){
	  return sr.methodservice4(edd, id);
	  
  }
  @DeleteMapping("deletes/{del}")
  public String method4(@PathVariable(value="del")int id){
	return sr.methodservice5(id);
  }
	
}
