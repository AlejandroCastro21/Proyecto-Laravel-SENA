import java.util.Scanner;
public class CompetenciasAprendices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir cantidad de aprendices
        System.out.print("Ingrese la cantidad de aprendices: ");
        int aprendices = sc.nextInt();

        // Pedir cantidad de competencias
        System.out.print("Ingrese la cantidad de competencias: ");
        int competencias = sc.nextInt();

        // Variables para contar totales del grupo
        int totalAprobadosGrupo = 0;
        int totalReprobadosGrupo = 0;

        // Captura de resultados por aprendiz
        for (int i = 1; i <= aprendices; i++) {
            int aprobados = 0;
            int reprobados = 0;

            System.out.println("\nAprendiz " + i + ":");
            for (int j = 1; j <= competencias; j++) {
                System.out.print("¿Aprueba la competencia " + j + "? (S/N): ");
                String respuesta = sc.next();

                if (respuesta.equalsIgnoreCase("S")) {
                    aprobados++;
                } else {
                    reprobados++;
                }
            }

            // Sumar al total del grupo
            totalAprobadosGrupo += aprobados;
            totalReprobadosGrupo += reprobados;

            // Calcular porcentajes del aprendiz
            double porcentajeAprobado = (aprobados * 100.0) / competencias;
            double porcentajeReprobado = (reprobados * 100.0) / competencias;

            // Mostrar resultados del aprendiz
            System.out.println("Resultados del aprendiz " + i + ":");
            System.out.println("Aprobados: " + aprobados);
            System.out.println("Reprobados: " + reprobados);
            System.out.println("Porcentaje aprobados: " + porcentajeAprobado + "%");
            System.out.println("Porcentaje reprobados: " + porcentajeReprobado + "%");
        }

        // Resultados del grupo
        int totalResultados = totalAprobadosGrupo + totalReprobadosGrupo;
        double porcentajeAprobadosGrupo = (totalAprobadosGrupo * 100.0) / totalResultados;
        double porcentajeReprobadosGrupo = (totalReprobadosGrupo * 100.0) / totalResultados;

        System.out.println("\n--- Resultados del grupo ---");
        System.out.println("Total de resultados aprobados: " + totalAprobadosGrupo);
        System.out.println("Total de resultados reprobados: " + totalReprobadosGrupo);
        System.out.println("Porcentaje de aprobados del grupo: " + porcentajeAprobadosGrupo + "%");
        System.out.println("Porcentaje de reprobados del grupo: " + porcentajeReprobadosGrupo + "%");
    }
}