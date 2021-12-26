package hr.hrsak.wms.rest;

import hr.hrsak.wms.entity.Account;
import hr.hrsak.wms.service.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "Account")
public class AccountRestController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    @Operation(summary = "Get all accounts", responses = {
            @ApiResponse(description = "Get user success", responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Account.class)))
    })
    public List<Account> getAccounts(){
        return accountService.getAccounts();
    }

    @GetMapping("account/{accountId}")
    public Account getAccountById(@PathVariable int accountId){
        return accountService.getAccountById(accountId);
    }

    @PostMapping("/account")
    public Account saveAccount(@RequestBody Account account){
        return accountService.saveAccount(account);
    }
}
