package practicagraficas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

public class Grafico {
    private DefaultCategoryDataset dataset;
    private JFreeChart chart;

    public void crearHistograma(int[] datos, JPanel panel, Color color) {
        // Crea un nuevo conjunto de datos de categoría por defecto
        dataset = new DefaultCategoryDataset();
        for (int i = 1; i < datos.length; i++) {
            // Agrega el valor al conjunto de datos de la categoría
            dataset.addValue(datos[i],String.valueOf(i), "Estado de Procesos");
        }

        // Se crea un nuevo gráfico de barras
        chart = ChartFactory.createBarChart(
                "Planificador Round Robin",
                "ID Procesos",
                "Tiempo",
                dataset
        );

        // Color de fondo del gráfico mediante argumento
        chart.setBackgroundPaint(color);

        // Color del título en el gráfico
        chart.getTitle().setPaint(Color.BLACK);

        // Se crea un nuevo panel de gráfico con el gráfico de barras
        ChartPanel chartPanel = new ChartPanel(chart);

        // Tamaño del panel gráfico ajustable
        chartPanel.setPreferredSize(new Dimension(panel.getWidth(), panel.getHeight()));

        // Elimina todos los componentes del panel
        panel.removeAll();

        // Establece el diseño del panel
        panel.setLayout(new BorderLayout());

        // Se agrega el panel gráfico al centro del panel recibido
        panel.add(chartPanel, BorderLayout.CENTER);

        // Valida el panel para la visualización de los componentes
        panel.validate();
    }
    //Actualiza el color de la barra de un proceso 
    public void editarColorProceso(int IDProcess, Color color) {
        chart.getCategoryPlot().getRenderer().setSeriesPaint(IDProcess, color);
    }
     // Método para comparar el color de una barra con un color dado
    public boolean colorProceso(int IDProcess, Color color) {
        // Obtener el color actual de la barra del proceso
        Color colorActual = (Color) chart.getCategoryPlot().getRenderer().getSeriesPaint(IDProcess);

        // Comparar los colores
        return colorActual.equals(color);
    }
}
