package com.online.school.service.serviceimpl;

import com.online.school.entity.Registration;
import com.online.school.repository.RegistrationRepo;
import com.online.school.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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
    public Registration save(Registration registration) throws RuntimeException{
        Registration save = registrationRepo.save(registration);
        //throw new NullPointerException("null pointer");
        Registration savereg = savereg(registration);
        return savereg;
    }

    private Registration savereg(Registration registration) throws RuntimeException {
        Registration save = registrationRepo.save(registration);
        save.setClassName(null);
        save.getClassName();
        return save;
    }

    @Override
    public List<Registration> findByFirstnameLike(String fname) {
        return registrationRepo.findByFirstNameLike(fname);
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
