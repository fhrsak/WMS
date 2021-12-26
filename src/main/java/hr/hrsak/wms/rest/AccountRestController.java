package hr.hrsak.wms.rest;


import hr.hrsak.wms.entity.Address;
import hr.hrsak.wms.service.AddressService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@Tag(name = "Account")
public class AccountRestController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/address")
    public Address saveAccount(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

    @GetMapping("address/{addressId}")
    public Address getAccountById(@PathVariable int addressId){
        return addressService.getAddressById(addressId);
    }




}
