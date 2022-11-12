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
public class Fri_notas extends javax.swing.JInternalFrame {
    
    private CursadaData cDat;
    private MateriaData mDat;
    private AlumnoData aDat;
    private DefaultTableModel modelTab;

    public Fri_notas() {
         modelTab = new DefaultTableModel(new String[]{"CODIGO","MATERIA", "NOTA"}, 0);
        initComponents();
        cDat = new CursadaData();
        mDat = new MateriaData();
        aDat = new AlumnoData();
        ArrayList <Alumno> arrlAlumnos;
        arrlAlumnos = aDat.listarAlumnos();
        for (Alumno arrlAl : arrlAlumnos) {
            cBx_alumno.addItem(arrlAl);
        }
       
        tbl_insMaterias.setModel(modelTab);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_alumno = new javax.swing.JLabel();
        lbl_listaMaterias = new javax.swing.JLabel();
        btn_buscar1 = new javax.swing.JButton();
        btn_actualiz = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        cBx_alumno = new javax.swing.JComboBox<>();
        btn_buscar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_insMaterias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("*  CALIFICACIONES  *");

        lbl_alumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_alumno.setText("Alumno: ");

        lbl_listaMaterias.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lbl_listaMaterias.setText("Modificacion de Notas:");

        btn_buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnMaterias uniG10-1.png"))); // NOI18N
        btn_buscar1.setBorderPainted(false);
        btn_buscar1.setContentAreaFilled(false);
        btn_buscar1.setDefaultCapable(false);
        btn_buscar1.setFocusPainted(false);
        btn_buscar1.setFocusable(false);
        btn_buscar1.setRequestFocusEnabled(false);
        btn_buscar1.setVerifyInputWhenFocusTarget(false);

        btn_actualiz.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_actualiz.setText("ACTUALIZAR");
        btn_actualiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizActionPerformed(evt);
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

        btn_buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnAlumnos uniG10-1.png"))); // NOI18N
        btn_buscar2.setBorderPainted(false);
        btn_buscar2.setContentAreaFilled(false);
        btn_buscar2.setDefaultCapable(false);
        btn_buscar2.setFocusPainted(false);
        btn_buscar2.setFocusable(false);
        btn_buscar2.setRequestFocusEnabled(false);
        btn_buscar2.setVerifyInputWhenFocusTarget(false);

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
                "ID", "MATERIA", "NOTA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_insMaterias);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("(*) Dar ENTER al campo de NOTA antes de actualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cBx_alumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_alumno)
                                .addGap(104, 104, 104)))
                        .addComponent(btn_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btn_actualiz)
                        .addGap(158, 158, 158)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lbl_listaMaterias))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_actualiz, btn_salir});

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
                        .addGap(83, 83, 83)
                        .addComponent(lbl_alumno)
                        .addGap(18, 18, 18)
                        .addComponent(cBx_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbl_listaMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_salir)
                    .addComponent(btn_actualiz))
                .addGap(26, 26, 26))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_actualiz, btn_salir});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBx_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBx_alumnoActionPerformed
        //Cambiar la lista de MAterias segun seleccion de alumno
        
            modelTab.setNumRows(0); //limpia la tabla
            Alumno alu = ((Alumno)cBx_alumno.getSelectedItem()); //Crear Alumno con obj del CBox
            ArrayList<Materia> arrlMat = cDat.inscMateriaXalu(alu) ; //listar Materias en arrayL nuevo
            for (Materia materia : arrlMat) { //recorrer lista de Materias y setear cada fila con un objeto.
                Cursada cur = cDat.buscarCursada(alu.getIdAlumno(), materia.getIdMateria());//crear cursada para obtener ID
                modelTab.addRow(new Object[]{cur.getMa().getIdMateria(), cur.getMa().getNombre(), cur.getNota()});                        
            }     
    }//GEN-LAST:event_cBx_alumnoActionPerformed

    private void btn_actualizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizActionPerformed
        //actualizarNota(int idAlumno, int idMateria, double nota)
        try {
            Alumno alu = ((Alumno) cBx_alumno.getSelectedItem());
            Materia mat = (mDat.buscarMateria((Integer) (modelTab.getValueAt(tbl_insMaterias.getSelectedRow(), 0))));
            cDat.actualizarNota(alu.getIdAlumno(), mat.getIdMateria(), (Double.parseDouble(modelTab.getValueAt(tbl_insMaterias.getSelectedRow(), 2).toString().trim())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Calificaciones ERROR: Ingrese una nota válida\n" + e);
        }
    }//GEN-LAST:event_btn_actualizActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // SALIR
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualiz;
    private javax.swing.JButton btn_buscar1;
    private javax.swing.JButton btn_buscar2;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<Alumno> cBx_alumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_alumno;
    private javax.swing.JLabel lbl_listaMaterias;
    private javax.swing.JTable tbl_insMaterias;
    // End of variables declaration//GEN-END:variables
}
