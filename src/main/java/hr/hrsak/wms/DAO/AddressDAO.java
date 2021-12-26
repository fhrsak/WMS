package hr.hrsak.wms.DAO;


import hr.hrsak.wms.entity.Address;

import java.util.List;

public interface AddressDAO {
    public Address saveAddress(Address address);
    public Address getAddressById(int addressId);
}
