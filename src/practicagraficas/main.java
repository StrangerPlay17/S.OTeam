package practicagraficas;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;

public class main extends javax.swing.JFrame {
    int [] conjunto = {5,7,4,3,7,9,2,1,6,8}; 
    Burbuja b; //Instancia del objeto tipo Burbuja
    Grafico g; //Instancia objeto Grafica
    //--------------------------------------------------
    List<Process> procesos = new ArrayList<>(); // Lista procesos nuevos 
    List<Process> terminados = new ArrayList<>(); // Lista procesos terminados
    List<Process> list_bloqueados = new ArrayList<>(); // Lista procesos bloqueados
    Process ejecucion; //Proceso en ejecucion 
    List<Integer> tiempos_procesos = new ArrayList<>(); // Lista para almacenar tiempos de procesos
    Queue<Process> cola_listos = new LinkedList<>(); //Cola de listos
    //----------------------------------------------------
    //proceso = new Process(1); //Process recibe como argumento el ID del proceso 
    //Variable, hilos e interrupciones
    private int contador_global; //Global Count
    private int Quantum; //Quantum RR
    private int quantum_time; //Quantum Time
    private int ID = 1; //Process ID
    //private int actual_timer; //Tiempo del proceso actual al continuar luego de interrupcion "pausa"
    private int wait_timer = 0; //Guarda la referencia del tiempo de proceso en ejecucion 
    //private Thread contadorThread; //Global Count Thread
    //private Thread GraficaThread; //Hilo de Grafica 
    private Thread tiemposThread; //Hilo de Tiempos
    private volatile boolean ejecutando = true; //Interrupcion Continuar/Pausar hilo
    private int color_bloqueado = 0; //Color del "bloqueado" en cola de listos 
    private volatile boolean terminado = false; //Interrupcion Terminado
    private volatile boolean tiempos = true; //Bandera de interrupcion de tiempos 
    //private Thread bloqueadosThread; //Global Count Thread
    private volatile boolean bloqueados = true; // Bandera para controlar la ejecución del hilo
    //private int threadCount = 0; // Contador para generar identificadores únicos de hilo
    private DefaultTableModel tablaBloqueados = new DefaultTableModel(); //Tabla bloqueados 
    private DefaultTableModel tablaCola = new DefaultTableModel(); //Tabla cola listos
    private DefaultTableModel tablaTerminados = new DefaultTableModel(); //Tabla terminados
    
    public main() {
        initComponents();
        b = new Burbuja(conjunto);
        g = new Grafico();
        contador_global = 0;  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        cpu = new javax.swing.JList<>();
        panel_cpu3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        label_ocupado3 = new javax.swing.JLabel();
        label_tiempo3 = new javax.swing.JLabel();
        label_id4 = new javax.swing.JLabel();
        tiempo_cpu3 = new javax.swing.JLabel();
        id_cpu3 = new javax.swing.JLabel();
        ocupado_cpu3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel = new javax.swing.JPanel();
        panel_cpu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_ocupado = new javax.swing.JLabel();
        label_tiempo = new javax.swing.JLabel();
        label_id1 = new javax.swing.JLabel();
        tiempo_cpu = new javax.swing.JLabel();
        id_cpu = new javax.swing.JLabel();
        ocupado_cpu = new javax.swing.JLabel();
        panel_cpu1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label_llegada = new javax.swing.JLabel();
        tiempo_llegada = new javax.swing.JLabel();
        panel_cpu2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        label_respuesta = new javax.swing.JLabel();
        tiempo_respuesta = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_cola = new javax.swing.JTable();
        label_cola = new javax.swing.JLabel();
        iniciar = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        ejecutar = new javax.swing.JButton();
        label_leyenda = new javax.swing.JLabel();
        label_cola_listos = new javax.swing.JLabel();
        label_ejecutando = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_terminados = new javax.swing.JTable();
        label_contador = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();
        label_bloqueados4 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla_cola1 = new javax.swing.JTable();
        label_cola1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabla_terminados1 = new javax.swing.JTable();
        label_bloqueados5 = new javax.swing.JLabel();
        panel_cpu4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        label_respuesta1 = new javax.swing.JLabel();
        tiempo_respuesta1 = new javax.swing.JLabel();
        panel_cpu6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        label_ocupado1 = new javax.swing.JLabel();
        label_tiempo1 = new javax.swing.JLabel();
        label_id2 = new javax.swing.JLabel();
        tiempo_cpu1 = new javax.swing.JLabel();
        id_cpu1 = new javax.swing.JLabel();
        ocupado_cpu1 = new javax.swing.JLabel();
        panel_cpu5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        label_llegada1 = new javax.swing.JLabel();
        tiempo_llegada1 = new javax.swing.JLabel();
        panel_cpu7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        label_ocupado2 = new javax.swing.JLabel();
        label_tiempo2 = new javax.swing.JLabel();
        label_id3 = new javax.swing.JLabel();
        tiempo_cpu2 = new javax.swing.JLabel();
        id_cpu2 = new javax.swing.JLabel();
        ocupado_cpu2 = new javax.swing.JLabel();
        panel_cpu8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        label_llegada2 = new javax.swing.JLabel();
        tiempo_llegada2 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla_cola2 = new javax.swing.JTable();
        panel_cpu9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        label_respuesta2 = new javax.swing.JLabel();
        tiempo_respuesta2 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabla_terminados2 = new javax.swing.JTable();
        label_cola2 = new javax.swing.JLabel();
        label_bloqueados6 = new javax.swing.JLabel();

        cpu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(cpu);

        panel_cpu3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel4.setText("Tiempo de respuesta");

        label_ocupado3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_ocupado3.setText("Ocupado:");

        label_tiempo3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_tiempo3.setText("Tiempo:");

        label_id4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_id4.setText("ID:");

        tiempo_cpu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiempo_cpu3.setText("32");

        id_cpu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id_cpu3.setText("32");

        ocupado_cpu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ocupado_cpu3.setText("32");

        javax.swing.GroupLayout panel_cpu3Layout = new javax.swing.GroupLayout(panel_cpu3);
        panel_cpu3.setLayout(panel_cpu3Layout);
        panel_cpu3Layout.setHorizontalGroup(
            panel_cpu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_cpu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cpu3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel_cpu3Layout.createSequentialGroup()
                        .addGroup(panel_cpu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_tiempo3)
                            .addComponent(label_id4)
                            .addComponent(label_ocupado3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_cpu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tiempo_cpu3)
                            .addComponent(id_cpu3)
                            .addComponent(ocupado_cpu3))
                        .addGap(71, 71, 71))))
        );
        panel_cpu3Layout.setVerticalGroup(
            panel_cpu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tiempo3)
                    .addComponent(tiempo_cpu3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id4)
                    .addComponent(id_cpu3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ocupado3)
                    .addComponent(ocupado_cpu3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        panel.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );

        panel_cpu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CPU SJF");

        label_ocupado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_ocupado.setText("Ocupado:");

        label_tiempo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_tiempo.setText("Tiempo de ráfaga:");

        label_id1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_id1.setText("ID:");

        tiempo_cpu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiempo_cpu.setText("0");

        id_cpu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id_cpu.setText("0");

        ocupado_cpu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ocupado_cpu.setText("0");

        javax.swing.GroupLayout panel_cpuLayout = new javax.swing.GroupLayout(panel_cpu);
        panel_cpu.setLayout(panel_cpuLayout);
        panel_cpuLayout.setHorizontalGroup(
            panel_cpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_cpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panel_cpuLayout.createSequentialGroup()
                            .addComponent(label_ocupado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ocupado_cpu))
                        .addGroup(panel_cpuLayout.createSequentialGroup()
                            .addComponent(label_id1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_cpu))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_cpuLayout.createSequentialGroup()
                            .addComponent(label_tiempo)
                            .addGap(29, 29, 29)
                            .addComponent(tiempo_cpu)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panel_cpuLayout.setVerticalGroup(
            panel_cpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tiempo)
                    .addComponent(tiempo_cpu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id1)
                    .addComponent(id_cpu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ocupado)
                    .addComponent(ocupado_cpu))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panel_cpu1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setText("Tiempo de llegada");

        label_llegada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_llegada.setText("Tiempo:");

        tiempo_llegada.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiempo_llegada.setText("0");

        javax.swing.GroupLayout panel_cpu1Layout = new javax.swing.GroupLayout(panel_cpu1);
        panel_cpu1.setLayout(panel_cpu1Layout);
        panel_cpu1Layout.setHorizontalGroup(
            panel_cpu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_cpu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cpu1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel_cpu1Layout.createSequentialGroup()
                        .addComponent(label_llegada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tiempo_llegada)
                        .addGap(71, 71, 71))))
        );
        panel_cpu1Layout.setVerticalGroup(
            panel_cpu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_llegada)
                    .addComponent(tiempo_llegada))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panel_cpu2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setText("Tiempo de respuesta");

        label_respuesta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_respuesta.setText("Tiempo:");

        tiempo_respuesta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiempo_respuesta.setText("0");

        javax.swing.GroupLayout panel_cpu2Layout = new javax.swing.GroupLayout(panel_cpu2);
        panel_cpu2.setLayout(panel_cpu2Layout);
        panel_cpu2Layout.setHorizontalGroup(
            panel_cpu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_cpu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cpu2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel_cpu2Layout.createSequentialGroup()
                        .addComponent(label_respuesta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tiempo_respuesta)
                        .addGap(71, 71, 71))))
        );
        panel_cpu2Layout.setVerticalGroup(
            panel_cpu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_respuesta)
                    .addComponent(tiempo_respuesta))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tabla_cola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_cola.setCellSelectionEnabled(true);
        jScrollPane4.setViewportView(tabla_cola);

        label_cola.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        label_cola.setForeground(new java.awt.Color(0, 153, 153));
        label_cola.setText("Cola listos");

        iniciar.setBackground(new java.awt.Color(255, 255, 0));
        iniciar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        iniciar.setText("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        stop.setBackground(new java.awt.Color(0, 255, 204));
        stop.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        stop.setText("Stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        ejecutar.setBackground(new java.awt.Color(0, 255, 204));
        ejecutar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        ejecutar.setText("Ejecutar");
        ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarActionPerformed(evt);
            }
        });

        label_leyenda.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        label_leyenda.setText("Leyenda:");

        label_cola_listos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        label_cola_listos.setForeground(new java.awt.Color(0, 153, 153));
        label_cola_listos.setText("Cola listos");

        label_ejecutando.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        label_ejecutando.setForeground(new java.awt.Color(255, 0, 0));
        label_ejecutando.setText("Ejecutando");

        tabla_terminados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_terminados.setCellSelectionEnabled(true);
        jScrollPane5.setViewportView(tabla_terminados);

        label_contador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_contador.setForeground(new java.awt.Color(0, 0, 204));
        label_contador.setText("Conter:");

        contador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contador.setForeground(new java.awt.Color(204, 0, 0));
        contador.setText("0");

        label_bloqueados4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        label_bloqueados4.setForeground(new java.awt.Color(204, 0, 51));
        label_bloqueados4.setText("Terminados");

        panel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );

        panel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );

        tabla_cola1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_cola1.setCellSelectionEnabled(true);
        jScrollPane6.setViewportView(tabla_cola1);

        label_cola1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        label_cola1.setForeground(new java.awt.Color(0, 153, 153));
        label_cola1.setText("Cola listos");

        tabla_terminados1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_terminados1.setCellSelectionEnabled(true);
        jScrollPane7.setViewportView(tabla_terminados1);

        label_bloqueados5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        label_bloqueados5.setForeground(new java.awt.Color(204, 0, 51));
        label_bloqueados5.setText("Terminados");

        panel_cpu4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel5.setText("Tiempo de respuesta");

        label_respuesta1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_respuesta1.setText("Tiempo:");

        tiempo_respuesta1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiempo_respuesta1.setText("0");

        javax.swing.GroupLayout panel_cpu4Layout = new javax.swing.GroupLayout(panel_cpu4);
        panel_cpu4.setLayout(panel_cpu4Layout);
        panel_cpu4Layout.setHorizontalGroup(
            panel_cpu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label_respuesta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tiempo_respuesta1)
                .addGap(71, 71, 71))
            .addGroup(panel_cpu4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_cpu4Layout.setVerticalGroup(
            panel_cpu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_respuesta1)
                    .addComponent(tiempo_respuesta1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panel_cpu6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("CPU SRT");

        label_ocupado1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_ocupado1.setText("Ocupado:");

        label_tiempo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_tiempo1.setText("Tiempo de ráfaga:");

        label_id2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_id2.setText("ID:");

        tiempo_cpu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiempo_cpu1.setText("0");

        id_cpu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id_cpu1.setText("0");

        ocupado_cpu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ocupado_cpu1.setText("0");

        javax.swing.GroupLayout panel_cpu6Layout = new javax.swing.GroupLayout(panel_cpu6);
        panel_cpu6.setLayout(panel_cpu6Layout);
        panel_cpu6Layout.setHorizontalGroup(
            panel_cpu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_cpu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cpu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panel_cpu6Layout.createSequentialGroup()
                            .addComponent(label_ocupado1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ocupado_cpu1))
                        .addGroup(panel_cpu6Layout.createSequentialGroup()
                            .addComponent(label_id2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_cpu1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_cpu6Layout.createSequentialGroup()
                            .addComponent(label_tiempo1)
                            .addGap(29, 29, 29)
                            .addComponent(tiempo_cpu1)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panel_cpu6Layout.setVerticalGroup(
            panel_cpu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tiempo1)
                    .addComponent(tiempo_cpu1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id2)
                    .addComponent(id_cpu1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ocupado1)
                    .addComponent(ocupado_cpu1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panel_cpu5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel6.setText("Tiempo de llegada");

        label_llegada1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_llegada1.setText("Tiempo:");

        tiempo_llegada1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiempo_llegada1.setText("0");

        javax.swing.GroupLayout panel_cpu5Layout = new javax.swing.GroupLayout(panel_cpu5);
        panel_cpu5.setLayout(panel_cpu5Layout);
        panel_cpu5Layout.setHorizontalGroup(
            panel_cpu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label_llegada1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tiempo_llegada1)
                .addGap(71, 71, 71))
            .addGroup(panel_cpu5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_cpu5Layout.setVerticalGroup(
            panel_cpu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_llegada1)
                    .addComponent(tiempo_llegada1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_cpu7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("CPU RR");

        label_ocupado2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_ocupado2.setText("Ocupado:");

        label_tiempo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_tiempo2.setText("Tiempo de ráfaga:");

        label_id3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_id3.setText("ID:");

        tiempo_cpu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiempo_cpu2.setText("0");

        id_cpu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        id_cpu2.setText("0");

        ocupado_cpu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ocupado_cpu2.setText("0");

        javax.swing.GroupLayout panel_cpu7Layout = new javax.swing.GroupLayout(panel_cpu7);
        panel_cpu7.setLayout(panel_cpu7Layout);
        panel_cpu7Layout.setHorizontalGroup(
            panel_cpu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_cpu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_cpu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panel_cpu7Layout.createSequentialGroup()
                            .addComponent(label_ocupado2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ocupado_cpu2))
                        .addGroup(panel_cpu7Layout.createSequentialGroup()
                            .addComponent(label_id3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_cpu2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_cpu7Layout.createSequentialGroup()
                            .addComponent(label_tiempo2)
                            .addGap(29, 29, 29)
                            .addComponent(tiempo_cpu2)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panel_cpu7Layout.setVerticalGroup(
            panel_cpu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tiempo2)
                    .addComponent(tiempo_cpu2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id3)
                    .addComponent(id_cpu2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ocupado2)
                    .addComponent(ocupado_cpu2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panel_cpu8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel9.setText("Tiempo de llegada");

        label_llegada2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_llegada2.setText("Tiempo:");

        tiempo_llegada2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiempo_llegada2.setText("0");

        javax.swing.GroupLayout panel_cpu8Layout = new javax.swing.GroupLayout(panel_cpu8);
        panel_cpu8.setLayout(panel_cpu8Layout);
        panel_cpu8Layout.setHorizontalGroup(
            panel_cpu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label_llegada2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tiempo_llegada2)
                .addGap(71, 71, 71))
            .addGroup(panel_cpu8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_cpu8Layout.setVerticalGroup(
            panel_cpu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_llegada2)
                    .addComponent(tiempo_llegada2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla_cola2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_cola2.setCellSelectionEnabled(true);
        jScrollPane8.setViewportView(tabla_cola2);

        panel_cpu9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel10.setText("Tiempo de respuesta");

        label_respuesta2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_respuesta2.setText("Tiempo:");

        tiempo_respuesta2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiempo_respuesta2.setText("0");

        javax.swing.GroupLayout panel_cpu9Layout = new javax.swing.GroupLayout(panel_cpu9);
        panel_cpu9.setLayout(panel_cpu9Layout);
        panel_cpu9Layout.setHorizontalGroup(
            panel_cpu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label_respuesta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tiempo_respuesta2)
                .addGap(71, 71, 71))
            .addGroup(panel_cpu9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_cpu9Layout.setVerticalGroup(
            panel_cpu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpu9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_cpu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_respuesta2)
                    .addComponent(tiempo_respuesta2))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        tabla_terminados2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_terminados2.setCellSelectionEnabled(true);
        jScrollPane9.setViewportView(tabla_terminados2);

        label_cola2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        label_cola2.setForeground(new java.awt.Color(0, 153, 153));
        label_cola2.setText("Cola listos");

        label_bloqueados6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        label_bloqueados6.setForeground(new java.awt.Color(204, 0, 51));
        label_bloqueados6.setText("Terminados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel_cpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel_cpu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(label_cola, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_bloqueados4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_leyenda, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_ejecutando)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label_cola_listos))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(panel_cpu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(contador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel_cpu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(panel_cpu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_cola1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(panel_cpu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addComponent(panel_cpu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label_bloqueados5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panel_cpu8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addComponent(label_cola2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(panel_cpu9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label_bloqueados6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(60, 60, 60)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_cpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_cpu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_cpu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contador)
                                    .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stop))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label_bloqueados4)
                                .addComponent(label_leyenda)
                                .addComponent(label_ejecutando)
                                .addComponent(label_cola_listos))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_cola))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_cpu4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_cpu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_cola1)
                            .addComponent(label_bloqueados5)))
                    .addComponent(panel_cpu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel_cpu9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel_cpu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel_cpu7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_cola2)
                            .addComponent(label_bloqueados6))))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Funcion principal
    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
   //Creacion de procesos 
  if (ejecucion == null) {
    tiempos_procesos.add(0); //Omite el primer tiempo en la grafica
    boolean cantidadIngresada = false; // Bandera para verificar si ya se ingresó la cantidad de procesos
  
    do { //Cantidad de procesos 
            if (!cantidadIngresada) { // Solicitar la cantidad de procesos al usuario
                String cantidadText = JOptionPane.showInputDialog(null, "Ingrese la cantidad de procesos:");
                if (cantidadText != null && !cantidadText.isEmpty()) {
                    try {
                        int cantidad = Integer.parseInt(cantidadText) + 1; //Cantidad de procesos + 1 al graficarse

                        // Crear los procesos con IDs distintos y asignar tiempos
                        for (int i = 1; i < cantidad; i++) {
                            Process proceso = new Process(ID);
                            ID++;
                            procesos.add(proceso);
                            Collections.sort(procesos); //Ordena los tiempos de los procesos 
//                            selectSORT(procesos);
                        }

                        // Mostrar los procesos creados
                        StringBuilder sb = new StringBuilder("Procesos creados y sus tiempos:\n");
                        for (Process proceso : procesos){
                                sb.append("ID: ").append(proceso.getProcessId()).append(" | Time: ").append(proceso.getTime()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());

                        cantidadIngresada = true; // Marcar que la cantidad fue ingresada correctamente

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número válido para la cantidad de procesos.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    break; // Si se cancela el diálogo, salir del bucle
                }
            } else {
                break; // Si ya se ingresó la cantidad de procesos, salir del bucle
            }
        } while (true);
    //contadorGlobal();  //Iniciaa el contador global 
   //Divide los procesos en sus respectivos estados "Ejecucion","Cola Listos","Nuevos"
            //Procesos maximos en la cola de listos = 5
             int count = 0; //Contador de procesos en el ciclo
                 for (Process proceso : procesos) { //Recorre los procesos 
                      if(count <= 4){ //Valida que solo 5 procesos inicien en la cola de listos
                          proceso.setTimeArrival(0); //Asigna el tiempo de llegada
                          cola_listos.offer(proceso); //Añade a la cola de listos un maximo de 5 procesos 
                       }
                      count++;
                 }
            //Elimina los procesos repetidos en "nuevos" que han sido añadidos a listos 
             for(int j=0; j < cola_listos.size();j++){
                  procesos.remove(0); 
             }
 //Estados de procesos---------------------------------
     //Asigna el proceso en estado "Ejecucion" 
     ejecucion = cola_listos.remove(); 
     int llegada = ejecucion.getTimeArrival();
     ejecucion.setResponseTime(0); //Tiempo de respuesta del proceso (contador global - time arrival)
     //System.out.println(ejecucion.getProcessId());
     tiempos_procesos.add(ejecucion.getTime()); //Añade el tiempo del proceso en ejecucion a la grafica 
     //Añade los tiempos de los procesos en "Cola de listos" a la grafica 
     for (Process proceso : cola_listos) {
         //System.out.println(proceso.getProcessId());
         tiempos_procesos.add(proceso.getTime());
     }  
     //Añade los tiempos de los procesos en "Nuevos" a la grafica 
     for (Process proceso : procesos){
         //System.out.println(proceso.getProcessId());
         tiempos_procesos.add(proceso.getTime());
     }
    actualizarTiempos();
    actualizarGrafica();

  //------------------------------------------------------------------------
       //System.out.println("El valor es " + procesos[0].getProcessId());
        //conjunto2 puede representar el "tiempo" de cada proceso
        //int [] conjunto2 = {5,7,4,3,7,9,2,1,6,8,4,6,7,8,9,5,3,2,4,5,6,7,8,9,5,3};
        //int [] conjunto2 = {7,5,4,3,2,8};
        //g.crearHistograma(tiempos_procesos,panel,Color.white);
        //------------------------------------------------------------------------
        //Inicializacion de prueba tablas
           //Tabla de procesos bloqueados
           // Columnas de la tabla
           tablaBloqueados.setColumnIdentifiers(new Object[]{"ID", "Tiempo-Proceso"});
           // Modelo de la tabla y filas 
           //tabla_bloqueados.setModel(tablaBloqueados);
           for (int i = 0; i < 4; i++) {
           tablaCola.addRow(new Object[]{5+i, 3+i});} 
            //procesosBloqueados(13,0,7); //ID,fila,TT_actual = 0 (tiempo transcurrido bloqueado)
            //procesosBloqueados(20,1,7); 
            //procesosBloqueados(20,1,7); 
            
           
           //Tabla de cola de procesos (Ej maxima cantidad de procesos en: bloqueados, ejecución y cola listos = 5) 
           tablaCola.setColumnIdentifiers(new Object[]{"ID", "Transcurrido"});
           tabla_cola.setModel(tablaCola);
           for (int i = 0; i < 4; i++) {
           tablaCola.addRow(new Object[]{5+i, 3+i});}
           
           //Tabla de procesos terminados
           tablaTerminados.setColumnIdentifiers(new Object[]{"ID", "Finalización","Retorno","Espera"});
           tabla_terminados.setModel(tablaTerminados);
           for (int i = 0; i < 3; i++) {
           tablaTerminados.addRow(new Object[]{5+i, 3+i,4+i});}
        
        //Metodos eliminar y modificar <--
         // Elimina la fila del índice en la tabla 
           //tablaBloqueados.removeRow(1);
           // Modifica un valor en la tabla --> Args (nuevoValor,fila,columna) Ej: (11,0,1) = 11, fila 1, columna 2
           //tablaBloqueados.setValueAt(11, 0, 1); 
        //----------------------------------------------------------------------
     //Inicializacion de prueba paneles
          //Panel CPU
          tiempo_cpu.setText(String.valueOf(0));
          id_cpu.setText(String.valueOf(1));
          ocupado_cpu.setText(String.valueOf(0));
          //Tiempo llegada
          tiempo_llegada.setText(String.valueOf(0));
          //Tiempo respuesta
          tiempo_respuesta.setText(String.valueOf(0));
          //Tiempo espera
          //tiempo_espera.setText(String.valueOf(0));
          tiemposProcesos();
  }else{
  // Mostrar un JOptionPane informando al usuario que no hay procesos en ejecución
        JOptionPane.showMessageDialog(this, "El programa ya ha sido iniciado.", "Error", JOptionPane.ERROR_MESSAGE);
  }
    }//GEN-LAST:event_iniciarActionPerformed

//Funciones de interrupciones
    
    //--------------------------------------------------------------
    private void pausar() { //Interrupcion de Pausa
        ejecutando = false; 
        bloqueados = false;
        tiempos = false;
        //contadorThread.interrupt(); // Interrumpir contador
        //bloqueadosThread.interrupt(); //Interrumpir bloqueados
        tiemposThread.interrupt(); //Interrumpir tiempos de procesos en grafica
   }
   
    private void continuar() { //Interrupcion de Continuar o Ejecutar 
       ejecutando = true; 
       bloqueados = true;
       tiempos = true;
     tiemposProcesos(); //Vuelve a inicar el proceso en ejecucion en el tiempo donde se quedó
    }
    
    private void nuevo() { //Interrupcion de nuevo proceso
       // Simulación: Agregar un nuevo proceso a la lista de procesos nuevos o a la cola
        if(!tiempos && !ejecutando && !bloqueados){
          continuar();
        }
        Process nuevoProceso = new Process(ID);
        ID++;
        if(cola_listos.size() < 4){ //Si cabe el proceso en la cola de listos 
            nuevoProceso.setTimeArrival(contador_global); //Asigna el tiempo de llegada
            cola_listos.add(nuevoProceso);// agrega el nuevo proceso a la cola
        }else{ //Sino, se añade a nuevos  
            procesos.add(nuevoProceso);// agrega el nuevo proceso a la lista de nuevos.
        }
        Collections.sort(procesos); //Ordena los tiempos de los procesos nuevos
        //System.out.println(nuevoProceso.getProcessId());
        tiempos_procesos.add(nuevoProceso.getTime()); //Añade el timepo del proceso a la grafica 
        id_cpu.setText(String.valueOf(ID));
        actualizarTiempos();
        actualizarGrafica();
    }
     
   //---------------------------------------------------------------
   private void actualizarGrafica() { //Funcion/Hilo de datos en Grafica
   
                // Llamar al método crearHistograma con tiempos_procesos
                g.crearHistograma(tiempos_procesos.stream().mapToInt(Integer::intValue).toArray(), panel, Color.white);
                for (int i = 0; i < tiempos_procesos.size(); i++) {
                    // Editar el color de un proceso en la grafica
                    if (i == 0) { // Color del proceso en ejecución
                        g.editarColorProceso(i, Color.red);
                    } else if (i > 0 && i < 5) { // Color de procesos en cola
                        g.editarColorProceso(i, Color.CYAN);
                    } else if (i >= 5) { // Color de procesos nuevos
                        g.editarColorProceso(i, new Color(139, 69, 19));
                    }
                    if(color_bloqueado > 0){
                       g.editarColorProceso(4, Color.green);
                       if(color_bloqueado >= 2){
                            g.editarColorProceso(3, Color.green);}
                       if(color_bloqueado >= 3){
                            g.editarColorProceso(2, Color.green);}
                       if(color_bloqueado >= 4){
                            g.editarColorProceso(1, Color.green);}
                       if(color_bloqueado >= 5){
                            g.editarColorProceso(0, Color.green);}
                    }
                }
                  //Tabla de "Terminados" en la interfaz
                if(tablaTerminados.getRowCount()>=0){//Evitar fallas por las filas
                    for(int i=tablaTerminados.getRowCount()-1;i>=0;i--)
                        tablaTerminados.removeRow(i);//Vaciara todas las filas de tabla para eliminar datos repetidos
                }
                //System.out.println("Terminados actuales");
                for(Process terminado: terminados){//Insertara toda la lista de terminados a la tabla
                      //System.out.println(terminado.getProcessId());
                      tablaTerminados.addRow(new Object[]{terminado.getProcessId(),terminado.getCompletionTime(),terminado.getReturnTime(),terminado.getWaitTime()});   
                }  
                 if(tablaCola.getRowCount()>=0){//Evitar fallas por las filas
                    for(int i=tablaCola.getRowCount()-1;i>=0;i--)
                        tablaCola.removeRow(i);//Vaciara todas las filas de tabla para eliminar datos repetidos
                }
                //System.out.println("Terminados actuales");
                for(Process cola: cola_listos){//Insertara toda la cola de listos a la tabla
                      //System.out.println(terminado.getProcessId());
                      tablaCola.addRow(new Object[]{cola.getProcessId(),cola.getTimeRun()});  
                      //recorrerProcesos();
                } 
         
}
  
  private void tiemposProcesos() { //Funcion/Hilo Tiempos/procesos
    tiemposThread = new Thread(() -> {
        try {
            boolean ejecutado = false; // Variable para controlar si ya se ejecutó el bloque de código
            //int timer = time;
            while (tiempos) { // Bucle que se ejecuta mientras tiempos sea verdadero
                // Verificar si ejecucion.getTime() es igual a contador_global
                /*
                if(quantum_time < 1){ //Si el Quantum llega a 0
                   //ejecucion.setTimeRun(ejecucion.getTime()-ejecucion.getTimeRun());
                   cola_listos.offer(ejecucion); //Regresa el proceso a la cola 
     
                    //ordenarCola(); 
                   
                   ejecucion = cola_listos.remove();
                   quantum_time = Quantum; //Reincia el quantum
                    
                   actualizarTiempos();
                   //recorrerProcesos(); //Recorre de nuevo los procesos actuales  
                   //ejecutado = true; // Marcar como ejecutado
                   //timer = 0;
                }*/
                if (ejecucion.getTimeRun() >= ejecucion.getTime() && !ejecutado) { //Compara si el TT ha alcanzado su tiempo de ejecución
                    ejecucion.setCompletionTime(contador_global); //Añade el tiempo de finalizacion
                    int finalizacion = ejecucion.getCompletionTime();
                    int llegada = ejecucion.getTimeArrival();
                    ejecucion.setReturnTime(finalizacion-llegada); //Añade el tiempo de retorno 
                    int retorno = ejecucion.getReturnTime();
                    ejecucion.setWaitTime(retorno-ejecucion.getTimeRun());
                    //tiempo_espera.setText(String.valueOf(ejecucion.getWaitTime()));
                    if(ejecucion.getTime()!=1){ //Al estar el "if" al iniciar un proceso nuevo el "ultimo" en la tabla se elimina
                    terminados.add(ejecucion); // Sino, añade el nuevo terminado
                    //Collections.sort(procesos);
                    }
                    ejecucion.setTime(1);
                    
                    System.out.print("Terminado normal ");
                    System.out.println(ejecucion.getProcessId());
                    //ejecucion.setTime(1); // Limpiar el tiempo del proceso en ejecución.
                    //System.out.println(timer)
                    recorrerProcesos();
                    ejecutado = true; // Marcar como ejecutado
                    
                    //quantum_time = Quantum; //Reinicia el quantum
                   
                } else if (ejecucion.getTime() != ejecucion.getTimeRun()) { 
                    ejecutado = false; // Reiniciar el indicador si el tiempo ha cambiado
                }
                if(ejecucion.getTime() == 1){
                    for (Process terminado : terminados) {
                            if (ejecucion.getProcessId() == terminado.getProcessId()) {
                                // Eliminar el proceso en ejecución de la lista de terminados
                                terminados.remove(terminado);
                                tiempo_cpu.setText(String.valueOf(0));
                                id_cpu.setText(String.valueOf(0));
                                ocupado_cpu.setText(String.valueOf(0));
                                //Tiempo llegada
                                tiempo_llegada.setText(String.valueOf(0));
                                //Tiempo respuesta
                                tiempo_respuesta.setText(String.valueOf(0));
                                //System.out.println(ejecucion.getTime());
                                //recorrerProcesos();
                                ejecutado = true;
                                //recorrerProcesos();
                                //actualizarGrafica();
                                pausar(); //Detiene el tiempo de ejecucion
                                
                                
                                break;
                      }}
                }
                  
                 /*
                if (!id_cpu.getText().equals("0")) { // Se mantiene a la espera de procesos nuevos si no hay
                    //timer = 0;
                    if(g.colorProceso(0,Color.GREEN)){ // Compara si el ejecutado esta bloqueado
                        tiemposThread.interrupt();
                    }
                    
                }*/
                // Agregar alguna pausa para evitar un bucle infinito sin descanso
                Thread.sleep(1000); // Por ejemplo, esperar 1000 milisegundos (1 segundo)
                if(terminado){ // Si se termina un proceso, el "timer" se reinicia 
                    //timer=0;
                    terminado = false;
                }
                /*
                if(ejecucion.getTime() != 1){ //En caso de que no haya un proceso en ejecucion
                    if(g.colorProceso(0,Color.GREEN)){ // Compara si el ejecutado esta bloqueado
                        tiemposThread.interrupt();
                    }
                }*/
                //Actualizar el Panel del proceso en ejecucion
                if(tablaBloqueados.getRowCount()>0 && cola_listos.size() == 0){
                        System.out.println("Bloqueado en tabla");
                        int rowCount = tablaBloqueados.getRowCount();
                        // Recorrer cada fila de la tabla
                        for (int i = 0; i < rowCount; i++) {
                            // Obtener los valores de la fila actual
                            int id = (int) tablaBloqueados.getValueAt(i, 0);
                            int tiempoProceso = (int) tablaBloqueados.getValueAt(i, 1);

                            // Crear un nuevo objeto Process con los valores de la fila
                            Process newProcess = new Process(id);
                            newProcess.setTime(tiempoProceso);

                            // Agregar el proceso a la lista de procesos
                            boolean repetido = false;
                             for (Process cola : cola_listos) {
                                if (newProcess.getProcessId() == cola.getProcessId()) {
                                    // Eliminar el proceso en ejecución de la lista de terminados
                                     repetido = true;
                                     break;
                             }
                             if(repetido){procesos.add(newProcess);}
                        }}
                }
                
                id_cpu.setText(String.valueOf(ejecucion.getProcessId()));
                ocupado_cpu.setText(String.valueOf(ejecucion.getTimeRun()+1));
                tiempo_cpu.setText(String.valueOf(ejecucion.getTime()));
                tiempo_llegada.setText(String.valueOf(ejecucion.getTimeArrival()));
                tiempo_respuesta.setText(String.valueOf(ejecucion.getResponseTime()));
                tiempos_procesos.set(1, ejecucion.getTimeRun()+1); // Actualizar el tiempo del proceso en ejecución
                actualizarGrafica(); // Actualiza la barra de "ejecucion" de acuerdo a su tiempo 
                //timer++;
                ejecucion.AddTimeRun(); //Suma 1 al TT (Equivalente a ejecucin.TimeRun++)
                contador_global++;
                wait_timer = ejecucion.getTimeRun(); //Guarda la referencia del tiempo del proceso en ejecucion atual
                //actual_timer = timer; //Guarda la referencia del tiempo en proceso en ejecucion
                quantum_time--; 
                //quantum_label.setText(String.valueOf(quantum_time));
                ejecutado = false;
                contador.setText(String.valueOf(contador_global));
                
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });
    // Inicia el hilo
    tiemposThread.start();
}
  private void actualizarTiempos() { 
     tiempos_procesos.clear(); //Limpia los tiempos de los procesos anteriores 
      tiempos_procesos.add(0); //Omite el primer tiempo en la grafica
      tiempos_procesos.add(ejecucion.getTime()); //Añade el tiempo del proceso en ejecucion a la grafica 
            //Añade los tiempos de los procesos en "Cola de listos" a la grafica 
            //System.out.println("cola");
      if(cola_listos.size() != 0){
      for (Process proceso : cola_listos) {
            //System.out.println(proceso.getProcessId());
            tiempos_procesos.add(proceso.getTime());
     }}
     //System.out.println("nuevos");
     //Añade los tiempos de los procesos en "Nuevos" a la grafica 
     if(procesos.size() != 0){
        for (Process proceso : procesos){
            //System.out.println(proceso.getProcessId());
            tiempos_procesos.add(proceso.getTime());
     }}
     //ordenarCola();
  }
    private void recorrerProcesos() { //Recorre la cola de procesos
    //Asigna el proceso en estado "Ejecucion" 
     if(cola_listos.size() != 0){ //Si hay procesos en cola 
         ejecucion = cola_listos.remove();
        //ordenarCola ();
     }else{ //Si ya no hay procesos en cola
            tiempos_procesos.clear();
            actualizarGrafica();
            if(procesos.size()!=0){
                    //pausar(); tiemposThread.interrupt(); tiempos_procesos.clear(); actualizarGrafica();
                        int count = 0; //Contador de procesos en el ciclo
                            for (Process proceso : procesos) { //Recorre los procesos 
                                 if(count <= 4){ //Valida que solo 5 procesos inicien en la cola de listos
                                     cola_listos.offer(proceso); //Añade a la cola de listos un maximo de 5 procesos 
                                     //ordenarCola();
                                  }
                                 count++;
                            }
                       //Elimina los procesos repetidos en "nuevos" que han sido añadidos a listos 
                        for(int j=0; j < cola_listos.size();j++){
                             procesos.remove(0); 
                        }
            //Estados de procesos---------------------------------
                //Asigna el proceso en estado "Ejecucion" 
                ejecucion = cola_listos.remove(); 
                //System.out.println(ejecucion.getProcessId());
                tiempos_procesos.add(ejecucion.getTime()); //Añade el tiempo del proceso en ejecucion a la grafica 
                //Añade los tiempos de los procesos en "Cola de listos" a la grafica 
                for (Process proceso : cola_listos) {
                    //System.out.println(proceso.getProcessId());
                    tiempos_procesos.add(proceso.getTime());
                }  
                //Añade los tiempos de los procesos en "Nuevos" a la grafica 
                for (Process proceso : procesos){
                    //System.out.println(proceso.getProcessId());
                    tiempos_procesos.add(proceso.getTime());
                }
                //ordenarCola();
                }
     } 
      //Interrumpir bloqueados}
     //System.out.println(ejecucion.getProcessId());
      //Añade un proceso de "nuevos" a la "cola listos"
      int llegada = ejecucion.getTimeArrival();
      
      ejecucion.setResponseTime(contador_global-llegada); //Tiempo de respuesta del proceso 
      //System.out.println("LLegada menos contador ");
      //System.out.println(ejecucion.getResponseTime());
      //System.out.println(contador_global);
       if(procesos.size() != 0){
           Process proceso = procesos.remove(0);
           proceso.setTimeArrival(contador_global); //Asigna el tiempo de llegada
           cola_listos.offer(proceso);
       }
       //System.out.println(ejecucion.getProcessId());
      tiempos_procesos.clear(); //Limpia los tiempos de los procesos anteriores 
      tiempos_procesos.add(0); //Omite el primer tiempo en la grafica
      tiempos_procesos.add(ejecucion.getTime()); //Añade el tiempo del proceso en ejecucion a la grafica 
            //Añade los tiempos de los procesos en "Cola de listos" a la grafica 
            //System.out.println("cola");
      if(cola_listos.size() != 0){
      for (Process proceso : cola_listos) {
            //System.out.println(proceso.getProcessId());
            tiempos_procesos.add(proceso.getTime());
     }}
     //System.out.println("nuevos");
     //Añade los tiempos de los procesos en "Nuevos" a la grafica 
     if(procesos.size() != 0){
        for (Process proceso : procesos){
            //System.out.println(proceso.getProcessId());
            tiempos_procesos.add(proceso.getTime());
     }}
     //ordenarCola();
     //actualizarGrafica();
       
   }
    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
       if (ejecucion != null) {
            pausar();
       }else{
         // Mostrar un JOptionPane informando al usuario que no hay procesos en ejecución
        JOptionPane.showMessageDialog(this, "No hay procesos en ejecución por detener.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_stopActionPerformed

    private void ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarActionPerformed
        if (ejecucion != null) {
             if(!ejecutando){
                continuar(); 
             }else{
             // Mostrar un JOptionPane informando al usuario sobre el error
                     JOptionPane.showMessageDialog(this, "El proceso se encuentra en ejecución.", "Error", JOptionPane.ERROR_MESSAGE);
             }
        }else{
         // Mostrar un JOptionPane informando al usuario que no hay procesos en ejecución
        JOptionPane.showMessageDialog(this, "No hay procesos en ejecución por iniciar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ejecutarActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contador;
    private javax.swing.JList<String> cpu;
    private javax.swing.JButton ejecutar;
    private javax.swing.JLabel id_cpu;
    private javax.swing.JLabel id_cpu1;
    private javax.swing.JLabel id_cpu2;
    private javax.swing.JLabel id_cpu3;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_bloqueados4;
    private javax.swing.JLabel label_bloqueados5;
    private javax.swing.JLabel label_bloqueados6;
    private javax.swing.JLabel label_cola;
    private javax.swing.JLabel label_cola1;
    private javax.swing.JLabel label_cola2;
    private javax.swing.JLabel label_cola_listos;
    private javax.swing.JLabel label_contador;
    private javax.swing.JLabel label_ejecutando;
    private javax.swing.JLabel label_id1;
    private javax.swing.JLabel label_id2;
    private javax.swing.JLabel label_id3;
    private javax.swing.JLabel label_id4;
    private javax.swing.JLabel label_leyenda;
    private javax.swing.JLabel label_llegada;
    private javax.swing.JLabel label_llegada1;
    private javax.swing.JLabel label_llegada2;
    private javax.swing.JLabel label_ocupado;
    private javax.swing.JLabel label_ocupado1;
    private javax.swing.JLabel label_ocupado2;
    private javax.swing.JLabel label_ocupado3;
    private javax.swing.JLabel label_respuesta;
    private javax.swing.JLabel label_respuesta1;
    private javax.swing.JLabel label_respuesta2;
    private javax.swing.JLabel label_tiempo;
    private javax.swing.JLabel label_tiempo1;
    private javax.swing.JLabel label_tiempo2;
    private javax.swing.JLabel label_tiempo3;
    private javax.swing.JLabel ocupado_cpu;
    private javax.swing.JLabel ocupado_cpu1;
    private javax.swing.JLabel ocupado_cpu2;
    private javax.swing.JLabel ocupado_cpu3;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel_cpu;
    private javax.swing.JPanel panel_cpu1;
    private javax.swing.JPanel panel_cpu2;
    private javax.swing.JPanel panel_cpu3;
    private javax.swing.JPanel panel_cpu4;
    private javax.swing.JPanel panel_cpu5;
    private javax.swing.JPanel panel_cpu6;
    private javax.swing.JPanel panel_cpu7;
    private javax.swing.JPanel panel_cpu8;
    private javax.swing.JPanel panel_cpu9;
    private javax.swing.JButton stop;
    private javax.swing.JTable tabla_cola;
    private javax.swing.JTable tabla_cola1;
    private javax.swing.JTable tabla_cola2;
    private javax.swing.JTable tabla_terminados;
    private javax.swing.JTable tabla_terminados1;
    private javax.swing.JTable tabla_terminados2;
    private javax.swing.JLabel tiempo_cpu;
    private javax.swing.JLabel tiempo_cpu1;
    private javax.swing.JLabel tiempo_cpu2;
    private javax.swing.JLabel tiempo_cpu3;
    private javax.swing.JLabel tiempo_llegada;
    private javax.swing.JLabel tiempo_llegada1;
    private javax.swing.JLabel tiempo_llegada2;
    private javax.swing.JLabel tiempo_respuesta;
    private javax.swing.JLabel tiempo_respuesta1;
    private javax.swing.JLabel tiempo_respuesta2;
    // End of variables declaration//GEN-END:variables
}
