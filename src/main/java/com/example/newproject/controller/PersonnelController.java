package com.example.newproject.controller;

import com.example.newproject.model.Personnel;
import com.example.newproject.service.PersonnelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path = "/hotel/personnel")
@Slf4j
public class PersonnelController {

    private final PersonnelService personnelService;

    public PersonnelController(PersonnelService personnelService) {
        this.personnelService = personnelService;
    }

    @GetMapping("/{id}")
    public Personnel getPersonnelById(@PathVariable Long id){
        return personnelService.getPersonnelById(id);
    }

//    @GetMapping
//    public List<Personnel> getAllPersonnel(@RequestParam(value = "id", required = false, defaultValue = "100") Long id) {
//        if (Objects.nonNull(id)) {
//            return Collections.singletonList(new Personnel(id, "Jacek", "Warzycha", "Parkingowy",
//                    LocalDate.parse("2000-11-13"), 3500.0, false));
//        }
//        return Collections.singletonList(new Personnel(5L, "Jacek", "Warzycha", "Parkingowy",
//                LocalDate.parse("2000-11-13"), 3500.0, false));
//    }
//
//    @PostMapping
//    public ResponseEntity<?> createNewPersonnel(@RequestBody Personnel personnel) {
//        personnel.setId(1000L);
//        return ResponseEntity.status(HttpStatus.CREATED).body(personnel);
//    }
//
//    @PutMapping("/{id}")
//    public Personnel updatePersonnel(@PathVariable Long id, @RequestBody Personnel personnel) {
//        if (id.equals(50000L)) {
//            log.info(personnel.toString());
//            personnel.setId(personnel.getId() + 1L);
//            return personnel;
//        }
//        return null;
//    }
}
