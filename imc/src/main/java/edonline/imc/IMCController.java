package edonline.imc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IMCController {
    @Autowired
    private IMCService imcService;

    @GetMapping("/calcular-imc")
    public String calcularIMC(@RequestParam("peso") double peso, @RequestParam("altura") double altura) {
        double imc = imcService.calcularIMC(peso, altura);
        String classificacao = imcService.classificarIMC(imc);

        return "IMC: " + imc + ", Classificação: " + classificacao;
    }
}