package service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.trustbanc.AddService")
public class AddServiceImpl implements AddService{
    @Override
    public int add(int a, int b) {
        return 0;
    }
}
