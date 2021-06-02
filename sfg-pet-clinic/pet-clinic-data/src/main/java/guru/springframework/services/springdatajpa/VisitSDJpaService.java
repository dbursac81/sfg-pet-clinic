package guru.springframework.services.springdatajpa;

import guru.springframework.model.Visit;
import guru.springframework.repositories.VisitRepository;
import guru.springframework.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository repo;

    public VisitSDJpaService(VisitRepository repo) {
        this.repo = repo;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        repo.findAll().forEach(visits::add);

        return null;
    }

    @Override
    public Visit findById(Long aLong) {

        return repo.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return repo.save(object);
    }

    @Override
    public void delete(Visit object) {
        repo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repo.deleteById(aLong);
    }
}
