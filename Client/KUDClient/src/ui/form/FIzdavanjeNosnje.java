/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Nemanja
 */
public class FIzdavanjeNosnje extends javax.swing.JDialog {

    /**
     * Creates new form FIzdavanjeNosnje
     */
    public FIzdavanjeNosnje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(null);
        jTblIzmene.getTableHeader().setBackground(new Color(51,51,51));
        jTblIzmene.getTableHeader().setForeground(new Color(223,197,107));
        jtblnosnje.getTableHeader().setBackground(new Color(51,51,51));
        jtblnosnje.getTableHeader().setForeground(new Color(223,197,107));
        jtblotpremnica.getTableHeader().setBackground(new Color(51,51,51));
        jtblotpremnica.getTableHeader().setForeground(new Color(223,197,107));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtsifra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtdatumkreiranja = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblotpremnica = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jtxtizdavac = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcmbPrimalac = new javax.swing.JComboBox<>();
        jbrnobrisistavku = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblnosnje = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtxtsifranosnje = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtnazivnosnje = new javax.swing.JTextField();
        jtxtkolicina = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jbtndodajstavku = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtxtvrstaNosnje = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jBtnCancel = new javax.swing.JButton();
        jBtnEnableChanges = new javax.swing.JButton();
        jBtnDelete = new javax.swing.JButton();
        jBtnUpdate = new javax.swing.JButton();
        jBtnUbaciNovog = new javax.swing.JButton();
        jbtnsacuvaj = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTblIzmene = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(223, 197, 107), new java.awt.Color(223, 197, 107), new java.awt.Color(223, 181, 79), new java.awt.Color(223, 181, 79)));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Otpremnica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(223, 197, 107))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(223, 197, 107));

        jLabel1.setForeground(new java.awt.Color(223, 197, 107));
        jLabel1.setText("Sifra otpremnice:");

        jtxtsifra.setBackground(new java.awt.Color(51, 51, 51));
        jtxtsifra.setForeground(new java.awt.Color(223, 197, 107));
        jtxtsifra.setEnabled(false);

        jLabel2.setForeground(new java.awt.Color(223, 197, 107));
        jLabel2.setText("Datum kreiranja:");

        jtxtdatumkreiranja.setBackground(new java.awt.Color(51, 51, 51));
        jtxtdatumkreiranja.setForeground(new java.awt.Color(223, 197, 107));

        jtblotpremnica.setBackground(new java.awt.Color(51, 51, 51));
        jtblotpremnica.setForeground(new java.awt.Color(223, 197, 107));
        jtblotpremnica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblotpremnica.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jtblotpremnica);

        jLabel3.setForeground(new java.awt.Color(223, 197, 107));
        jLabel3.setText("Lice koje izdaje:");

        jtxtizdavac.setBackground(new java.awt.Color(51, 51, 51));
        jtxtizdavac.setForeground(new java.awt.Color(223, 197, 107));
        jtxtizdavac.setEnabled(false);

        jLabel4.setForeground(new java.awt.Color(223, 197, 107));
        jLabel4.setText("Lice kome se izdaje:");

        jcmbPrimalac.setBackground(new java.awt.Color(51, 51, 51));
        jcmbPrimalac.setForeground(new java.awt.Color(223, 197, 107));

        jbrnobrisistavku.setBackground(new java.awt.Color(223, 197, 107));
        jbrnobrisistavku.setForeground(new java.awt.Color(51, 51, 51));
        jbrnobrisistavku.setText("Vrati nošnju");
        jbrnobrisistavku.setBorder(null);
        jbrnobrisistavku.setBorderPainted(false);
        jbrnobrisistavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrnobrisistavkuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbrnobrisistavku, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jcmbPrimalac, 0, 315, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxtdatumkreiranja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                    .addComponent(jtxtsifra, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtizdavac)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtsifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtdatumkreiranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtizdavac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcmbPrimalac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jbrnobrisistavku, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nosnje", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(223, 197, 107))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(223, 197, 107));

        jtblnosnje.setBackground(new java.awt.Color(51, 51, 51));
        jtblnosnje.setForeground(new java.awt.Color(223, 197, 107));
        jtblnosnje.setModel(new javax.swing.table.DefaultTableModel(
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
        jtblnosnje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblnosnjeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblnosnje);

        jPanel4.setBackground(new java.awt.Color(223, 197, 107));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Nosnja"));

        jLabel5.setText("Sifra nosnje:");

        jtxtsifranosnje.setBackground(new java.awt.Color(51, 51, 51));
        jtxtsifranosnje.setForeground(new java.awt.Color(223, 197, 107));
        jtxtsifranosnje.setEnabled(false);

        jLabel6.setText("Naziv:");

        jtxtnazivnosnje.setBackground(new java.awt.Color(51, 51, 51));
        jtxtnazivnosnje.setForeground(new java.awt.Color(223, 197, 107));
        jtxtnazivnosnje.setEnabled(false);

        jtxtkolicina.setBackground(new java.awt.Color(51, 51, 51));
        jtxtkolicina.setForeground(new java.awt.Color(223, 197, 107));

        jLabel7.setText("Kolicina:");

        jbtndodajstavku.setBackground(new java.awt.Color(51, 51, 51));
        jbtndodajstavku.setForeground(new java.awt.Color(223, 197, 107));
        jbtndodajstavku.setText("Dodaj stavku");
        jbtndodajstavku.setBorder(null);
        jbtndodajstavku.setBorderPainted(false);
        jbtndodajstavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndodajstavkuActionPerformed(evt);
            }
        });

        jLabel8.setText("Vrsta nosnje:");

        jtxtvrstaNosnje.setBackground(new java.awt.Color(51, 51, 51));
        jtxtvrstaNosnje.setForeground(new java.awt.Color(223, 197, 107));
        jtxtvrstaNosnje.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtndodajstavku, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtsifranosnje))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtnazivnosnje))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtkolicina))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtvrstaNosnje)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtsifranosnje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtxtvrstaNosnje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtnazivnosnje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtkolicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtndodajstavku, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(223, 181, 107), new java.awt.Color(223, 181, 107), new java.awt.Color(223, 200, 95), new java.awt.Color(223, 200, 95)));

        jBtnCancel.setBackground(new java.awt.Color(51, 51, 51));
        jBtnCancel.setForeground(new java.awt.Color(223, 197, 107));
        jBtnCancel.setText("Izađi");
        jBtnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 197, 107), 2, true));
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        jBtnEnableChanges.setBackground(new java.awt.Color(223, 197, 107));
        jBtnEnableChanges.setText("Omogući promene");
        jBtnEnableChanges.setBorder(null);
        jBtnEnableChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEnableChangesActionPerformed(evt);
            }
        });

        jBtnDelete.setBackground(new java.awt.Color(223, 197, 107));
        jBtnDelete.setText("Izbriši");
        jBtnDelete.setBorder(null);
        jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteActionPerformed(evt);
            }
        });

        jBtnUpdate.setBackground(new java.awt.Color(223, 197, 107));
        jBtnUpdate.setText("Ažuriraj");
        jBtnUpdate.setBorder(null);
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });

        jBtnUbaciNovog.setBackground(new java.awt.Color(223, 197, 107));
        jBtnUbaciNovog.setText("Ubaci novu otpremnicu");
        jBtnUbaciNovog.setBorder(null);
        jBtnUbaciNovog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUbaciNovogActionPerformed(evt);
            }
        });

        jbtnsacuvaj.setBackground(new java.awt.Color(223, 197, 107));
        jbtnsacuvaj.setForeground(new java.awt.Color(51, 51, 51));
        jbtnsacuvaj.setText("Sacuvaj");
        jbtnsacuvaj.setBorder(null);
        jbtnsacuvaj.setBorderPainted(false);
        jbtnsacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsacuvajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnsacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jBtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jBtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jBtnEnableChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jBtnUbaciNovog, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnsacuvaj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jBtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnEnableChanges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnUbaciNovog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTblIzmene.setBackground(new java.awt.Color(51, 51, 51));
        jTblIzmene.setForeground(new java.awt.Color(223, 197, 107));
        jTblIzmene.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTblIzmene);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtblnosnjeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblnosnjeMouseClicked
        
    }//GEN-LAST:event_jtblnosnjeMouseClicked

    private void jbtndodajstavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndodajstavkuActionPerformed
        
    }//GEN-LAST:event_jbtndodajstavkuActionPerformed

    private void jbrnobrisistavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrnobrisistavkuActionPerformed
        
    }//GEN-LAST:event_jbrnobrisistavkuActionPerformed

    private void jbtnsacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsacuvajActionPerformed
        
    }//GEN-LAST:event_jbtnsacuvajActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnCancelActionPerformed

    private void jBtnEnableChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEnableChangesActionPerformed

    }//GEN-LAST:event_jBtnEnableChangesActionPerformed

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed

    }//GEN-LAST:event_jBtnDeleteActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed

    }//GEN-LAST:event_jBtnUpdateActionPerformed

    private void jBtnUbaciNovogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUbaciNovogActionPerformed

    }//GEN-LAST:event_jBtnUbaciNovogActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnEnableChanges;
    private javax.swing.JButton jBtnUbaciNovog;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTblIzmene;
    private javax.swing.JButton jbrnobrisistavku;
    private javax.swing.JButton jbtndodajstavku;
    private javax.swing.JButton jbtnsacuvaj;
    private javax.swing.JComboBox<domain.Clan> jcmbPrimalac;
    private javax.swing.JTable jtblnosnje;
    private javax.swing.JTable jtblotpremnica;
    private javax.swing.JTextField jtxtdatumkreiranja;
    private javax.swing.JTextField jtxtizdavac;
    private javax.swing.JTextField jtxtkolicina;
    private javax.swing.JTextField jtxtnazivnosnje;
    private javax.swing.JTextField jtxtsifra;
    private javax.swing.JTextField jtxtsifranosnje;
    private javax.swing.JTextField jtxtvrstaNosnje;
    // End of variables declaration//GEN-END:variables

    public void addButtonObrisiStavkuListener(ActionListener ae){
        jbrnobrisistavku.addActionListener(ae);
    }
    
    public void addButtonDodajStavkuListener(ActionListener ae){
        jbtndodajstavku.addActionListener(ae);
    }
    
    public void addButtonSacuvajListener(ActionListener ae){
        jbtnsacuvaj.addActionListener(ae);
    }
    
    public void addButtonUpdateListener(ActionListener ae){
        jBtnUpdate.addActionListener(ae);
    }
    public void addButtonDeleteListener(ActionListener ae){
        jBtnDelete.addActionListener(ae);
    }
    
    public void addButtonEnableChangesListener(ActionListener ae){
        jBtnEnableChanges.addActionListener(ae);
    }
    
    public void addButtonUbaciNovogListener(ActionListener ae){
        jBtnUbaciNovog.addActionListener(ae);
    }
    
    public void addButtonCancelListener(ActionListener ae){
        jBtnCancel.addActionListener(ae);
    }
    
    public void addMouseClickedTable(MouseListener ae){
        jtblnosnje.addMouseListener(ae);
    }
    
    public javax.swing.JButton getJbrnobrisistavku() {
        return jbrnobrisistavku;
    }

    public void setJbrnobrisistavku(javax.swing.JButton jbrnobrisistavku) {
        this.jbrnobrisistavku = jbrnobrisistavku;
    }

    public javax.swing.JButton getJbtndodajstavku() {
        return jbtndodajstavku;
    }

    public void setJbtndodajstavku(javax.swing.JButton jbtndodajstavku) {
        this.jbtndodajstavku = jbtndodajstavku;
    }

    public javax.swing.JButton getJbtnsacuvaj() {
        return jbtnsacuvaj;
    }

    public void setJbtnsacuvaj(javax.swing.JButton jbtnsacuvaj) {
        this.jbtnsacuvaj = jbtnsacuvaj;
    }

    public javax.swing.JComboBox<domain.Clan> getJcmbPrimalac() {
        return jcmbPrimalac;
    }

    public void setJcmbPrimalac(javax.swing.JComboBox<domain.Clan> jcmbPrimalac) {
        this.jcmbPrimalac = jcmbPrimalac;
    }

    public javax.swing.JTable getJtblnosnje() {
        return jtblnosnje;
    }

    public void setJtblnosnje(javax.swing.JTable jtblnosnje) {
        this.jtblnosnje = jtblnosnje;
    }

    public javax.swing.JTable getJtblotpremnica() {
        return jtblotpremnica;
    }

    public void setJtblotpremnica(javax.swing.JTable jtblotpremnica) {
        this.jtblotpremnica = jtblotpremnica;
    }

    public javax.swing.JTextField getJtxtdatumkreiranja() {
        return jtxtdatumkreiranja;
    }

    public void setJtxtdatumkreiranja(javax.swing.JTextField jtxtdatumkreiranja) {
        this.jtxtdatumkreiranja = jtxtdatumkreiranja;
    }

    public javax.swing.JTextField getJtxtizdavac() {
        return jtxtizdavac;
    }

    public void setJtxtizdavac(javax.swing.JTextField jtxtizdavac) {
        this.jtxtizdavac = jtxtizdavac;
    }

    public javax.swing.JTextField getJtxtkolicina() {
        return jtxtkolicina;
    }

    public void setJtxtkolicina(javax.swing.JTextField jtxtkolicina) {
        this.jtxtkolicina = jtxtkolicina;
    }

    public javax.swing.JTextField getJtxtnazivnosnje() {
        return jtxtnazivnosnje;
    }

    public void setJtxtnazivnosnje(javax.swing.JTextField jtxtnazivnosnje) {
        this.jtxtnazivnosnje = jtxtnazivnosnje;
    }

    public javax.swing.JTextField getJtxtsifra() {
        return jtxtsifra;
    }

    public void setJtxtsifra(javax.swing.JTextField jtxtsifra) {
        this.jtxtsifra = jtxtsifra;
    }

    public javax.swing.JTextField getJtxtsifranosnje() {
        return jtxtsifranosnje;
    }

    public void setJtxtsifranosnje(javax.swing.JTextField jtxtsifranosnje) {
        this.jtxtsifranosnje = jtxtsifranosnje;
    }

    public javax.swing.JTextField getJtxtvrstaNosnje() {
        return jtxtvrstaNosnje;
    }

    public void setJtxtvrstaNosnje(javax.swing.JTextField jtxtvrstaNosnje) {
        this.jtxtvrstaNosnje = jtxtvrstaNosnje;
    }

    public javax.swing.JButton getjBtnCancel() {
        return jBtnCancel;
    }

    public void setjBtnCancel(javax.swing.JButton jBtnCancel) {
        this.jBtnCancel = jBtnCancel;
    }

    public javax.swing.JButton getjBtnDelete() {
        return jBtnDelete;
    }

    public void setjBtnDelete(javax.swing.JButton jBtnDelete) {
        this.jBtnDelete = jBtnDelete;
    }

    public javax.swing.JButton getjBtnEnableChanges() {
        return jBtnEnableChanges;
    }

    public void setjBtnEnableChanges(javax.swing.JButton jBtnEnableChanges) {
        this.jBtnEnableChanges = jBtnEnableChanges;
    }

    public javax.swing.JButton getjBtnUbaciNovog() {
        return jBtnUbaciNovog;
    }

    public void setjBtnUbaciNovog(javax.swing.JButton jBtnUbaciNovog) {
        this.jBtnUbaciNovog = jBtnUbaciNovog;
    }

    public javax.swing.JButton getjBtnUpdate() {
        return jBtnUpdate;
    }

    public void setjBtnUpdate(javax.swing.JButton jBtnUpdate) {
        this.jBtnUpdate = jBtnUpdate;
    }

    public javax.swing.JTable getjTblIzmene() {
        return jTblIzmene;
    }

    public void setjTblIzmene(javax.swing.JTable jTblIzmene) {
        this.jTblIzmene = jTblIzmene;
    }

    

    
   
}
