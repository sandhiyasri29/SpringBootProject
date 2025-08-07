package com.example.SandhiyaDBB.ServiceDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.SandhiyaDBB.Entity.Entitydb;
import com.example.SandhiyaDBB.RepoDb.Repodb;

@Service
public class Servicedb {

	@Autowired
	Repodb rb ;
	
	public Entitydb methodservice1(Entitydb ed) {
		return rb.save(ed);
		
	}
	public List<Entitydb> methodservice2(){
		return rb.findAll();
	}
	public Optional<Entitydb> methodservice3(int s_no){
		return rb.findById(s_no);
	}
	public Entitydb methodservice4(Entitydb newdata ,int id ) {
		Entitydb OldData=rb.findById(id).orElseThrow(()-> new NullPointerException("Id not Found"));
		OldData.setName(newdata.getName());
		OldData.setDepartment(newdata.getDepartment());
		OldData.setEmail(newdata.getEmail());
		return rb.save(OldData);
	
		
	}
	public String methodservice5(int id){
		if(rb.existsById(id)){
			rb.deleteById(id);
			return "Deleted Successfully";
		}
		else{
			return "Id is not Found";
		}
	}
}

