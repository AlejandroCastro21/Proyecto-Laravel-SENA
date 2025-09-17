import java.util.Scanner;

public class RegistroAsistencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Paso 1: número de aprendices
        System.out.print("Ingrese el número total de aprendices: ");
        int n = sc.nextInt();

        // Paso 2: número de días de registro (una sola vez)
        System.out.print("Ingrese la cantidad de días de registro: ");
        int dias = sc.nextInt();
        sc.nextLine();

        // Paso 3: arreglos para cada aprendiz
        int[] presentes = new int[n];
        int[] ausentes = new int[n];
        int totalPresentes = 0;
        int totalAusentes = 0;

        // Paso 4: registrar asistencia
        for (int i = 0; i < n; i++) {
            System.out.println("\nRegistro de aprendiz " + (i + 1));
            for (int d = 0; d < dias; d++) {
                System.out.print("Día " + (d + 1) + " (S/N): ");
                String respuesta = sc.nextLine().trim().toUpperCase();

                if (respuesta.equals("S")) {
                    presentes[i]++;
                    totalPresentes++;
                } else {
                    ausentes[i]++;
                    totalAusentes++;
                }
            }
        }

        int totalRegistros = dias * n;
        double porcentajeAsistencia = (totalPresentes * 100.0) / totalRegistros;
        double porcentajeInasistencia = (totalAusentes * 100.0) / totalRegistros;

        // Paso 5: mostrar resultados
        System.out.println("\nRESULTADOS GENERALES");
        System.out.printf("Porcentaje de asistencia general: %.2f%%\n", porcentajeAsistencia);
        System.out.printf("Porcentaje de inasistencia general: %.2f%%\n", porcentajeInasistencia);
        System.out.println("Total de presentes: " + totalPresentes);
        System.out.println("Total de ausentes: " + totalAusentes);

        System.out.println("\nInasistencias por aprendiz:");
        for (int i = 0; i < n; i++) {
            double porcentajeIndiv = (ausentes[i] * 100.0) / dias;
            System.out.printf("Aprendiz %d = Inasistencias: %d (%.2f%%)\n",
                              (i + 1), ausentes[i], porcentajeIndiv);
        }

        sc.close();
    }
}
//guarde las calificaciones de un grupo de aprendices, para cada un resultado de la competencia, como 
//instructor debe verificar la competencia y el resultado de aprendizajes asociado, guardar
//si aprueban o reprueban para cada resulado, depues se calculapara cada aprendiz la cantidad 
//de materias aprobadas y el promedio de aprobados/reprobados por el grupo
