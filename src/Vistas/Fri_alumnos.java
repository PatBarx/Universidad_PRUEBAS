package Vistas;

import Data.AlumnoData;
import Entidades.Alumno;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 * @author Pat
 */
public class Fri_alumnos extends javax.swing.JInternalFrame {
    private AlumnoData aDat; 
    private Alumno alu;
    
    public Fri_alumnos() {
        initComponents();      
        aDat =new AlumnoData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_idAlum = new javax.swing.JLabel();
        txt_idAlum = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        lbl_apellido1 = new javax.swing.JLabel();
        lbl_fechNac = new javax.swing.JLabel();
        dChoo_fechNac = new com.toedter.calendar.JDateChooser();
        jChBoxActivo = new javax.swing.JCheckBox();
        btn_buscar1 = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        lbl_dni = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("*  ALUMNOS  *");

        lbl_idAlum.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_idAlum.setText("Legajo:  (*)");

        txt_idAlum.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lbl_apellido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_apellido.setText("Apellido:  (*)");

        txt_apellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa48x48.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lbl_apellido1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_apellido1.setText("Nombre:  (*)");

        lbl_fechNac.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_fechNac.setText("Fecha de Nacimiento:  (*)");

        jChBoxActivo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jChBoxActivo.setText("Estado Activo");

        btn_buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/btnAlumnos uniG10-1.png"))); // NOI18N
        btn_buscar1.setBorderPainted(false);
        btn_buscar1.setContentAreaFilled(false);
        btn_buscar1.setDefaultCapable(false);
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

        lbl_dni.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_dni.setText("DNI:  (*)");

        txt_dni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel2.setText("(*)  CAMPOS OBLIGATORIOS PARA GUARDAR UN ALUMNO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jChBoxActivo)))
                .addGap(216, 216, 216))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_idAlum)
                            .addComponent(lbl_apellido)
                            .addComponent(lbl_apellido1)
                            .addComponent(lbl_dni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbl_fechNac)
                                    .addGap(52, 52, 52))
                                .addComponent(dChoo_fechNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(txt_idAlum))
                                .addGap(28, 28, 28)
                                .addComponent(btn_buscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_guardar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_borrar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_actualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_limpiar)))))
                .addGap(44, 44, 44))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_actualizar, btn_borrar, btn_guardar, btn_limpiar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_idAlum)
                    .addComponent(txt_idAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dni)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_fechNac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dChoo_fechNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        //GUARDAR ALUMNO
        //(`idAlumno`, `nombre`, `apellido`, `fechaNac`, `dni`, `activo`)
        if (txt_nombre.getText() == "" || txt_apellido.getText() == "" || txt_dni.getText()=="" || dChoo_fechNac.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Alumno Error:\nComplete Todos los campos requeridos");            
        }else{
            alu = new Alumno(); //Nuevo obj Alumno
            //Seteo datos de los campos txt al obj Alumno
            alu.setNombre(txt_nombre.getText());
            alu.setApellido(txt_apellido.getText());
            alu.setFechaNac(LocalDate.parse( new SimpleDateFormat("yyyy-MM-dd").format(dChoo_fechNac.getDate())));
            alu.setDni(Integer.parseInt(txt_dni.getText()));
            alu.setActivo(true);
            //llamo al metodo guardarAlumno pasandole el objeto completo        
            aDat.guardarAlumno(alu);
            //recupero el ID generado por el metodo AlumnoData y lo muestro en el campotxt
            txt_idAlum.setText(String.valueOf(alu.getIdAlumno()));
            btn_guardar.setEnabled(false);
            txt_idAlum.setEnabled(false);
        }        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // LIMPIAR formulario
        txt_idAlum.setEnabled(true);
        txt_idAlum.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        dChoo_fechNac.setCalendar(null);
        txt_dni.setText("");
        jChBoxActivo.setSelected(false);
        btn_guardar.setEnabled(true);
        
        //limpio el objeto local
        alu = null;        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // BORRAR alumno (logico--> activo = 0)
        try {
            aDat.borrarAlumno(alu.getIdAlumno()); //id del ultimo alumno buscado
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Alumno ERROR: Datos de Alumno inválidos\n" + e);
        }        
        //aDat.borrarAlumno(Integer.parseInt(txt_idAlum.getText())); //id del campo de texto        
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // ACTUALIZAR cambios alumnos
        try {
            if (txt_nombre.getText() == "" || txt_apellido.getText() == "" || txt_dni.getText()=="" || dChoo_fechNac.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Alumno Error:\nComplete Todos los campos requeridos");            
            } else{
            //Seteo datos de los campos txt al obj Alumno
            alu.setNombre(txt_nombre.getText());
            alu.setApellido(txt_apellido.getText());
            alu.setFechaNac(LocalDate.parse( new SimpleDateFormat("yyyy-MM-dd").format(dChoo_fechNac.getDate())));
            alu.setDni(Integer.parseInt(txt_dni.getText()));
            alu.setActivo(true);
            //llamo al metodo guardarAlumno pasandole el objeto completo        
            aDat.actualizarAlumno(alu);
            }              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Alumno ERROR: Ingrese un dni válido\n" + e);
            alu=null; //en caso de excp vacio el obj q pudo quedar seteado a medias
        }
       
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // BUSCAR alumno
        try {
            alu = aDat.buscarAlumno(Integer.parseInt(txt_idAlum.getText()));
            
            //seteo los datos del objeto encontrado, en cada campo de texto
            if (alu != null) {
                txt_nombre.setText(alu.getNombre());
                txt_apellido.setText(alu.getApellido());
                dChoo_fechNac.setDate(Date.valueOf(alu.getFechaNac()));
                txt_dni.setText(String.valueOf(alu.getDni()));
                jChBoxActivo.setSelected(true);
                
                txt_idAlum.setEnabled(false);
            }else {
                btn_limpiarActionPerformed(evt);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ALUMNO ERROR: Ingrese un numero válido\n" + e);
            alu = null; //en caso de excp vacio el obj q pudo quedar seteado a medias
            
        }
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscar1;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private com.toedter.calendar.JDateChooser dChoo_fechNac;
    private javax.swing.JCheckBox jChBoxActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_apellido1;
    private javax.swing.JLabel lbl_dni;
    private javax.swing.JLabel lbl_fechNac;
    private javax.swing.JLabel lbl_idAlum;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_idAlum;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
