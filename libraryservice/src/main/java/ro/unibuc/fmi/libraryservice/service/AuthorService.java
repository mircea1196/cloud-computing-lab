package ro.unibuc.fmi.libraryservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.unibuc.fmi.libraryservice.entity.Author;
import ro.unibuc.fmi.libraryservice.repository.AuthorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

}
