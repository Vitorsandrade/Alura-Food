package br.com.alurafood.pagamentos.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//anotação para transformar o microserviço de pagamento em um cliente passando o nome do microserviço
@FeignClient("pedidos-ms")
public interface PedidoClient {
    //anotação para falar qual endpoint será acessado
    @RequestMapping(method = RequestMethod.PUT, value = "/pedidos/{id}/pago")
    void atualizaPagamento(@PathVariable Long id);
}
