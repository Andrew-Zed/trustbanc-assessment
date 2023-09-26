package service;

import jakarta.jws.WebMethod;

public interface AddService {
    @WebMethod
    int add(int a, int b);

}
