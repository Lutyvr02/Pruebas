package Estu;

public class Estudiante {
    public String notas (int nota){
        if (nota<0){
            return "nota sin sentido";
        }
        else if (nota <= 70){
            return "Necesitas mejorar nota: "+nota;
        } else if (nota >70 && nota<=80) {
            return"Bien nota: "+nota;
        }else if (nota >80 && nota<=90) {
            return"Muy Bien nota: "+nota;
        }else if (nota >90 && nota<=100) {
            return"Excelente nota: "+nota;
        } else if (nota >100) {
            return"Tu nota no tiene sentido";
        }
        return "No se";
    }
}
