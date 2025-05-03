package com.example.demo.controller;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class Filter{
	List<String> names=new ArrayList<>();
	List<String> ids=new ArrayList<>();
	@GetMapping("/save/{name}/{id}")
	public String save(@PathVariable String name,@PathVariable String id ) {
		names.add(name);
		ids.add(id);
		return "Name of the user is stored as "+name+" and Id of the user is stored as "+id+"\n";
	}
	@GetMapping("/list")
	public String getList()
	{
		return names.toString()+"\n"+ids.toString();
	}
	@GetMapping("/All")
	public String getAll(@RequestParam(required=false) String name)
	{
		if(name!=null) 
		{
			int i;
			String s;
			for(i=0;i<names.size();i++) 
			{
				s=names.get(i);
				if(s.equals(name))return "Founded name: "+names.get(i)+" and id is "+ids.get(i);
			}
			return "not found";
		}
		return names.toString()+"\n"+ids.toString();
	}
	
}