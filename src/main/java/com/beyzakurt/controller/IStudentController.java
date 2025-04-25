package com.beyzakurt.controller;

import com.beyzakurt.dto.DtoStudent;
import com.beyzakurt.dto.DtoStudentIU;

import java.util.List;


public interface IStudentController {
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(int id);

    public void deleteStudent(int id);

    public DtoStudent updateStudent(int id, DtoStudentIU dtoStudentIU);
}
