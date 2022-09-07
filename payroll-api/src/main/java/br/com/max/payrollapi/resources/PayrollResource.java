package br.com.max.payrollapi.resources;

import br.com.max.payrollapi.domain.Payroll;
import br.com.max.payrollapi.domain.User;
import br.com.max.payrollapi.feignClients.UserFeign;
import br.com.max.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private final PayrollService service;

    @GetMapping(value = "/{workedId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable("workedId") Long workerId, @RequestBody Payroll payment){

        return ResponseEntity.ok().body(service.getPayment(workerId, payment));
    }
}
