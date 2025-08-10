package com.ruoyi.web.controller.order;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.Orders;
import com.ruoyi.system.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController extends BaseController {

    @Autowired
    private IOrderService orderService;

    @PostMapping("/add")
    public AjaxResult add(@RequestBody Orders orders){
        return toAjax(orderService.insert(orders));
    }

    @GetMapping(value="/{orderId}")
    public AjaxResult getOrderInfo(@PathVariable("orderId") Long orderId){
        return success(orderService.selectByPrimaryKey(orderId));
    }
}
