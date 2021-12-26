package hr.hrsak.wms.service;

import hr.hrsak.wms.entity.Address;

public interface AddressService {
    public Address saveAddress(Address address);
    public Address getAddressById(int addressId);
}
