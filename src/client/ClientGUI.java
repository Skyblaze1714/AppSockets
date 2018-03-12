/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import commons.*;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class ClientGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClientGUI1
     */
    public ClientGUI() {
        initComponents();
        /*try{
            refreshQuizzes();
        } catch(Exception ex){
            
        }*/
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addQuizAnswers = new javax.swing.ButtonGroup();
        quizAnswers = new javax.swing.ButtonGroup();
        TabbedPane = new javax.swing.JTabbedPane();
        home = new javax.swing.JPanel();
        refreshButton = new javax.swing.JButton();
        quizListContainer = new javax.swing.JScrollPane();
        quizList = new javax.swing.JList<String>();
        takeQuizButton = new javax.swing.JButton();
        takeQuizErrorLabel = new javax.swing.JLabel();
        addQuizTab = new javax.swing.JPanel();
        instructionsLabel = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        questionText = new javax.swing.JTextField();
        authorLabel = new javax.swing.JLabel();
        authorText = new javax.swing.JTextField();
        answersLabel = new javax.swing.JLabel();
        answerButton1 = new javax.swing.JRadioButton();
        answerText1 = new javax.swing.JTextField();
        answerButton2 = new javax.swing.JRadioButton();
        answerText2 = new javax.swing.JTextField();
        answerButton3 = new javax.swing.JRadioButton();
        answerText3 = new javax.swing.JTextField();
        answerButton4 = new javax.swing.JRadioButton();
        answerText4 = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        submitErrorLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        quizTab = new javax.swing.JPanel();
        quizLabel = new javax.swing.JLabel();
        quizQuestion = new javax.swing.JLabel();
        quizAuthor = new javax.swing.JLabel();
        quizAnswerButton1 = new javax.swing.JRadioButton();
        quizAnswerText1 = new javax.swing.JTextField();
        quizAnswerButton2 = new javax.swing.JRadioButton();
        quizAnswerText2 = new javax.swing.JTextField();
        quizAnswerButton3 = new javax.swing.JRadioButton();
        quizAnswerText3 = new javax.swing.JTextField();
        quizAnswerButton4 = new javax.swing.JRadioButton();
        quizAnswerText4 = new javax.swing.JTextField();
        quizConfirm = new javax.swing.JButton();
        correctLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(415, 400));

        home.setBackground(new java.awt.Color(255, 255, 255));

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        quizListContainer.setBorder(null);

        quizList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Theres no quiz available", "Try to refresh" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        quizList.setEnabled(false);
        quizListContainer.setViewportView(quizList);

        takeQuizButton.setText("Take quiz!");
        takeQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeQuizButtonActionPerformed(evt);
            }
        });

        takeQuizErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        takeQuizErrorLabel.setToolTipText("");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quizListContainer)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addComponent(takeQuizButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(takeQuizErrorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addComponent(refreshButton)))
                .addContainerGap())
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton)
                    .addComponent(takeQuizButton)
                    .addComponent(takeQuizErrorLabel))
                .addGap(12, 12, 12)
                .addComponent(quizListContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPane.addTab("Home", home);

        addQuizTab.setBackground(new java.awt.Color(255, 255, 255));

        instructionsLabel.setFont(new java.awt.Font("Tele-Marines", 0, 18)); // NOI18N
        instructionsLabel.setText("Write down your Quiz");

        questionLabel.setText("Question :");

        questionText.setToolTipText("Write your question here");

        authorLabel.setText("Author :");

        authorText.setToolTipText("Write your question here");

        answersLabel.setText("Answers :");

        answerButton1.setBackground(new java.awt.Color(255, 255, 255));
        addQuizAnswers.add(answerButton1);
        answerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButton1ActionPerformed(evt);
            }
        });

        answerText1.setText("Risposta 1");
        answerText1.setToolTipText("");

        answerButton2.setBackground(new java.awt.Color(255, 255, 255));
        addQuizAnswers.add(answerButton2);
        answerButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButton2ActionPerformed(evt);
            }
        });

        answerText2.setText("Risposta 2");

        answerButton3.setBackground(new java.awt.Color(255, 255, 255));
        addQuizAnswers.add(answerButton3);
        answerButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButton3ActionPerformed(evt);
            }
        });

        answerText3.setText("Risposta 3");

        answerButton4.setBackground(new java.awt.Color(255, 255, 255));
        addQuizAnswers.add(answerButton4);
        answerButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButton4ActionPerformed(evt);
            }
        });

        answerText4.setText("Risposta 4");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        submitErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        submitErrorLabel.setToolTipText("");

        javax.swing.GroupLayout addQuizTabLayout = new javax.swing.GroupLayout(addQuizTab);
        addQuizTab.setLayout(addQuizTabLayout);
        addQuizTabLayout.setHorizontalGroup(
            addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addQuizTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addQuizTabLayout.createSequentialGroup()
                        .addComponent(questionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addQuizTabLayout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitErrorLabel))
                    .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addQuizTabLayout.createSequentialGroup()
                            .addComponent(authorLabel)
                            .addGap(14, 14, 14)
                            .addComponent(authorText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(instructionsLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addQuizTabLayout.createSequentialGroup()
                            .addComponent(answerButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(answerText2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addQuizTabLayout.createSequentialGroup()
                            .addComponent(answerButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(answerText1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addQuizTabLayout.createSequentialGroup()
                            .addComponent(answerButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(answerText3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addQuizTabLayout.createSequentialGroup()
                            .addComponent(answerButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(answerText4)))
                    .addComponent(answersLabel))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        addQuizTabLayout.setVerticalGroup(
            addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addQuizTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instructionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(questionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorLabel))
                .addGap(18, 18, 18)
                .addComponent(answersLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerButton1)
                    .addComponent(answerText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerButton2)
                    .addComponent(answerText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerButton3)
                    .addComponent(answerText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerButton4)
                    .addComponent(answerText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(submitErrorLabel))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Add Quiz!", addQuizTab);

        quizTab.setBackground(new java.awt.Color(255, 255, 255));

        quizLabel.setFont(new java.awt.Font("Tele-Marines", 0, 18)); // NOI18N
        quizLabel.setText("answer to the quiz");

        quizQuestion.setText("(domanda visualizzata qua) ");

        quizAuthor.setText("Made by ");

        quizAnswerButton1.setBackground(new java.awt.Color(255, 255, 255));
        quizAnswers.add(quizAnswerButton1);
        quizAnswerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizAnswerButton1ActionPerformed(evt);
            }
        });

        quizAnswerText1.setText("Risposta 1");
        quizAnswerText1.setToolTipText("");

        quizAnswerButton2.setBackground(new java.awt.Color(255, 255, 255));
        quizAnswers.add(quizAnswerButton2);
        quizAnswerButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizAnswerButton2ActionPerformed(evt);
            }
        });

        quizAnswerText2.setText("Risposta 2");

        quizAnswerButton3.setBackground(new java.awt.Color(255, 255, 255));
        quizAnswers.add(quizAnswerButton3);
        quizAnswerButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizAnswerButton3ActionPerformed(evt);
            }
        });

        quizAnswerText3.setText("Risposta 3");

        quizAnswerButton4.setBackground(new java.awt.Color(255, 255, 255));
        quizAnswers.add(quizAnswerButton4);
        quizAnswerButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizAnswerButton4ActionPerformed(evt);
            }
        });

        quizAnswerText4.setText("Risposta 4");

        quizConfirm.setText("Confirm");
        quizConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizConfirmActionPerformed(evt);
            }
        });

        correctLabel.setText("Risposta corretta!");

        javax.swing.GroupLayout quizTabLayout = new javax.swing.GroupLayout(quizTab);
        quizTab.setLayout(quizTabLayout);
        quizTabLayout.setHorizontalGroup(
            quizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quizTabLayout.createSequentialGroup()
                .addGroup(quizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quizQuestion)
                    .addGroup(quizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(quizTabLayout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(quizLabel))
                        .addGroup(quizTabLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(quizAuthor))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quizTabLayout.createSequentialGroup()
                .addGap(0, 61, Short.MAX_VALUE)
                .addGroup(quizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, quizTabLayout.createSequentialGroup()
                        .addComponent(quizAnswerButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quizAnswerText2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, quizTabLayout.createSequentialGroup()
                        .addComponent(quizAnswerButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quizAnswerText1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, quizTabLayout.createSequentialGroup()
                        .addComponent(quizAnswerButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quizAnswerText3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, quizTabLayout.createSequentialGroup()
                        .addComponent(quizAnswerButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quizAnswerText4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quizTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(quizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quizTabLayout.createSequentialGroup()
                        .addComponent(correctLabel)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quizTabLayout.createSequentialGroup()
                        .addComponent(quizConfirm)
                        .addGap(163, 163, 163))))
        );
        quizTabLayout.setVerticalGroup(
            quizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quizTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quizLabel)
                .addGap(27, 27, 27)
                .addComponent(quizQuestion)
                .addGap(18, 18, 18)
                .addGroup(quizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quizAnswerButton1)
                    .addComponent(quizAnswerText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quizAnswerButton2)
                    .addComponent(quizAnswerText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quizAnswerButton3)
                    .addComponent(quizAnswerText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quizAnswerButton4)
                    .addComponent(quizAnswerText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(quizConfirm)
                .addGap(15, 15, 15)
                .addComponent(correctLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quizAuthor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        correctLabel.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quizTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quizTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, Short.MAX_VALUE)
        );

        TabbedPane.addTab("Quiz", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refreshQuizzes();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void takeQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeQuizButtonActionPerformed
        int selectedQuiz = quizList.getSelectedIndex();
        
        if(selectedQuiz < 0){
            takeQuizErrorLabel.setText("Select a quiz first");
        }
        else{
            takeQuizErrorLabel.setText("");
            quizAnswerText1.setText(quizzes[selectedQuiz].getAnswers()[0]);
            quizAnswerText2.setText(quizzes[selectedQuiz].getAnswers()[1]);
            quizAnswerText3.setText(quizzes[selectedQuiz].getAnswers()[2]);
            quizAnswerText4.setText(quizzes[selectedQuiz].getAnswers()[3]);
            
        }
    }//GEN-LAST:event_takeQuizButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if(
            !questionText.getText().equals("") &&
            !authorText.getText().equals("") &&
            !answerText1.getText().equals("") &&
            !answerText2.getText().equals("") &&
            !answerText3.getText().equals("") &&
            !answerText4.getText().equals("") &&
            addQuizCorrectAnswer != 0
        ){
            String[] answers = {
                answerText1.getText(),
                answerText2.getText(),
                answerText3.getText(),
                answerText4.getText()
            };
            Quiz quiz = new Quiz(
                questionText.getText(),
                authorText.getText(),
                answers,
                addQuizCorrectAnswer
            );
            
            System.out.println(questionText.getText());
            
            if(quiz.equals(lastSubmittedQuiz)) {
                submitErrorLabel.setText("You have already submitted this quiz");
                return;
            }
            
            new ClientSocketManager().run(new Message("postQuiz", quiz));
            
            lastSubmittedQuiz = quiz;
            submitErrorLabel.setText("");
            return;
        }
        else{
            submitErrorLabel.setText("All the text fields must be filled");
            return;
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void answerButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButton4ActionPerformed
        addQuizCorrectAnswer = 4;
    }//GEN-LAST:event_answerButton4ActionPerformed

    private void answerButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButton3ActionPerformed
        addQuizCorrectAnswer = 3;
    }//GEN-LAST:event_answerButton3ActionPerformed

    private void answerButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButton2ActionPerformed
        addQuizCorrectAnswer = 2;
    }//GEN-LAST:event_answerButton2ActionPerformed

    private void answerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButton1ActionPerformed
        addQuizCorrectAnswer = 1;
    }//GEN-LAST:event_answerButton1ActionPerformed

    private void quizAnswerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizAnswerButton1ActionPerformed
        currentSelectedAnswer = 1;
    }//GEN-LAST:event_quizAnswerButton1ActionPerformed

    private void quizAnswerButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizAnswerButton2ActionPerformed
        currentSelectedAnswer = 2;
    }//GEN-LAST:event_quizAnswerButton2ActionPerformed

    private void quizAnswerButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizAnswerButton3ActionPerformed
        currentSelectedAnswer = 3;
    }//GEN-LAST:event_quizAnswerButton3ActionPerformed

    private void quizAnswerButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizAnswerButton4ActionPerformed
        currentSelectedAnswer = 4;
    }//GEN-LAST:event_quizAnswerButton4ActionPerformed

    private void quizConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizConfirmActionPerformed

    if(currentSelectedAnswer != 0){
            if(quizzes[0].getCorrectAnswer() == currentSelectedAnswer){
                correctLabel.setText("Risposta Corretta!"); 
                correctLabel.setVisible(true);
            }            
            else
            {
            correctLabel.setVisible(false);
            }
    }
        
    }//GEN-LAST:event_quizConfirmActionPerformed

    
    /**
     * Aggiorna la lista dei quiz
     */
    private void refreshQuizzes(){
        System.out.println("client: refreshing quiz list");
        
        //Richiesta al server della lista dei quiz
        ClientSocketManager test = new ClientSocketManager();
        quizzes = (Quiz[]) test.run(new Message()).content;
        
        //Creaziona di un array di stringhe per la rappresentazione grafica dei quiz
        final String[] quizzesStrings = new String[quizzes.length];
        
        if(quizzes.length > 0) {
            quizList.setEnabled(true);
            
            for(int i = 0; i < quizzes.length; i++){
                quizzesStrings[i] = (i + 1) + " - " + quizzes[i].getQuestion();
            }
        }
        else {
            quizList.setEnabled(false);
            quizzesStrings[0] = "";
            quizzesStrings[1] = "";
        }
        
        //Aggiornamento della lista dei quiz
        quizList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = quizzesStrings.clone();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Imposta il look and feel di sistema */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
            /*
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            */
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.ButtonGroup addQuizAnswers;
    private javax.swing.JPanel addQuizTab;
    private javax.swing.JRadioButton answerButton1;
    private javax.swing.JRadioButton answerButton2;
    private javax.swing.JRadioButton answerButton3;
    private javax.swing.JRadioButton answerButton4;
    private javax.swing.JTextField answerText1;
    private javax.swing.JTextField answerText2;
    private javax.swing.JTextField answerText3;
    private javax.swing.JTextField answerText4;
    private javax.swing.JLabel answersLabel;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorText;
    private javax.swing.JLabel correctLabel;
    private javax.swing.JPanel home;
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JTextField questionText;
    private javax.swing.JRadioButton quizAnswerButton1;
    private javax.swing.JRadioButton quizAnswerButton2;
    private javax.swing.JRadioButton quizAnswerButton3;
    private javax.swing.JRadioButton quizAnswerButton4;
    private javax.swing.JTextField quizAnswerText1;
    private javax.swing.JTextField quizAnswerText2;
    private javax.swing.JTextField quizAnswerText3;
    private javax.swing.JTextField quizAnswerText4;
    private javax.swing.ButtonGroup quizAnswers;
    private javax.swing.JLabel quizAuthor;
    private javax.swing.JButton quizConfirm;
    private javax.swing.JLabel quizLabel;
    private javax.swing.JList<String> quizList;
    private javax.swing.JScrollPane quizListContainer;
    private javax.swing.JLabel quizQuestion;
    private javax.swing.JPanel quizTab;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel submitErrorLabel;
    private javax.swing.JButton takeQuizButton;
    private javax.swing.JLabel takeQuizErrorLabel;
    // End of variables declaration//GEN-END:variables
    
    private Quiz[] quizzes;
    private Quiz lastSubmittedQuiz;
    private int addQuizCorrectAnswer = 0;
    private int currentSelectedAnswer = 0;
}
