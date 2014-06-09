package testtool.views.grader;
import testtool.models.userdb.*;
import testtool.models.testdb.*;
import testtool.models.grader.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
	 
import java.util.*;
	 

/**
 * @author Kevin Pham (kpham11@calpoly.edu)
 * @version 26apr14
 * 
 * View class for the Grader User Interface
 */

import java.util.*;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class GraderUI extends javax.swing.JFrame {
    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<String[]> answers = new ArrayList<String[]>();
    String[] kevinAns = {"True","False", "True", "True", "False"};
    String[] RJAns = {"False","True", "True", "True", "True"};
    String[] alvinAns = {"False","False", "True", "True", "True"};
    String[] grantAns = {"True","False", "True", "True", "False"};
    String[] yuliyaAns = {"False","False", "True", "False", "False"};
    String[] neilAns = {"True", "True", "True", "True", "True"};
    String[] correct = {"True", "True", "True", "True", "True"};
    private ArrayList<String> questions = new ArrayList<String>(); 
    
    DefaultListModel listModel, listModel2, listModel3, listModel4; 
    /**
     * Creates new form NewJFrame
     */
    public GraderUI() {
        initComponents();
        listModel = new DefaultListModel();
        listModel2 = new DefaultListModel();
        listModel3 = new DefaultListModel();
        listModel4 = new DefaultListModel();
        names.add("Kevin Pham");
        names.add("RJ Almada");
        names.add("Alvin Lam");
        names.add("Neil Nordhof");
        names.add("Grant Pickett");
        names.add("Yuliya Levitskaya");
        answers.add(kevinAns);
        answers.add(RJAns);
        answers.add(alvinAns);
        answers.add(neilAns);
        answers.add(grantAns);
        answers.add(yuliyaAns);
        
        questions.add("True or False: A function cannot be defined inside another function. (2 pts)");
        questions.add("True or False: Functions cannot return more than one value at a time. (2 pts)");
        questions.add("True or False: If return type for a function is not specified, it defaults to int. (2 pts)");
        questions.add("True or False: Functions can be called either by value or reference. (2 pts)");
        questions.add("True or False: A function may have any number of return statements each returning different values. (2 pts)");
        
        for(int i = 0; i< names.size(); i++) {
            listModel.addElement(names.get(i));
        }
        for(int i = 0; i < 5; i++)
        {
            listModel2.addElement("Question "+(i+1));
        }
        listOfNames.setModel(listModel);
        listOfQuestions.setModel(listModel2);
        listOfNames.setSelectedIndex(0);
        listOfQuestions.setSelectedIndex(0);
        setVisible(true);
       
    }
    
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listOfNames = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listOfQuestions = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        answerList = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        pointList = new javax.swing.JList();
        questionLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        finishButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listOfNames.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listOfNames.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listOfNamesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listOfNames);

        listOfQuestions.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listOfQuestions.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listOfQuestionsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listOfQuestions);

        answerList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(answerList);

        pointList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(pointList);

        questionLabel.setText("");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        finishButton.setText("Finish");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(337, 337, 337))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(saveButton)
                        .addGap(26, 26, 26)
                        .addComponent(finishButton)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                        .addComponent(jScrollPane4))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(finishButton)
                    .addComponent(exitButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>                        

    private void listOfNamesValueChanged(javax.swing.event.ListSelectionEvent evt) {                                         
        // TODO add your handling code here:
         int index = listOfNames.getSelectedIndex();
         //System.out.println(index);
         listModel3.clear();
         listModel4.clear();
         for(int i = 0; i < 5; i++) {
             listModel3.addElement((answers.get(index))[i]);
         }
         answerList.setModel(listModel3);
         
          for(int i = 0; i < 5; i++) {
            if((answers.get(index))[i] == correct[i]) {
                listModel4.addElement("2/2");
            }
            else {
                listModel4.addElement("0/2");
            }
        }
          pointList.setModel(listModel4);
    }                                        

    private void listOfQuestionsValueChanged(javax.swing.event.ListSelectionEvent evt) {                                             
        // TODO add your handling code here:
        int index = listOfQuestions.getSelectedIndex();
        questionLabel.setText(questions.get(index));
        answerList.setSelectedIndex(index);
        pointList.setSelectedIndex(index);
    }                                            

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        new ReleaseOptionsUI(new javax.swing.JFrame(), true).setVisible(true);
    }                                            

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
         dispose();
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
            java.util.logging.Logger.getLogger(GraderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraderUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JList answerList;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton finishButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList listOfNames;
    private javax.swing.JList listOfQuestions;
    private javax.swing.JList pointList;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton saveButton;
    // End of variables declaration                   
}

