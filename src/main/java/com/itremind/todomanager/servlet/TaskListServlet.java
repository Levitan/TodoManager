package com.itremind.todomanager.servlet;

import com.itremind.todomanager.kernel.db.dao.TasksDao;
import com.itremind.todomanager.kernel.db.model.Tasks;
import com.itremind.todomanager.kernel.db.model.beans.TaskVariables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TaskListServlet {
    @Autowired
    TasksDao tasksDao;
    TaskVariables types = new TaskVariables();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexView(Model model){
        List<Tasks> tasksList = tasksDao.findAll();

        model.addAttribute("types", types);
        model.addAttribute("tasks", tasksList);

        return "template/client/list";
    }
}
