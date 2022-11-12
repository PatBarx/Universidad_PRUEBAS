package Vistas;

import Data.AlumnoData;
import Data.CursadaData;
import Data.MateriaData;
import Entidades.Alumno;
import Entidades.Cursada;
import Entidades.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Pat
 */
public class Fri_inscripcion extends javax.swing.JInternalFrame {
    
    private CursadaData cDat;
    private MateriaData mDat;
    private AlumnoData aDat;
    private DefaultTableModel modelTab;
    
    public Fri_inscripcion() {
        initComponents();
        cDat = new CursadaData();
        mDat = new MateriaData();
        aDat = new AlumnoData();
        ArrayList <Alumno> arrlAlumnos;
        arrlAlumnos = aDat.listarAlumnos();
        for (Alumno arrlAl : arrlAlumnos) {
            cBx_alumno.addItem(arrlAl);
        }
        modelTab = new DefaultTableModel(new String[]{"CODIGO","MATERIA", "AÑO"}, 0);
        tbl_insMaterias.setModel(modelTab);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lbl_alumno = new javax.swing.JLabel();
        lbl_listaMaterias = new javax.swing.JLabel();
        btn_buscar1 = new javax.swing.JButton();
        btn_inscribir = new javax.swing.JButton();
        btn_anularInscr = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        cBx_alumno = new javax.swing.JComboBox<>();
        btn_buscar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_insMaterias = new javax.swing.JTable();
        jRadB_inscriptas = new javax.swing.JRadioButton();
        jRadB_NOinscriptas = new javax.swing.JRadioButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("*  INSCRIPCIONES  *");

        lbl_alumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_alumno.setText("Alumno: ");

        lbl_listaMaterias.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lbl_listaMaterias.setText("Listado de Materias:");

        btn_buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnAlumnos uniG10-1.png"))); // NOI18N
        btn_buscar1.setBorderPainted(false);
        btn_buscar1.setContentAreaFilled(false);
        btn_buscar1.setDefaultCapable(false);
        btn_buscar1.setFocusPainted(false);
        btn_buscar1.setFocusable(false);
        btn_buscar1.setRequestFocusEnabled(false);

        btn_inscribir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_inscribir.setText("INSCRIBIR");
        btn_inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inscribirActionPerformed(evt);
            }
        });

        btn_anularInscr.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_anularInscr.setText("ANULAR");
        btn_anularInscr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anularInscrActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        cBx_alumno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cBx_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBx_alumnoActionPerformed(evt);
            }
        });

        btn_buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnMaterias uniG10-1.png"))); // NOI18N
        btn_buscar2.setBorderPainted(false);
        btn_buscar2.setContentAreaFilled(false);
        btn_buscar2.setDefaultCapable(false);
        btn_buscar2.setFocusPainted(false);
        btn_buscar2.setFocusable(false);
        btn_buscar2.setRequestFocusEnabled(false);

        tbl_insMaterias.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tbl_insMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "MATERIA", "AÑO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_insMaterias);

        buttonGroup1.add(jRadB_inscriptas);
        jRadB_inscriptas.setText("INSCRIPTAS");
        jRadB_inscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadB_inscriptasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadB_NOinscriptas);
        jRadB_NOinscriptas.setText("NO INSCRIPTAS");
        jRadB_NOinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadB_NOinscriptasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btn_inscribir)
                .addGap(18, 18, 18)
                .addComponent(btn_anularInscr)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadB_inscriptas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadB_NOinscriptas))
                                    .addComponent(cBx_alumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lbl_listaMaterias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_alumno)
                                .addGap(104, 104, 104)))
                        .addComponent(btn_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_anularInscr, btn_inscribir, btn_salir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btn_buscar2)
                            .addComponent(btn_buscar1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lbl_alumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cBx_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_listaMaterias)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadB_inscriptas)
                    .addComponent(jRadB_NOinscriptas))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_salir)
                    .addComponent(btn_anularInscr)
                    .addComponent(btn_inscribir))
                .addGap(26, 26, 26))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_anularInscr, btn_inscribir, btn_salir});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadB_inscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadB_inscriptasActionPerformed
        //Mostrar Inscriptas x Alumno y deSelect No inscriptas
        modelTab.setNumRows(0);
        btn_inscribir.setEnabled(false);
        btn_anularInscr.setEnabled(true);
        ArrayList<Materia> arrlMat = cDat.inscMateriaXalu((Alumno)cBx_alumno.getSelectedItem());
        for (Materia materia : arrlMat) {
            modelTab.addRow(new Object[]{materia.getIdMateria(),materia.getNombre(),materia.getAnio()});
        }
        
    }//GEN-LAST:event_jRadB_inscriptasActionPerformed

    private void jRadB_NOinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadB_NOinscriptasActionPerformed
        //Mostrar NO Inscriptas x Alumno y deSelect Inscriptas
        modelTab.setNumRows(0);
        btn_inscribir.setEnabled(true);
        btn_anularInscr.setEnabled(false);
        ArrayList<Materia> arrlMat = cDat.noInscMateriaXalu((Alumno)cBx_alumno.getSelectedItem());
        for (Materia materia : arrlMat) {
            modelTab.addRow(new Object[]{materia.getIdMateria(),materia.getNombre(),materia.getAnio()});            
        }
    }//GEN-LAST:event_jRadB_NOinscriptasActionPerformed

    private void cBx_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBx_alumnoActionPerformed
        //Limpiar Tabla cuando cambio de alumno
        if(jRadB_inscriptas.isSelected()){
            jRadB_inscriptasActionPerformed(evt);
        } else if (jRadB_NOinscriptas.isSelected()){
            jRadB_NOinscriptasActionPerformed(evt);
        }
    }//GEN-LAST:event_cBx_alumnoActionPerformed

    private void btn_inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inscribirActionPerformed
        // GUARDAR CURSADA 
        try {
            Cursada cur = new Cursada();
            cur.setAl((Alumno)cBx_alumno.getSelectedItem());
            cur.setMa(mDat.buscarMateria((Integer)(modelTab.getValueAt(tbl_insMaterias.getSelectedRow(), 0))));
            cur.setNota(0);
            cDat.guardarCursada(cur);
            jRadB_NOinscriptasActionPerformed(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Inscribir ERROR: Seleccione una fila\n" + e);
        }
        
    }//GEN-LAST:event_btn_inscribirActionPerformed

    private void btn_anularInscrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anularInscrActionPerformed
        // BORRAR CURSADA 
        try {
            Cursada cur = cDat.buscarCursada((((Alumno)cBx_alumno.getSelectedItem()).getIdAlumno()) ,(Integer)modelTab.getValueAt(tbl_insMaterias.getSelectedRow(),0));
            cDat.borrarCursada(cur.getIdCursada());        
            jRadB_inscriptasActionPerformed(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Desinscribir ERROR: Seleccione una fila\n" + e);
        }
    }//GEN-LAST:event_btn_anularInscrActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // SALIR
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anularInscr;
    private javax.swing.JButton btn_buscar1;
    private javax.swing.JButton btn_buscar2;
    private javax.swing.JButton btn_inscribir;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Alumno> cBx_alumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadB_NOinscriptas;
    private javax.swing.JRadioButton jRadB_inscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_alumno;
    private javax.swing.JLabel lbl_listaMaterias;
    private javax.swing.JTable tbl_insMaterias;
    // End of variables declaration//GEN-END:variables
}
