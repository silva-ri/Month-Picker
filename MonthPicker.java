import java.util.Scanner;
import java.util.InputMismatchException;

public class MonthPicker
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final String[] YEAR_MONTH = {
            "", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        byte date;

        try
        {
            System.out.print("Escolha um número de 1 a 12: ");
            date = in.nextByte();
            System.out.println("O melhor mês para festejar é " + YEAR_MONTH[date]);
        }
        catch (InputMismatchException inputMisExc)
        {
            System.out.println("Lamento. Somente um número de um a doze.");
        }
    }
}