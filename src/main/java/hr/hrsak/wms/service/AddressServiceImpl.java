package hr.hrsak.wms.service;

import hr.hrsak.wms.DAO.AccountDAO;
import hr.hrsak.wms.DAO.AddressDAO;
import hr.hrsak.wms.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressDAO addressDAO;

    @Transactional
    @Override
    public Address saveAddress(Address address) {
        return addressDAO.saveAddress(address);
    }

    @Transactional
    @Override
    public Address getAddressById(int addressId) {
        return addressDAO.getAddressById(addressId);
    }
}
