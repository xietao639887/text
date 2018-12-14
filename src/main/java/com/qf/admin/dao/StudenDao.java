package com.qf.admin.dao;

import com.qf.admin.pojo.po.Studen;
import com.qf.admin.pojo.po.StudenPage;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface StudenDao {
    List<Studen> listStudens(StudenPage studenPage);
    Studen getStudensById(@Param("studentID") int studentID);
    int updateStuden(Studen studen);
    int saveStuden(Studen studen);
    int updateStudenByState(@Param("studentID") int studentID,@Param("state") String state);
    Studen getStudensByStudenName(@Param("studenName") String studenName);
    int getStudenNumber();
}
