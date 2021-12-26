package hr.hrsak.wms.rest;

import hr.hrsak.wms.entity.Orders;
import hr.hrsak.wms.service.OrdersService;
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
@Tag(name = "Orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/orders")
    @Operation(summary = "Get all orders",responses = {
            @ApiResponse(description = "Get orders", responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Orders.class)))
    })
    public List<Orders> getOrders(){
        return ordersService.getOrders();
    }

    @GetMapping("/ordes/{orderId}")
    public Orders getOrder(@PathVariable int orderId){
        return ordersService.getOrder(orderId);
    }

    @PostMapping("/orders")
    public Orders saveOrder(@RequestBody Orders order){
        return ordersService.saveOrder(order);
    }
}
