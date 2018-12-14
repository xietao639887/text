package com.qf.admin.service;

import com.qf.admin.pojo.po.Studen;
import com.qf.admin.pojo.po.StudenPage;

import java.util.List;

public interface StudenService {
    List<Studen> listStudens(StudenPage studenPage);
    Studen getStudensById(int studentID);
    int updateStuden(Studen studen);
    int saveStuden(Studen studen);
    int updateStudenByState(int studentID,String state);
    Studen getStudensByStudenName(String studenName);
    int getStudenNumber();
}
