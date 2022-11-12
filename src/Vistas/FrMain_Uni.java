
package Vistas;
/**
 * @author Pat
 */
public class FrMain_Uni extends javax.swing.JFrame {

    /**
     * Creates new form FrMain_Uni
     */
    public FrMain_Uni() {
        initComponents();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDskP = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jmi_fMateria = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmi_fAlumno = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmi_fcursada = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmi_notas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jmi_aluXmateria = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jmi_cerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Escudo uniG10-50porciento.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);

        jDskP.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDskPLayout = new javax.swing.GroupLayout(jDskP);
        jDskP.setLayout(jDskPLayout);
        jDskPLayout.setHorizontalGroup(
            jDskPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDskPLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jDskPLayout.setVerticalGroup(
            jDskPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDskPLayout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(500, 40));

        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu3.setText("Materias ·");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jmi_fMateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jmi_fMateria.setText("Formulario Materias");
        jmi_fMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_fMateriaActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_fMateria);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu4.setText(" Alumnos ·");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jmi_fAlumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jmi_fAlumno.setText("Formulario Alumnos");
        jmi_fAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_fAlumnoActionPerformed(evt);
            }
        });
        jMenu4.add(jmi_fAlumno);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu5.setText(" Cursada ·");
        jMenu5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jmi_fcursada.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jmi_fcursada.setText("Inscripciones");
        jmi_fcursada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_fcursadaActionPerformed(evt);
            }
        });
        jMenu5.add(jmi_fcursada);

        jMenuBar1.add(jMenu5);

        jMenu6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu6.setText(" Notas ·");
        jMenu6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jmi_notas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jmi_notas.setText("Calificaciones");
        jmi_notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_notasActionPerformed(evt);
            }
        });
        jMenu6.add(jmi_notas);

        jMenuBar1.add(jMenu6);

        jMenu7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu7.setText(" Consultas ·");
        jMenu7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jmi_aluXmateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jmi_aluXmateria.setText("Listado por Materia");
        jmi_aluXmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_aluXmateriaActionPerformed(evt);
            }
        });
        jMenu7.add(jmi_aluXmateria);

        jMenuBar1.add(jMenu7);

        jMenu8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu8.setText(" Salir ·");
        jMenu8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jmi_cerrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jmi_cerrar.setText("Cerrar Gestor");
        jmi_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cerrarActionPerformed(evt);
            }
        });
        jMenu8.add(jmi_cerrar);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDskP)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDskP)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_fAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_fAlumnoActionPerformed
        jDskP.removeAll(); //limpiar escritorio
        jDskP.repaint();    //repinta escritorio
        
        Fri_alumnos fri_alumnos = new Fri_alumnos();    //creo un obj ventana alum
        fri_alumnos.setVisible(true);                   //le doy visibilidad
        jDskP.add(fri_alumnos);                         //le agrego esa ventana al escritorio
        jDskP.moveToFront(fri_alumnos);                 //lo coloco encima de todo para verlo           
    }//GEN-LAST:event_jmi_fAlumnoActionPerformed

    private void jmi_fMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_fMateriaActionPerformed
        jDskP.removeAll(); //limpiar escritorio
        jDskP.repaint();    //repinta escritorio
        
        Fri_materias fri_materias = new Fri_materias();    //creo un obj ventana materia
        fri_materias.setVisible(true);                   //le doy visibilidad
        jDskP.add(fri_materias);                         //le agrego esa ventana al escritorio
        jDskP.moveToFront(fri_materias);                 //lo coloco encima de todo para verlo   
    }//GEN-LAST:event_jmi_fMateriaActionPerformed

    private void jmi_fcursadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_fcursadaActionPerformed
        jDskP.removeAll(); //limpiar escritorio
        jDskP.repaint();    //repinta escritorio
        
        Fri_inscripcion fri_inscripcion = new Fri_inscripcion();    //creo un obj ventana Cursada/inscripciones
        fri_inscripcion.setVisible(true);                   //le doy visibilidad
        jDskP.add(fri_inscripcion);                         //le agrego esa ventana al escritorio
        jDskP.moveToFront(fri_inscripcion);                 //lo coloco encima de todo para verlo
    }//GEN-LAST:event_jmi_fcursadaActionPerformed

    private void jmi_notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_notasActionPerformed
        jDskP.removeAll(); //limpiar escritorio
        jDskP.repaint();    //repinta escritorio
        
        Fri_notas fri_notas = new Fri_notas();    //creo un obj ventana Notas
        fri_notas.setVisible(true);                   //le doy visibilidad
        jDskP.add(fri_notas);                         //le agrego esa ventana al escritorio
        jDskP.moveToFront(fri_notas);                 //lo coloco encima de todo para verlo
    }//GEN-LAST:event_jmi_notasActionPerformed

    private void jmi_aluXmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_aluXmateriaActionPerformed
        jDskP.removeAll(); //limpiar escritorio
        jDskP.repaint();    //repinta escritorio
        
        Fri_aluXmateria fri_x = new Fri_aluXmateria();    //creo un obj ventana aluXmateria
        fri_x.setVisible(true);                   //le doy visibilidad
        jDskP.add(fri_x);                         //le agrego esa ventana al escritorio
        jDskP.moveToFront(fri_x);                 //lo coloco encima de todo para verlo
    }//GEN-LAST:event_jmi_aluXmateriaActionPerformed

    private void jmi_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cerrarActionPerformed
        System.exit(0); //-->Cierra todo el Programa
        // this.dispose(); //--> Solo cierra la ventana actual
    }//GEN-LAST:event_jmi_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(FrMain_Uni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMain_Uni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMain_Uni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMain_Uni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMain_Uni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDskP;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmi_aluXmateria;
    private javax.swing.JMenuItem jmi_cerrar;
    private javax.swing.JMenuItem jmi_fAlumno;
    private javax.swing.JMenuItem jmi_fMateria;
    private javax.swing.JMenuItem jmi_fcursada;
    private javax.swing.JMenuItem jmi_notas;
    // End of variables declaration//GEN-END:variables
}
