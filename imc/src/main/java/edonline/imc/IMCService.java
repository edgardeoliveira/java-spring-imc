package edonline.imc;

import org.springframework.stereotype.Service;

@Service
public class IMCService {
    public double calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;
    }

    public String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Normal";
        } else if (imc >= 25.0 && imc <= 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}