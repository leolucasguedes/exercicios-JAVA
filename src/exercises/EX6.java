package exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Feriado {
    private Date data;
    private String nome;

    public Feriado(String dataString, String nome) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.data = dateFormat.parse(dataString);
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }
}

public class EX6 {
    private static List<Feriado> feriados = new ArrayList<>();

    static {
        try {
            feriados.add(new Feriado("01-01-2024", "Confraternização Mundial"));
            feriados.add(new Feriado("12-02-2024", "Carnaval"));
            feriados.add(new Feriado("13-02-2024", "Carnaval"));
            feriados.add(new Feriado("29-03-2024", "Sexta-feira Santa"));
            feriados.add(new Feriado("21-04-2024", "Tiradentes"));
            feriados.add(new Feriado("01-05-2024", "Dia do Trabalho"));
            feriados.add(new Feriado("30-05-2024", "Corpus Christi"));
            feriados.add(new Feriado("07-09-2024", "Independência do Brasil"));
            feriados.add(new Feriado("12-10-2024", "Nossa Senhora Aparecida"));
            feriados.add(new Feriado("02-11-2024", "Finados"));
            feriados.add(new Feriado("15-11-2024", "Proclamação da República"));
            feriados.add(new Feriado("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
            feriados.add(new Feriado("25-12-2024", "Natal"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void imprimirFeriados() {
        for (Feriado feriado : feriados) {
            System.out.println(feriado.getData() + " - " + feriado.getNome());
        }
    }

    public static String verificaFeriado(String dataString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date data = dateFormat.parse(dataString);

        for (Feriado feriado : feriados) {
            if (feriado.getData().equals(data)) {
                return "Dia " + dataString + " é " + feriado.getNome() + "!";
            }
        }

        return "Dia " + dataString + " não é feriado.";
    }

    public static void main(String[] args) {
        imprimirFeriados();

        try {
            String mensagem = verificaFeriado("02-11-2024");
            System.out.println(mensagem);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

