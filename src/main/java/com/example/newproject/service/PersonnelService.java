package com.example.newproject.service;

import com.example.newproject.model.Personnel;

import java.util.List;

public interface PersonnelService {

    Personnel getPersonnelById(Long id);

    List<Personnel> getAllPersonnel();

    boolean removePersonnelById(Long id);

    Personnel createNewPersonnel(Personnel personnel);

    Personnel updatePersonnelById(Long id, Personnel personnel);

}
