package Vistas;

import Data.AlumnoData;
import Data.CursadaData;
import Data.MateriaData;
import Entidades.Alumno;
import Entidades.Cursada;
import Entidades.Materia;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * @author Pat
 */
public class Fri_aluXmateria extends javax.swing.JInternalFrame {
        
    private CursadaData cDat;
    private MateriaData mDat;
    private AlumnoData aDat;
    private DefaultTableModel modelTab;
    
    public Fri_aluXmateria() {
        modelTab = new DefaultTableModel(new String[]{"LEGAJO","NOMBRE", "NOTA"}, 0);
        initComponents();
        cDat = new CursadaData();
        mDat = new MateriaData();
        aDat = new AlumnoData();
        ArrayList <Materia> arrlMaterias;
        arrlMaterias = mDat.listarMateria();
        for (Materia arrlMat : arrlMaterias) {
            cBx_materia.addItem(arrlMat);
        }
       
        tbl_insMaterias.setModel(modelTab);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_materia = new javax.swing.JLabel();
        lbl_alumnos = new javax.swing.JLabel();
        btn_buscar1 = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        cBx_materia = new javax.swing.JComboBox<>();
        btn_buscar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_insMaterias = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("*  Listado por Materia  *");

        lbl_materia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_materia.setText("Materia: ");

        lbl_alumnos.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lbl_alumnos.setText("Alumnos activos:");

        btn_buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnMaterias uniG10-1.png"))); // NOI18N
        btn_buscar1.setBorderPainted(false);
        btn_buscar1.setContentAreaFilled(false);
        btn_buscar1.setDefaultCapable(false);
        btn_buscar1.setFocusPainted(false);
        btn_buscar1.setFocusable(false);
        btn_buscar1.setRequestFocusEnabled(false);
        btn_buscar1.setVerifyInputWhenFocusTarget(false);

        btn_salir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        cBx_materia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cBx_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBx_materiaActionPerformed(evt);
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
                "LEGAJO", "NOMBRE", "NOTA"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_buscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cBx_materia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_materia)
                                .addGap(104, 104, 104)))
                        .addComponent(btn_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_alumnos)
                        .addGap(216, 216, 216))))
        );
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
                        .addComponent(lbl_materia)
                        .addGap(18, 18, 18)
                        .addComponent(cBx_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbl_alumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBx_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBx_materiaActionPerformed
        //Cambiar la lista de ALumnos segun seleccion de Materia
        modelTab.setNumRows(0);
        Materia mat = (Materia)cBx_materia.getSelectedItem();//Crear Materia con obj del CBox
        ArrayList<Alumno> arrlAlu = cDat.inscAlumnoXmat(mat); ///listar Alumnos en arrayL nuevo
        
        for (Alumno alum : arrlAlu) {//recorrer lista de ALumnos y setear cada fila con un objeto.
            Cursada cur = cDat.buscarCursada(alum.getIdAlumno(), mat.getIdMateria());//crear cursada para obtener Nota(idAlum, idMat)
            modelTab.addRow(new Object[]{alum.getIdAlumno(),(alum.getApellido()+","+alum.getNombre()), cur.getNota()});//{"LEGAJO","NOMBRE", "NOTA"}
        }
    }//GEN-LAST:event_cBx_materiaActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // SALIR
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar1;
    private javax.swing.JButton btn_buscar2;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<Materia> cBx_materia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_alumnos;
    private javax.swing.JLabel lbl_materia;
    private javax.swing.JTable tbl_insMaterias;
    // End of variables declaration//GEN-END:variables
}
