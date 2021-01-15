package com.online.school.service.serviceimpl;

import com.online.school.entity.Registration;
import com.online.school.repository.RegistrationRepo;
import com.online.school.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepo registrationRepo;

    @Override
    public List<Registration> findAll() {
        return registrationRepo.findAll();
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public Registration save(Registration registration) throws RuntimeException {
        long id = 10l;

        Optional<Registration> byId = registrationRepo.findById(id);
        Registration registration1 = byId.get();

        Registration reg = new Registration();

        reg.setId(id);reg.setClassName("aaa");reg.setEmail("er.ra@gmail.com");reg.setFatherName("Dalvir");
        reg.setFirstName("Rajneesh");reg.setLastName("kabeer");reg.setMobileNo("3453443");
        reg.setSection("A");reg.setSession("2011-2015");

        Registration build = registration1.builder().id(id).className("aaa").email("er.gmail.com").firstName("dfsf")
                .fatherName("Rajneesh").mobileNo("erwerwe").lastName("ererw").section("A").session("2011-2015").build();

        Registration save = registrationRepo.save(reg);
        //throw new NullPointerException("null pointer");

        return reg;
    }

    private Registration savereg(Registration registration) throws RuntimeException {
        Registration save = registrationRepo.save(registration);
        save.setClassName(null);
        save.getClassName();
        return save;
    }

    @Override
    public List<Registration> findByFirstnameLike(String fname) {
        List<Registration> byFirstNameLike = registrationRepo.findByFirstNameLike(fname);
        return byFirstNameLike;
    }

    @Override
    public List<Registration> findByFirstnameContaining(String fname) {
        return registrationRepo.findByFirstNameContaining(fname);
    }

    @Override
    public void delete(Long id) {

        registrationRepo.deleteById(id);
    }
}
