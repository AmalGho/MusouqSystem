package com.example.musouqsystem.Controller;

import com.example.musouqsystem.Api.ApiResponse;
import com.example.musouqsystem.Model.Orders;
import com.example.musouqsystem.Model.User;
import com.example.musouqsystem.Service.OrdersService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrdersController {
    private final OrdersService ordersService;

    @GetMapping("/get")
    public ResponseEntity getAllOrders(@AuthenticationPrincipal User user){
        return ResponseEntity.status(200).body(ordersService.getMyOrders(user.getId()));
    }

    @PostMapping("/makeOrder")
    public ResponseEntity shopperMakeOrder(@AuthenticationPrincipal User user){
        ordersService.ShopperMakeOrder(user.getId(),new Orders());
        return ResponseEntity.status(200).body(new ApiResponse("You created the order successfully"));
    }

    @PostMapping("/addProduct/{shopper_id}/{product_id}/{order_id}")
    public ResponseEntity shopperAddProductToOrder(@AuthenticationPrincipal User user,@PathVariable Integer shopper_id, @PathVariable Integer product_id , @PathVariable Integer order_id){
        ordersService.ShopperAddProductToOrder(user.getId(), shopper_id, product_id, order_id);
        return ResponseEntity.status(200).body(new ApiResponse("The product added successfully to order"));
    }

    @PutMapping ("/calcAmount/{order_id}/{product_id}")
    public ResponseEntity calculateProductsAmountControlller(@AuthenticationPrincipal User user,@PathVariable Integer order_id, @PathVariable Integer product_id){

        return ResponseEntity.status(200).body(new ApiResponse("The order total amount = "+ ordersService.calculateProductsAmount(user.getId(), order_id, product_id)));
    }
    @PutMapping("/SelectshippingCompany/{order_id}/{shippingCompany_id}")
    public ResponseEntity selectShippingCompanyController(@AuthenticationPrincipal User user,@PathVariable Integer order_id, @PathVariable Integer shippingCompany_id){
        return ResponseEntity.status(200).body(new ApiResponse("The total amount after select shipping company = "+ordersService.selectShippingCompany(user.getId(), order_id, shippingCompany_id)));
    }


    @PutMapping("/completeOrder/{order_id}")
    public ResponseEntity completeOrderController(@AuthenticationPrincipal User user,@PathVariable Integer order_id){
        return ResponseEntity.status(200).body(ordersService.completeOrder(user.getId(),order_id));
    }

    @PutMapping("/deleviredOrder/{order_id}")
    public ResponseEntity deliveredOrderedController(@AuthenticationPrincipal User user,@PathVariable Integer order_id){
        ordersService.deliveredOrder(user.getId(),order_id);
     return ResponseEntity.status(200).body(new ApiResponse("The order status changed to delivered successfully"));
    }

    @DeleteMapping("/deleteOrder/{order_id}")
    public ResponseEntity deleteOrderController(@AuthenticationPrincipal User user,@PathVariable Integer order_id){
        ordersService.deleteOrder(user.getId(),order_id);
        return ResponseEntity.status(200).body(new ApiResponse("The ordered deleted successfully"));

    }
}
