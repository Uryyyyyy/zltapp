package com.zlt.service;

import com.zlt.pojo.EduTeacher;

import java.util.List;

public interface TeacherService {

    List<EduTeacher> findAllTeacher();
    EduTeacher findByTeacherId(String teacherId);
    EduTeacher findTeacherByMobile(String teacherMobile);
    EduTeacher findByEmail(String teacherEmail);
    int addTeacher(EduTeacher eduTeacher);
    int updateTeacher(EduTeacher eduTeacher);
    int deleteTeacher(String teacherId);
}
