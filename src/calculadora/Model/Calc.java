package calculadora.Model;

public class Calc {

    private Character Operador;
    private Float Valor1;
    private Float Valor2;

    public Character getOperador() {
        return Operador;
    }

    public void setOperador(Character Operador) {
        this.Operador = Operador;
    }

    public Float getValor1() {
        return Valor1;
    }

    public void setValor1(Float Valor1) {
        this.Valor1 = Valor1;
    }

    public Float getValor2() {
        return Valor2;
    }

    public void setValor2(Float Valor2) {
        this.Valor2 = Valor2;
    }

    public float Resultado() {
        if (this.getOperador() == "+".charAt(0)) {
            return this.Valor1 + this.Valor2;
        } else
            if (this.getOperador() == "-".charAt(0)) {
            return this.Valor1 - this.Valor2;
        }else
            if (this.getOperador() == "*".charAt(0)) {
            return this.Valor1 * this.Valor2;
        }else
            if (this.getOperador() == "/".charAt(0)) {
            return this.Valor1 / this.Valor2;
        }
            else {
            return 0.0f;
        }
    }
}
