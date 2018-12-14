package com.qf.admin.service.impl;

import com.qf.admin.dao.StudenDao;
import com.qf.admin.pojo.po.Studen;
import com.qf.admin.pojo.po.StudenPage;
import com.qf.admin.service.StudenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenServiceImpl implements StudenService{
    @Autowired
    private StudenDao studenDao;
    @Override
    public List<Studen> listStudens(StudenPage studenPage) {
        List<Studen> studens = null;
        try {
            studens = studenDao.listStudens(studenPage);
        }catch (Exception e){
            e.printStackTrace();
        }
        return studens;
    }

    @Override
    public Studen getStudensById(int studentID) {
        Studen studen = studenDao.getStudensById(studentID);
        return studen;
    }

    @Override
    public int updateStuden(Studen studen) {
       int i =  studenDao.updateStuden(studen);
        return i;
    }

    @Override
    public int saveStuden(Studen studen) {
        int i = studenDao.saveStuden(studen);
        return i;
    }

    @Override
    public int updateStudenByState(int studentID, String state) {
        int i = studenDao.updateStudenByState(studentID,state);
        return i;
    }

    @Override
    public Studen getStudensByStudenName(String StudenName) {
       Studen studen1 = studenDao.getStudensByStudenName(StudenName);
       return studen1;
    }

    @Override
    public int getStudenNumber() {
      return studenDao.getStudenNumber();
    }
}
