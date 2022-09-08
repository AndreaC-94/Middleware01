package co.develhope.Middleware01.services;

import org.springframework.stereotype.Service;

@Service
public class LegacyService {


    public String message() {
        return "This is just old code";
    }
}
