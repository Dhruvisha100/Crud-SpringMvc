package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Student;
import com.example.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping
	public String listStudents(Model model) throws Exception {
		model.addAttribute("students", service.getAll());
		return "student-list";
	}

	@GetMapping("/add")
	public String showAddForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("student") Student student) throws Exception {
		service.save(student);
		return "redirect:/students";
	}

	@GetMapping("/edit")
	public String edit(@RequestParam("id") int id, Model model) throws Exception {
		model.addAttribute("student", service.get(id));
		return "student-form";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) throws Exception {
		service.delete(id);
		return "redirect:/students";
	}

}
