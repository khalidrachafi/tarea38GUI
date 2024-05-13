/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vistas;

import java.awt.Color;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JTable;
import modelos.Donante;

/**
 *
 * @author krach
 */
public class Editar extends javax.swing.JDialog {

    private VentanaPrincipal padre;
    private Donante donante;

    public Editar(VentanaPrincipal parent, boolean modal) throws IOException {

        super(parent, modal);
        padre = parent;
        initComponents();
        mostrarDatosEditar();
    }

    // Este método privado permite cargar los datos en los componentes
    // de este jdialog del registro seleccionado en el jtable de la ventana
    private void mostrarDatosEditar() throws IOException {
        // Obtengo el id de la persona seleccionada
        // Para ello, obtengo la fila seleccionada y luego el id de esa fila
        int fila = filaSeleccionadaJTable(padre.getJTable());
        // El id de la persona es el valor de la columna cero de esa fila
        String idDonante = (String) padre.getJTable().getValueAt(fila, 0);

        // Guarda la persona seleccionada
        this.donante = padre.getListaDonantes().getDonante(idDonante);
        // Muestra datos de la persona que se seleccionó en el jtable
        // en los jtextfield
        idtxt.setText(this.donante.getIdPaciente());
        idtxt.setEditable(false); // No editable
        idtxt.setBackground(Color.GRAY);
        nombretxt.setText(this.donante.getNombre());

        // Obtener la fecha de nacimiento del donante
        //LocalDate fechaNacimiento = this.donante.getFechaNacimiento();
        // Convertir la fecha de nacimiento a un String con el formato dia/mes/año dado que es el dato que mostraremos
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
       // String fechaNacimientoTexto = fechaNacimiento.format(formatter);
        // Establecer el texto en el JTextField
       // fechatxt.setText(fechaNacimientoTexto);
        grupotxt.setText(this.donante.getGrupoSanguineo());
        rhtxt.setText(this.donante.getRh());

        // Obtener el número de donaciones del donante
        int numeroDonaciones = this.donante.getNumeroDonaciones();
        // Convertir el entero a un String
        String numeroDonacionesTexto = String.valueOf(numeroDonaciones);
        // Establecer el texto ya siendo un Strnig
        donacionestxt.setText(numeroDonacionesTexto);

    }

    // Este método permite obtener la fila seleccionada en el JTable
    private int filaSeleccionadaJTable(JTable jTable1) {
        int fila = jTable1.getSelectedRow();
        return fila;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idLab = new javax.swing.JLabel();
        nombreLab = new javax.swing.JLabel();
        fechaLab = new javax.swing.JLabel();
        grupoLab = new javax.swing.JLabel();
        rhLab = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        nombretxt = new javax.swing.JTextField();
        fechatxt = new javax.swing.JTextField();
        grupotxt = new javax.swing.JTextField();
        rhtxt = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        donacionesLab = new javax.swing.JLabel();
        donacionestxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        idLab.setText("id");

        nombreLab.setText("Nombre");

        fechaLab.setText("Fecha de nacimiento");

        grupoLab.setText("Grupo Sanguineo");

        rhLab.setText("Rh");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        donacionesLab.setText("Numero donaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fechaLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grupoLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rhLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(donacionesLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(donacionestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rhtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grupotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLab)
                            .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(nombreLab)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaLab)
                            .addComponent(fechatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grupoLab)
                            .addComponent(btnCancelar)
                            .addComponent(grupotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rhLab)
                            .addComponent(rhtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(donacionesLab))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(donacionestxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        // Guardo en la persona seleccionada los cambios de los jtextfield
        this.donante.setNombre(nombretxt.getText());
        String fechaTexto = fechatxt.getText();
        // Pasar el contenido del JTextField como un String
        // Convertir el String en un objeto LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate fechaNacimiento = LocalDate.parse(fechaTexto, formatter);
       // this.donante.setFechaNacimiento(fechaNacimiento);
        this.donante.setGrupoSanguineo(grupotxt.getText());
        this.donante.setRh(rhtxt.getText());
        String numeroDonacionesTexto = donacionestxt.getText();
        // Convertir el String en un Integer
        try {
            Integer numeroDonaciones = Integer.parseInt(numeroDonacionesTexto);
            // Pasar el Integer al método setNumeroDonaciones
            this.donante.setNumeroDonaciones(numeroDonaciones);
        } catch (NumberFormatException e) {
            // Manejar el caso en el que el String no se pueda convertir a un Integer
            System.out.println("Error: No es un número entero válido.");
        }
        // En este punto también se podrían guardar los cambios en un 
        // fichero o en una BD

        // Cierro el dialogo
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Editar dialog = new Editar(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel donacionesLab;
    private javax.swing.JTextField donacionestxt;
    private javax.swing.JLabel fechaLab;
    private javax.swing.JTextField fechatxt;
    private javax.swing.JLabel grupoLab;
    private javax.swing.JTextField grupotxt;
    private javax.swing.JLabel idLab;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel nombreLab;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JLabel rhLab;
    private javax.swing.JTextField rhtxt;
    // End of variables declaration//GEN-END:variables
}
