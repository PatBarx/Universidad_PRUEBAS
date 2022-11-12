package Vistas;

import Data.MateriaData;
import Entidades.Materia;
import javax.swing.JOptionPane;

/**
 * @author Pat
 */
public class Fri_materias extends javax.swing.JInternalFrame {
    private MateriaData mDat;
    private Materia mat;
    
    public Fri_materias() {
        initComponents();
        mDat = new MateriaData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_idAlum = new javax.swing.JLabel();
        txt_idMat = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        txt_anio = new javax.swing.JTextField();
        lbl_apellido1 = new javax.swing.JLabel();
        jChBoxActivo = new javax.swing.JCheckBox();
        btn_buscar1 = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("*  MATERIAS  *");

        lbl_idAlum.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_idAlum.setText("Código:  (*)");

        txt_idMat.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lbl_apellido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_apellido.setText("Nombre:  (*)");

        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa48x48.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_anio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lbl_apellido1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_apellido1.setText("Año:  (*)");

        jChBoxActivo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jChBoxActivo.setText("Estado Activo");

        btn_buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnMaterias uniG10-1.png"))); // NOI18N
        btn_buscar1.setBorderPainted(false);
        btn_buscar1.setContentAreaFilled(false);
        btn_buscar1.setFocusPainted(false);
        btn_buscar1.setFocusable(false);
        btn_buscar1.setRequestFocusEnabled(false);

        btn_guardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_borrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_borrar.setText("BORRAR");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_limpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel2.setText("(*)  CAMPOS OBLIGATORIOS PARA GUARDAR UN ALUMNO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(btn_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_borrar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_idAlum)
                            .addComponent(lbl_apellido)
                            .addComponent(lbl_apellido1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nombre)
                            .addComponent(txt_idMat)
                            .addComponent(txt_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btn_buscar)))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jChBoxActivo))))
                .addGap(216, 216, 216))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_actualizar, btn_borrar, btn_guardar, btn_limpiar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_idAlum)
                    .addComponent(txt_idMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido1)
                    .addComponent(txt_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jChBoxActivo)
                .addGap(33, 33, 33)
                .addComponent(btn_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_borrar)
                    .addComponent(btn_guardar))
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_actualizar, btn_borrar, btn_guardar, btn_limpiar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
    //Guardar MAteria
    //INSERT INTO materia (nombre, anio, activo) VALUES (?,?,?)
        if (txt_nombre.getText() == "" || txt_anio.getText() == "") {
            JOptionPane.showMessageDialog(null, "MATERIA Error:\nComplete Todos los campos requeridos");  
        } else {
            mat = new Materia();
            //Seteo datos de los campos txt al obj Materia
            try {
                mat.setNombre(txt_nombre.getText());
                mat.setAnio(Integer.parseInt(txt_anio.getText()));
                mat.setActivo(true);
                //llamo al metodo guardarMateria pasandole el objeto completo        
                mDat.guardarMateria(mat);
                //recupero el ID generado por el metodo MateriaData y lo muestro en el campotxt
                txt_idMat.setText(String.valueOf(mat.getIdMateria()));
                btn_guardar.setEnabled(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"MATERIA ERROR: Ingrese un año válido\n" + e);
                mat = null;
            }           
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // LIMPIAR formulario
        txt_idMat.setText("");
        txt_nombre.setText("");
        txt_anio.setText("");        
        jChBoxActivo.setSelected(false);
        btn_guardar.setEnabled(true);
        //limpio el objeto local
        mat = null;
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // BORRAR Materia (logico--> activo = 0)
        mDat.borrarMateria(mat.getIdMateria()); //id de la ultima materia buscada
        //mDat.borrarMateria(Integer.parseInt(txt_idMat.getText())); //id del campo de texto
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // ACTUALIZAR cambios Materias
        try {
            if (txt_nombre.getText() == "" || txt_anio.getText() == "") {
            JOptionPane.showMessageDialog(null, "MATERIA Error:\nComplete Todos los campos requeridos");  
            } else {            
                //Seteo datos de los campos txt al obj Materia
                mat.setNombre(txt_nombre.getText());
                mat.setAnio(Integer.parseInt(txt_anio.getText()));
                mat.setActivo(jChBoxActivo.isSelected());
                //llamo al metodo guardarMateria pasandole el objeto completo        
                mDat.actualizarMateria(mat);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"MATERIA ERROR: Ingrese un numero válido\n" + e);
            mat=null; //en caso de excp vacio el obj q pudo quedar seteado a medias
        }
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        //Buscar Materia
        try {             
            mat = mDat.buscarMateria(Integer.parseInt(txt_idMat.getText()));
            //seteo los datos del objeto encontrado, en cada campo de texto
            if (mat != null) {
                txt_nombre.setText(mat.getNombre());
                txt_anio.setText(String.valueOf(mat.getAnio()));
                jChBoxActivo.setSelected(mat.isActivo());
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"MATERIA ERROR: Ingrese un numero válido\n" + e);
            mat=null; //en caso de excp vacio el obj q pudo quedar seteado a medias
        }           
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscar1;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JCheckBox jChBoxActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_apellido1;
    private javax.swing.JLabel lbl_idAlum;
    private javax.swing.JTextField txt_anio;
    private javax.swing.JTextField txt_idMat;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
