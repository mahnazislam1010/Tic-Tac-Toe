
import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class Form1 extends javax.swing.JFrame {

    /**
     * Creates new form Form1
     */
    static int milliseconds = 0;
    static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;
    static boolean state = true;

    int turn = 2;
    int buttonused[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int flag = 0;

    public void checkDraw() {
        boolean empty = true;
        for (int i = 0; i < 9; i++) {
            if (buttonused[i] == 0) {
                empty = false;
                break;
            }
        }
        if (empty) {
            state = false;
            JOptionPane.showMessageDialog(this, "DRAW", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void check() {
        String b1 = box1.getText();
        String b2 = box2.getText();
        String b3 = box3.getText();
        String b4 = box4.getText();
        String b5 = box5.getText();
        String b6 = box6.getText();
        String b7 = box7.getText();
        String b8 = box8.getText();
        String b9 = box9.getText();
        //////////////////////XXXXXXXXXXXXXXXX///////////////////

        if (b1 == "X" && b2 == "X" && b3 == "X") {
            box1.setBackground(Color.YELLOW);
            box2.setBackground(Color.YELLOW);
            box3.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player X wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;

        }

        if (b4 == "X" && b5 == "X" && b6 == "X") {
            box4.setBackground(Color.YELLOW);
            box5.setBackground(Color.YELLOW);
            box6.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player X wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b7 == "X" && b8 == "X" && b9 == "X") {
            box7.setBackground(Color.YELLOW);
            box8.setBackground(Color.YELLOW);
            box9.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player X wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b1 == "X" && b4 == "X" && b7 == "X") {
            box1.setBackground(Color.YELLOW);
            box4.setBackground(Color.YELLOW);
            box7.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player X wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b2 == "X" && b5 == "X" && b8 == "X") {
            box2.setBackground(Color.YELLOW);
            box5.setBackground(Color.YELLOW);
            box8.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player X wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b3 == "X" && b6 == "X" && b9 == "X") {
            box3.setBackground(Color.YELLOW);
            box6.setBackground(Color.YELLOW);
            box9.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player X wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b1 == "X" && b5 == "X" && b9 == "X") {
            box1.setBackground(Color.YELLOW);
            box5.setBackground(Color.YELLOW);
            box9.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player X wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b3 == "X" && b5 == "X" && b7 == "X") {
            box3.setBackground(Color.YELLOW);
            box5.setBackground(Color.YELLOW);
            box7.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player X wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        ////////////////OOOOOOOOOO////////////
        if (b1 == "O" && b2 == "O" && b3 == "O") {
            box1.setBackground(Color.YELLOW);
            box2.setBackground(Color.YELLOW);
            box3.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player O wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b4 == "O" && b5 == "O" && b6 == "O") {
            box4.setBackground(Color.YELLOW);
            box5.setBackground(Color.YELLOW);
            box6.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player O wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b7 == "O" && b8 == "O" && b9 == "O") {
            box7.setBackground(Color.YELLOW);
            box8.setBackground(Color.YELLOW);
            box9.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player O wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b1 == "O" && b4 == "O" && b7 == "O") {
            box1.setBackground(Color.YELLOW);
            box4.setBackground(Color.YELLOW);
            box7.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player O wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b2 == "O" && b5 == "O" && b8 == "O") {
            box2.setBackground(Color.YELLOW);
            box5.setBackground(Color.YELLOW);
            box8.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player O wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b3 == "O" && b6 == "O" && b9 == "O") {
            box3.setBackground(Color.YELLOW);
            box6.setBackground(Color.YELLOW);
            box9.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player O wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b1 == "O" && b5 == "YO" && b9 == "O") {
            box1.setBackground(Color.YELLOW);
            box5.setBackground(Color.YELLOW);
            box9.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player O wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

        if (b3 == "O" && b5 == "O" && b7 == "O") {
            box3.setBackground(Color.YELLOW);
            box5.setBackground(Color.YELLOW);
            box7.setBackground(Color.YELLOW);
            state = false;
            JOptionPane.showMessageDialog(this, "Player O wins.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            flag = 1;
        }

    }

    public Form1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        box1 = new javax.swing.JButton();
        box2 = new javax.swing.JButton();
        box3 = new javax.swing.JButton();
        box4 = new javax.swing.JButton();
        box5 = new javax.swing.JButton();
        box6 = new javax.swing.JButton();
        box7 = new javax.swing.JButton();
        box8 = new javax.swing.JButton();
        box9 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        playAgain = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        millisecond = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        box1.setBackground(new java.awt.Color(128, 128, 128));
        box1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        getContentPane().add(box1);
        box1.setBounds(30, 110, 73, 80);

        box2.setBackground(new java.awt.Color(128, 128, 128));
        box2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });
        getContentPane().add(box2);
        box2.setBounds(130, 110, 80, 80);

        box3.setBackground(new java.awt.Color(128, 128, 128));
        box3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });
        getContentPane().add(box3);
        box3.setBounds(240, 110, 70, 80);

        box4.setBackground(new java.awt.Color(128, 128, 128));
        box4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box4ActionPerformed(evt);
            }
        });
        getContentPane().add(box4);
        box4.setBounds(30, 210, 70, 70);

        box5.setBackground(new java.awt.Color(128, 128, 128));
        box5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        box5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box5ActionPerformed(evt);
            }
        });
        getContentPane().add(box5);
        box5.setBounds(130, 210, 80, 70);

        box6.setBackground(new java.awt.Color(128, 128, 128));
        box6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        box6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box6ActionPerformed(evt);
            }
        });
        getContentPane().add(box6);
        box6.setBounds(240, 210, 73, 70);

        box7.setBackground(new java.awt.Color(128, 128, 128));
        box7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        box7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box7ActionPerformed(evt);
            }
        });
        getContentPane().add(box7);
        box7.setBounds(30, 310, 70, 70);

        box8.setBackground(new java.awt.Color(128, 128, 128));
        box8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        box8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box8ActionPerformed(evt);
            }
        });
        getContentPane().add(box8);
        box8.setBounds(130, 310, 80, 70);

        box9.setBackground(new java.awt.Color(128, 128, 128));
        box9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        box9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box9ActionPerformed(evt);
            }
        });
        getContentPane().add(box9);
        box9.setBounds(240, 310, 70, 70);

        exitButton.setBackground(new java.awt.Color(153, 153, 153));
        exitButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exitButton.setForeground(new java.awt.Color(204, 0, 0));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(460, 340, 120, 50);

        playAgain.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        playAgain.setForeground(new java.awt.Color(204, 0, 0));
        playAgain.setText("Play Again");
        playAgain.setToolTipText("");
        playAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainActionPerformed(evt);
            }
        });
        getContentPane().add(playAgain);
        playAgain.setBounds(420, 270, 200, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("TIC TAC TOE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, -10, 320, 70);

        hour.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        hour.setText("00 :");
        getContentPane().add(hour);
        hour.setBounds(340, 60, 80, 50);

        minute.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        minute.setText("00 :");
        getContentPane().add(minute);
        minute.setBounds(420, 60, 80, 50);

        second.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        second.setText("00 :");
        getContentPane().add(second);
        second.setBounds(510, 60, 80, 50);

        millisecond.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        millisecond.setText("00 ");
        getContentPane().add(millisecond);
        millisecond.setBounds(610, 60, 90, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Time:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 0, 90, 60);

        start.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        start.setForeground(new java.awt.Color(204, 0, 0));
        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start);
        start.setBounds(100, 60, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tt.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box9ActionPerformed
        if (buttonused[8] == 0) {
            if (turn % 2 == 0) {
                turn++;
                box9.setText("X");
                buttonused[8] = 1;
            } else {
                turn++;
                box9.setText("O");
                buttonused[8] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Box can't be overwritten!");
        }
        check();
        if (flag == 0) {
            checkDraw();
        }
    }//GEN-LAST:event_box9ActionPerformed

    private void box4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box4ActionPerformed
        if (buttonused[3] == 0) {
            if (turn % 2 == 0) {
                turn++;
                box4.setText("X");
                buttonused[3] = 1;
            } else {
                turn++;
                box4.setText("O");
                buttonused[3] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Box can't be overwritten!");
        }
        check();
        if (flag == 0) {
            checkDraw();
        }
    }//GEN-LAST:event_box4ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box3ActionPerformed
        if (buttonused[2] == 0) {
            if (turn % 2 == 0) {
                turn++;
                box3.setText("X");
                buttonused[2] = 1;
            } else {
                turn++;
                box3.setText("O");
                buttonused[2] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Box can't be overwritten!");
        }
        check();
        if (flag == 0) {
            checkDraw();
        }
    }//GEN-LAST:event_box3ActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        if (buttonused[0] == 0) {
            if (turn % 2 == 0) {
                turn++;
                box1.setText("X");
                buttonused[0] = 1;
            } else {
                turn++;
                box1.setText("O");
                buttonused[0] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Box can't be overwritten!");
        }
        check();
        if (flag == 0) {
            checkDraw();
        }
    }//GEN-LAST:event_box1ActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
        if (buttonused[1] == 0) {
            if (turn % 2 == 0) {
                turn++;
                box2.setText("X");
                buttonused[1] = 1;
            } else {
                turn++;
                box2.setText("O");
                buttonused[1] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Box can't be overwritten!");
        }
        check();
        if (flag == 0) {
            checkDraw();
        }
    }//GEN-LAST:event_box2ActionPerformed

    private void box5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box5ActionPerformed
        if (buttonused[4] == 0) {
            if (turn % 2 == 0) {
                turn++;
                box5.setText("X");
                buttonused[4] = 1;
            } else {
                turn++;
                box5.setText("O");
                buttonused[4] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Box can't be overwritten!");
        }
        check();
        if (flag == 0) {
            checkDraw();
        }
    }//GEN-LAST:event_box5ActionPerformed

    private void box6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box6ActionPerformed
        if (buttonused[5] == 0) {
            if (turn % 2 == 0) {
                turn++;
                box6.setText("X");
                buttonused[5] = 1;
            } else {
                turn++;
                box6.setText("O");
                buttonused[5] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Box can't be overwritten!");
        }
        check();
        if (flag == 0) {
            checkDraw();
        }
    }//GEN-LAST:event_box6ActionPerformed

    private void box7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box7ActionPerformed
        if (buttonused[6] == 0) {
            if (turn % 2 == 0) {
                turn++;
                box7.setText("X");
                buttonused[6] = 1;
            } else {
                turn++;
                box7.setText("O");
                buttonused[6] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Box can't be overwritten!");
        }
        check();
        if (flag == 0) {
            checkDraw();
        }
    }//GEN-LAST:event_box7ActionPerformed

    private void box8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box8ActionPerformed
        if (buttonused[7] == 0) {
            if (turn % 2 == 0) {
                turn++;
                box8.setText("X");
                buttonused[7] = 1;
            } else {
                turn++;
                box8.setText("O");
                buttonused[7] = 1;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "This Box can't be overwritten!");
        }
        check();
        if (flag == 0) {
            checkDraw();
        }
    }//GEN-LAST:event_box8ActionPerformed

    private void playAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainActionPerformed
        box1.setText("");
        box2.setText("");
        box3.setText("");
        box4.setText("");
        box5.setText("");
        box6.setText("");
        box7.setText("");
        box8.setText("");
        box9.setText("");

        turn = 2;
        flag = 0;
        for (int i = 0; i < 9; i++) {
            buttonused[i] = 0;
        }
        box1.setBackground(Color.GRAY);
        box2.setBackground(Color.GRAY);
        box3.setBackground(Color.GRAY);
        box4.setBackground(Color.GRAY);
        box5.setBackground(Color.GRAY);
        box6.setBackground(Color.GRAY);
        box7.setBackground(Color.GRAY);
        box8.setBackground(Color.GRAY);
        box9.setBackground(Color.GRAY);

        state = false;

        hours = 0;
        minutes = 0;
        seconds = 0;
        milliseconds = 0;

        hour.setText("00 : ");
        minute.setText("00 : ");
        second.setText("00 : ");
        millisecond.setText("00");


    }//GEN-LAST:event_playAgainActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        state = true;
        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    if (state == true) {
                        try {
                            sleep(1);
                            if (milliseconds > 1000) {
                                milliseconds = 0;
                                seconds++;
                            }

                            if (seconds > 60) {
                                milliseconds = 0;
                                seconds = 0;
                                minutes++;
                            }

                            if (minutes > 60) {
                                milliseconds = 0;
                                seconds = 0;
                                minutes = 0;
                                hours++;
                            }

                            millisecond.setText(" : " + milliseconds);

                            milliseconds++;
                            second.setText(" : " + seconds);
                            minute.setText(" : " + minutes);
                            hour.setText(" : " + hours);
                        } catch (Exception e) {

                        }
                    } else {
                        break;
                    }
                }
            }
        };
        t.start();

    }//GEN-LAST:event_startActionPerformed

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton box1;
    private javax.swing.JButton box2;
    private javax.swing.JButton box3;
    private javax.swing.JButton box4;
    private javax.swing.JButton box5;
    private javax.swing.JButton box6;
    private javax.swing.JButton box7;
    private javax.swing.JButton box8;
    private javax.swing.JButton box9;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel hour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel millisecond;
    private javax.swing.JLabel minute;
    private javax.swing.JButton playAgain;
    private javax.swing.JLabel second;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
