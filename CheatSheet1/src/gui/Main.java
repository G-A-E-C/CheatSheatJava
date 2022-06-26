/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Cheat;
import model.CheatSheet;
import model.Seccion;
import model.Tag;

/**
 *
 * @author Smart
 */
public class Main extends javax.swing.JFrame {
    private List<Tag>tagList;
    /**
     * Creates new form main
     */
    public Main() {
        initComponents();
        tagList = new LinkedList<>();
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modelListCategoria = new gui.ModelListCategoria();
        modelListCheatSheet = new gui.ModelListCheatSheet();
        modelListSeccion = new gui.ModelListSeccion();
        modelTableCheat = new gui.ModelTableCheat();
        jSplitPane1 = new javax.swing.JSplitPane();
        pnlCheatSheet = new javax.swing.JPanel();
        lblCheatSheet = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblDescripcionCheatSheet = new javax.swing.JLabel();
        lblDescripcionCategoria = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSeccion = new javax.swing.JList<>();
        btnAgregarSeccion = new javax.swing.JButton();
        btnQuitarSeccion = new javax.swing.JButton();
        lblSeccion = new javax.swing.JLabel();
        lblNombreSeccion = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnQuitarCheat = new javax.swing.JButton();
        lblTags = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCheat = new javax.swing.JTable();
        btnAgregarCheat = new javax.swing.JButton();
        pnlCheatSave = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCategoria = new javax.swing.JList<>();
        lblTitulo2 = new javax.swing.JLabel();
        btnAgregarCheatSheat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCheatSheet = new javax.swing.JList<>();
        btnAgregarCategoria = new javax.swing.JButton();
        btnQuitarCategoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEliminarCheatSheet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cheat Sheets");

        pnlCheatSheet.setBackground(new java.awt.Color(184, 184, 184));

        lblCheatSheet.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblCheatSheet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCheatSheet.setText("Cheat Sheet");

        lblCategoria.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoria.setText("Categoria");

        lblDescripcionCheatSheet.setText("Descripcion");

        lblDescripcionCategoria.setText("Descripcion");

        lblFecha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Fecha");

        lstSeccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstSeccion.setModel(modelListSeccion);
        lstSeccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstSeccionMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lstSeccion);

        btnAgregarSeccion.setText("+");
        btnAgregarSeccion.setEnabled(false);
        btnAgregarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSeccionActionPerformed(evt);
            }
        });

        btnQuitarSeccion.setText("-");
        btnQuitarSeccion.setEnabled(false);
        btnQuitarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarSeccionActionPerformed(evt);
            }
        });

        lblSeccion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSeccion.setText("Secciones");

        lblNombreSeccion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblNombreSeccion.setText("Nombre de Seccion");

        lblDescripcion.setText("Descripcion");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de seccion:");

        jPanel2.setBackground(new java.awt.Color(40, 43, 48));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trucos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        btnQuitarCheat.setText("-");
        btnQuitarCheat.setEnabled(false);
        btnQuitarCheat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarCheatActionPerformed(evt);
            }
        });

        lblTags.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblTags.setForeground(new java.awt.Color(255, 255, 255));
        lblTags.setText("Tags");

        tblCheat.setModel(modelTableCheat);
        tblCheat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCheatMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCheat);

        btnAgregarCheat.setText("+");
        btnAgregarCheat.setEnabled(false);
        btnAgregarCheat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCheatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTags, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAgregarCheat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnQuitarCheat))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTags)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuitarCheat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarCheat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCheatSheetLayout = new javax.swing.GroupLayout(pnlCheatSheet);
        pnlCheatSheet.setLayout(pnlCheatSheetLayout);
        pnlCheatSheetLayout.setHorizontalGroup(
            pnlCheatSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheatSheetLayout.createSequentialGroup()
                .addGroup(pnlCheatSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCheatSheetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCheatSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCheatSheet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlCheatSheetLayout.createSequentialGroup()
                                .addGroup(pnlCheatSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCheatSheetLayout.createSequentialGroup()
                                        .addComponent(btnQuitarSeccion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgregarSeccion)))
                                .addGap(42, 42, 42)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 46, Short.MAX_VALUE))))
                    .addComponent(lblDescripcionCheatSheet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDescripcionCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheatSheetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCheatSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addGroup(pnlCheatSheetLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombreSeccion)))
                .addGap(317, 317, 317))
        );
        pnlCheatSheetLayout.setVerticalGroup(
            pnlCheatSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheatSheetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategoria)
                .addGap(18, 18, 18)
                .addComponent(lblDescripcionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCheatSheet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcionCheatSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlCheatSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNombreSeccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCheatSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCheatSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCheatSheetLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCheatSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarSeccion)
                            .addComponent(btnQuitarSeccion)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(pnlCheatSheet);

        pnlCheatSave.setBackground(new java.awt.Color(153, 0, 0));

        lstCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstCategoria.setModel(modelListCategoria);
        lstCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstCategoria);

        lblTitulo2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("Categorias");

        btnAgregarCheatSheat.setText("+");
        btnAgregarCheatSheat.setEnabled(false);
        btnAgregarCheatSheat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCheatSheatActionPerformed(evt);
            }
        });

        lstCheatSheet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstCheatSheet.setModel(modelListCheatSheet);
        lstCheatSheet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCheatSheetMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstCheatSheet);

        btnAgregarCategoria.setText("+");
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });

        btnQuitarCategoria.setText("-");
        btnQuitarCategoria.setEnabled(false);
        btnQuitarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarCategoriaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cheat Sheet");

        btnEliminarCheatSheet.setText("-");
        btnEliminarCheatSheet.setEnabled(false);
        btnEliminarCheatSheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCheatSheetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCheatSaveLayout = new javax.swing.GroupLayout(pnlCheatSave);
        pnlCheatSave.setLayout(pnlCheatSaveLayout);
        pnlCheatSaveLayout.setHorizontalGroup(
            pnlCheatSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheatSaveLayout.createSequentialGroup()
                .addGroup(pnlCheatSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCheatSaveLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCheatSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(pnlCheatSaveLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheatSaveLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlCheatSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheatSaveLayout.createSequentialGroup()
                                        .addComponent(btnAgregarCategoria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnQuitarCategoria))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheatSaveLayout.createSequentialGroup()
                                        .addComponent(btnAgregarCheatSheat)
                                        .addGap(2, 2, 2)
                                        .addComponent(btnEliminarCheatSheet))))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCheatSaveLayout.setVerticalGroup(
            pnlCheatSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheatSaveLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCheatSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuitarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarCategoria))
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlCheatSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCheatSheat)
                    .addComponent(btnEliminarCheatSheet))
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(pnlCheatSave);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCheatSheatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCheatSheatActionPerformed
        DiaCheatSheet diaCheatSheet = new DiaCheatSheet(this, true, lstCategoria.getSelectedValue(), tagList);
        //diaCheatSheet.setModelListTag(modelListTag);
        diaCheatSheet.setVisible(true);
        tagList = diaCheatSheet.getTagList();
        
        CheatSheet cheatSheet = diaCheatSheet.getCheatSheet();
        if (cheatSheet!= null) {
            modelListCheatSheet.addElement(cheatSheet);
            lstCategoria.getSelectedValue().getCheatSheetList().add(cheatSheet);
        }
    }//GEN-LAST:event_btnAgregarCheatSheatActionPerformed

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
        DiaCategoria diaCategoria = new DiaCategoria(this, true);
        diaCategoria.setVisible(true);
        
        Categoria categoria = diaCategoria.getCategoria();
        if (categoria!=null) {
            modelListCategoria.addElement(categoria);
        }
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    private void btnQuitarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarCategoriaActionPerformed
        int seleccion= JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar la categoria seleccionada");
        if (seleccion == JOptionPane.YES_OPTION) {
            modelListCategoria.removeElement(lstCategoria.getSelectedValue());
            btnQuitarCategoria.setEnabled(false);
        }
    }//GEN-LAST:event_btnQuitarCategoriaActionPerformed

    private void lstCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCategoriaMouseClicked
        btnQuitarCategoria.setEnabled(true);
        btnAgregarCheatSheat.setEnabled(true);
        btnAgregarSeccion.setEnabled(false);
        btnQuitarSeccion.setEnabled(false);
        modelListCheatSheet.removeAllElements();
        modelListCheatSheet.addAll(lstCategoria.getSelectedValue().getCheatSheetList());
        modelListSeccion.removeAllElements();
        inicializarCheat();
    }//GEN-LAST:event_lstCategoriaMouseClicked

    private void lstCheatSheetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCheatSheetMouseClicked
        btnEliminarCheatSheet.setEnabled(true);
        lblCategoria.setText(lstCategoria.getSelectedValue().getNombre());
        lblDescripcionCategoria.setText(lstCategoria.getSelectedValue().getDescripcion());
        lblCheatSheet.setText(lstCheatSheet.getSelectedValue().getNombre());
        lblDescripcionCheatSheet.setText(lstCheatSheet.getSelectedValue().getDescripcion());
        lblFecha.setText(lstCheatSheet.getSelectedValue().getFecha().toString());
        lblTags.setText(lstCheatSheet.getSelectedValue().getTagList().toString());
        btnAgregarSeccion.setEnabled(true);
        btnQuitarSeccion.setEnabled(false);
        modelListSeccion.removeAllElements();
        modelListSeccion.addAll(lstCheatSheet.getSelectedValue().getSeccionList());
        inicializarCheat();
        
    }//GEN-LAST:event_lstCheatSheetMouseClicked

    private void btnEliminarCheatSheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCheatSheetActionPerformed
        int seleccion= JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar la Cheat Sheet seleccionada");
        if (seleccion == JOptionPane.YES_OPTION) {
            lstCategoria.getSelectedValue().getCheatSheetList().remove(lstCheatSheet.getSelectedValue());
            modelListCheatSheet.removeElement(lstCheatSheet.getSelectedValue());
            btnEliminarCheatSheet.setEnabled(false);
        }
    }//GEN-LAST:event_btnEliminarCheatSheetActionPerformed

    private void btnAgregarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSeccionActionPerformed
        DiaSeccion diaSeccion=new DiaSeccion(this, true, lstCheatSheet.getSelectedValue());
        diaSeccion.setVisible(true);
        
        Seccion seccion = diaSeccion.getSeccion();
        if (seccion!=null) {
            modelListSeccion.addElement(seccion);
            lstCheatSheet.getSelectedValue().getSeccionList().add(seccion);
            
        }
    }//GEN-LAST:event_btnAgregarSeccionActionPerformed

    private void btnQuitarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarSeccionActionPerformed
        int seleccion= JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar la seccion seleccionada");
        if (seleccion == JOptionPane.YES_OPTION) {
            lstCheatSheet.getSelectedValue().getSeccionList().remove(lstSeccion.getSelectedValue());
            modelListSeccion.removeElement(lstSeccion.getSelectedValue());
            btnQuitarSeccion.setEnabled(false);
        }
    }//GEN-LAST:event_btnQuitarSeccionActionPerformed

    private void lstSeccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstSeccionMouseClicked
        btnQuitarSeccion.setEnabled(true);
        btnAgregarCheat.setEnabled(true);
        lblNombreSeccion.setText(lstSeccion.getSelectedValue().getNombre());
        lblDescripcion.setText(lstSeccion.getSelectedValue().getDescipcion());
        btnQuitarCheat.setEnabled(false);
        inicializarCheat();
    }//GEN-LAST:event_lstSeccionMouseClicked

    private void btnAgregarCheatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCheatActionPerformed
        DiaCheat diaCheat = new DiaCheat(this, true, lstSeccion.getSelectedValue());
        diaCheat.setVisible(true);
        
        Cheat cheat = diaCheat.getCheat();
        if (cheat!=null) {
            modelTableCheat.agregarCheat(cheat);
            lstSeccion.getSelectedValue().getCheatList().add(cheat);
        }
    }//GEN-LAST:event_btnAgregarCheatActionPerformed

    private void tblCheatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCheatMouseClicked
        btnQuitarCheat.setEnabled(true);
    }//GEN-LAST:event_tblCheatMouseClicked

    private void btnQuitarCheatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarCheatActionPerformed
        int seleccion= JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar la Cheat seleccionada");
        if (seleccion == JOptionPane.YES_OPTION) {
            lstSeccion.getSelectedValue().getCheatList().remove(modelTableCheat.getCheatList().get(tblCheat.getSelectedRow()));
            modelTableCheat.eliminarFila(tblCheat.getSelectedRow());
            btnQuitarCheat.setEnabled(false);
        }
    }//GEN-LAST:event_btnQuitarCheatActionPerformed
    
    private void inicializarCheat(){
        try {
            modelTableCheat.removerTodos();
            modelTableCheat.agregarTodos(lstSeccion.getSelectedValue().getCheatList());
        } catch (Exception e) {
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnAgregarCheat;
    private javax.swing.JButton btnAgregarCheatSheat;
    private javax.swing.JButton btnAgregarSeccion;
    private javax.swing.JButton btnEliminarCheatSheet;
    private javax.swing.JButton btnQuitarCategoria;
    private javax.swing.JButton btnQuitarCheat;
    private javax.swing.JButton btnQuitarSeccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCheatSheet;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcionCategoria;
    private javax.swing.JLabel lblDescripcionCheatSheet;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombreSeccion;
    private javax.swing.JLabel lblSeccion;
    private javax.swing.JLabel lblTags;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JList<Categoria> lstCategoria;
    private javax.swing.JList<CheatSheet> lstCheatSheet;
    private javax.swing.JList<Seccion> lstSeccion;
    private gui.ModelListCategoria modelListCategoria;
    private gui.ModelListCheatSheet modelListCheatSheet;
    private gui.ModelListSeccion modelListSeccion;
    private gui.ModelTableCheat modelTableCheat;
    private javax.swing.JPanel pnlCheatSave;
    private javax.swing.JPanel pnlCheatSheet;
    private javax.swing.JTable tblCheat;
    // End of variables declaration//GEN-END:variables
}
