package org.example.repo;

import org.example.entitty.Address;
import org.example.entitty.EmpInfo;
import org.example.entitty.EmpOnly;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpRepo {


    public static List<EmpInfo> getEmps() {
        List<EmpInfo> empInfos = Stream.of(
                new EmpInfo(101, "Prasun", "Kasrawad", "25", "Java",
                        Stream.of("abc@gmail.com", "cdf@gmail.com", "ujd@gmail.com", "orv@gmail.com").collect(Collectors.toList()),
                        new Address(451228, "Kasrwad", "Prasun Sadan", "ward 14", "Goya mandir")
                ),
                new EmpInfo(101, "Shiv", "Indore", "27", "React",
                        Stream.of("arbc@gmail.com", "cdyf@gmail.com", "ujod@gmail.com", "orlv@gmail.com").collect(Collectors.toList()),
                        new Address(451628, "Indore", "Shiv Sadan", "ward 14", "Shiv mandir")
                ),
                new EmpInfo(101, "Ram", "Bhopal", "29", "Python",
                        Stream.of("abdfc@gmail.com", "cdhyf@gmail.com", "ujujd@gmail.com", "otyrv@gmail.com").collect(Collectors.toList()),
                        new Address(450228, "Bhopal", "Ram Sadan", "ward 14", "Ram mandir")
                ),
                new EmpInfo(101, "Shiva", "Mahakal", "28", "Oracle",
                        Stream.of("agtybc@gmail.com", "cjkidf@gmail.com", "ulitjd@gmail.com", "outrrv@gmail.com").collect(Collectors.toList()),
                        new Address(459228, "Mahakal", "Mahakal Sadan", "ward 14", "Mahakal mandir")
                )
        ).collect(Collectors.toList());
        return empInfos;
    }

    public static List<EmpOnly> getEmpOnly(){

        return Stream.of(
                new EmpOnly("Mahakal",27000.0,"25","dev"),
                new EmpOnly("Prasun",26000.0,"25","dev"),
                new EmpOnly("Shiv",25000.0,"25","dev"),
                new EmpOnly("Ram",24000.0,"25","dev"),
                new EmpOnly("Hanuman",23000.0,"25","dev"),
                new EmpOnly("Bherav",37000.0,"25","pro"),
                new EmpOnly("Lakhan",36000.0,"25","pro"),
                new EmpOnly("Parvati",35000.0,"25","pro"),
                new EmpOnly("Krihana",34000.0,"25","pro"),
                new EmpOnly("Smarath",33000.0,"25","pro")
        ).collect(Collectors.toList());
    }
}
