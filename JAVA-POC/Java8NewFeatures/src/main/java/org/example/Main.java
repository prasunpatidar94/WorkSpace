package org.example;

import org.example.entitty.EmpInfo;
import org.example.entitty.EmpOnly;
import org.example.repo.EmpRepo;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<EmpInfo> emps = EmpRepo.getEmps();
        List<EmpOnly> empsOnly = EmpRepo.getEmpOnly();
        System.out.println(emps.stream().flatMap(empInfo -> empInfo.getEmails().stream()).collect(Collectors.toList()));
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(emps.stream().map(empInfo -> empInfo.getEmails()).collect(Collectors.toList()));
        System.out.println("---------------------------------------------------------------------------------------------");

        System.out.println(empsOnly.stream().collect(
                Collectors.groupingBy(
                        EmpOnly::getDept,
                        Collectors.reducing(
                                BinaryOperator.maxBy(
                                        Comparator.comparing(EmpOnly::getSalary)
                                )
                        )
                )
        ));

        System.out.println(empsOnly.stream().collect(
                        Collectors.groupingBy(
                                EmpOnly::getDept,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparingDouble(EmpOnly::getSalary)
                                        ),
                                        Optional::get
                                )
                        )
                )
        );


    }
}