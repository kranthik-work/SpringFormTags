package main.com.kkalletla.springformtags;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showStudentForm")
    public String showStudentForm(Model model){
        model.addAttribute("student",new Student());
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student){

        System.out.println("Student Details: "+student.getFirstName()+" "+student.getLastName()+" "+student.getCountry()+" "+student.getFavouriteLanguage());
        for(String s:student.getOperatingSystem()){
            System.out.println(s);
        }
        return "displayDetails";
    }
}
