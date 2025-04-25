package com.beyzakurt.services;

import com.beyzakurt.dto.DtoStudent;
import com.beyzakurt.dto.DtoStudentIU;

import java.util.List;

public interface IStudentService {
    public DtoStudent saveStudent(DtoStudentIU student);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(int id);

    public void deleteStudent(int id);

    public DtoStudent updateStudent(int id, DtoStudentIU dtoStudentIU);
}
