package com.qf.admin.web;

import com.qf.admin.pojo.po.Studen;
import com.qf.admin.pojo.po.StudenPage;
import com.qf.admin.service.StudenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudenAction {
    @Autowired
    private StudenService studenService;

    @GetMapping("/listStudens")
    public String allStudens(Model model, Integer pageIndex) {
        StudenPage studenPage = new StudenPage();
        studenPage.setPageSize(10);
        if (pageIndex==null){
            studenPage.setPageIndex(1);
        }else{
            studenPage.setPageIndex(pageIndex);
        }
        List<Studen> studens = studenService.listStudens(studenPage);
        int i = studenService.getStudenNumber();
        studenPage.setTotalStuden(i);
        int ceil = (int) Math.ceil(i * 1.0 / 10);
        studenPage.setTotalPage(ceil);
        model.addAttribute("studens", studens);
        model.addAttribute("page",studenPage);
        return "index";
    }

    @GetMapping("/toUpdata")
    public String toUpdata(int studentID, Model model) {
        Studen studen = studenService.getStudensById(studentID);
        model.addAttribute("i", studen);
        return "updata";
    }

    @GetMapping("/updata")
    public String updata(Studen studen) {
        studenService.updateStuden(studen);
        return "redirect:listStudens";
    }

    @GetMapping("/toSave")
    public String toSave() {
        return "save";
    }

    @GetMapping("/save")
    private String save(Studen studen) {
        studen.setState("0");
        studenService.saveStuden(studen);
        return "redirect:listStudens";
    }

    @GetMapping("/biye")
    public String buye(int studentID, String state) {
        studenService.updateStudenByState(studentID, state);
        return "redirect:listStudens";
    }

    @GetMapping("/search")
    public String search(String studenName, Model model) {
        Studen studen = studenService.getStudensByStudenName(studenName);
        model.addAttribute("i", studen);
        return "search";
    }
}
