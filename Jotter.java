    import javax.swing.*;
    import javax.swing.plaf.FontUIResource;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.io.*;
    import java.text.SimpleDateFormat;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;
    import java.util.Date;
    import java.util.logging.SimpleFormatter;

    public class Jotter {
        private static JFrame j;
        private static JTextArea type;
        private static JScrollPane n;
        private static JMenuBar jm;
        private static JMenu jn;
        private static JButton jp;
        private static JLabel date;
        private static JMenuItem ji;
        private static JMenuItem j2;
        private static File selectedFile;
        private static Reader reader;
        private static JMenuItem j3;
        private static JMenu jb2;
        private static JMenu jb3;
        private static JMenuItem j7;
        private static JMenu jc;
        private static JMenu jf;
        private static JMenuItem jf1;
        private static JMenuItem jf2;
        private static JMenuItem jf3;
        private static JMenuItem jf4;
        private static JMenuItem jf5;
        private static JMenuItem jf6;
        private static JMenuItem jf7;
        private static JMenuItem jf8;
        private static JMenuItem jf9;
        private static JMenuItem jf10;
        private static JMenu jt;
        private static JMenuItem jt1;
        private static JMenuItem jt2;
        private static JMenuItem jt3;
        private static JMenuItem jt4;
        private static JMenuItem jt5;
        private static JMenuItem jt6;
        private static JMenuItem jt7;
        private static JMenuItem jt8;
        private static JMenuItem jt9;
        private static JMenuItem jt10;
        private static JMenu fo;
        private static JMenuItem fo1;
        private static JMenuItem fo2;
        private static JMenu jb4;
        private static JMenuItem j8;
        private static JMenuItem j9;
        private static JMenu jb5;
        private static JMenuItem t;
        private static JMenuItem t1;
        public static void notepad(boolean aBoolean) {
            j = new JFrame("JOTTER");
            j.setSize(1000,700);
            j.setLocationRelativeTo(null);
            Font font2 = new Font("Monospace", Font.PLAIN, 18);
            UIManager.put("OptionPane.messageFont", new FontUIResource(font2));
            JFileChooser fileChooser = new JFileChooser();
            if (aBoolean == true) {
                j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            type = new JTextArea("  ");
            type.setCaretPosition(2);
            jm = new JMenuBar();
            j.setJMenuBar(jm);
            type.setForeground(Color.black);
            type.setCaretColor(Color.black);
            type.setBackground(Color.white);
            type.setFont(new Font("Monospace",Font.PLAIN,19));
            type.setBounds(0, 0, j.getWidth(), j.getHeight());
            n = new JScrollPane(type);
            n.setBorder(null);
            j.add(n);
            jn = new JMenu("File");
            jn.setFont(font2);
            jp = new JButton("?");
            jp.setFont(font2);
            jp.setBackground(new Color(176, 196, 222));
            jp.setFocusPainted(false);
            jp.setBorderPainted(false);
            jp.setBackground(new Color(127,216,190));
            jp.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(j, "HOW TO USE FEATURES: " + "\n" + "SHOW WHAT I HAVE TYPED:  " + "Feature>Show What I Have Typed" + "\n" + "CHANGE FONT COLOR:  " + "Feature>Customisation>Change Font Color" + "\n" + "CHANGE THE TEXT CURSOR:  " + "Feature>Customisation>Change Text Cursor Color" + "\n" + "CHANGE THE FONT SIZE:  " + "Edit>Font Size" + "\n" + "EXIT:  " + "Settings>Exit");
                }
            });
            jm.setBackground(new Color(127,216,190));
            date=new JLabel(LocalDate.now()+"   ");
            date.setFont(font2);
            ji = new JMenuItem("New Window");
            ji.setFont(font2);
            j2 = new JMenuItem("Open");
            j2.setFont(font2);
            j2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int returnValue = fileChooser.showOpenDialog(null);
                    if (returnValue == JFileChooser.APPROVE_OPTION) {
                        selectedFile = fileChooser.getSelectedFile();
                        try {
                            reader = new FileReader(selectedFile);
                            char arr[] = new char[(int) selectedFile.length()];
                            reader.read(arr);
                            String str = "";
                            for (char i : arr) {
                                str += i;
                            }
                            type.setText(str);
                            reader.close();
                        } catch (FileNotFoundException ex) {
                            throw new RuntimeException(ex);
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            });
            j3 = new JMenuItem("Save");
            j3.setFont(font2);
            j3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(j, "While Saving File Kindly Enter The File Type For Better Access Of File " + "\n" + "like .txt|.html|etc.", "Caution", JOptionPane.ERROR_MESSAGE);
                    String st = type.getText();
                    int returnValue = fileChooser.showSaveDialog(null);
                    if (returnValue == JFileChooser.APPROVE_OPTION) {
                        selectedFile = fileChooser.getSelectedFile();
                        try {
                            Writer writer = new FileWriter(selectedFile);
                            writer.write(st);
                            writer.close();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            });
            jn.add(ji);
            ji.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    notepad(false);
                }
            });
            jn.add(j2);
            jn.add(j3);
            jm.add(jn);
            jb2 = new JMenu("Edit");
            jb2.setFont(font2);
            jb3 = new JMenu("Features");
            jb3.setFont(font2);
            j7 = new JMenuItem("Show What I Have Typed");
            j7.setFont(font2);
            jc = new JMenu("Customisation");
            jc.setFont(font2);
            jf = new JMenu("Change Font Color");
            jf.setFont(font2);
            jf1 = new JMenuItem("Default");
            jf1.setFont(font2);
            jf2 = new JMenuItem("Red");
            jf2.setFont(font2);
            jf3 = new JMenuItem("Green");
            jf3.setFont(font2);
            jf4 = new JMenuItem("Orange");
            jf4.setFont(font2);
            jf5 = new JMenuItem("Magenta");
            jf5.setFont(font2);
            jf6 = new JMenuItem("Gray");
            jf6.setFont(font2);
            jf7 = new JMenuItem("Yellow");
            jf7.setFont(font2);
            jf8 = new JMenuItem("Blue");
            jf8.setFont(font2);
            jf9 = new JMenuItem("Pink");
            jf9.setFont(font2);
            jf10 = new JMenuItem("Cyan");
            jf10.setFont(font2);
            jf.add(jf1);
            jf1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (type.getBackground() == Color.white) {
                        type.setForeground(Color.black);
                    } else if (type.getBackground() == Color.black) {
                        type.setForeground(Color.white);
                    }
                }
            });
            jf.add(jf2);
            jf2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setForeground(Color.red);
                }
            });
            jf.add(jf3);
            jf3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setForeground(Color.green);
                }
            });
            jf.add(jf4);
            jf4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setForeground(Color.orange);
                }
            });
            jf.add(jf5);
            jf5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setForeground(Color.magenta);
                }
            });
            jf.add(jf6);
            jf6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setForeground(Color.darkGray);
                }
            });
            jf.add(jf7);
            jf7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setForeground(Color.yellow);
                }
            });
            jf.add(jf8);
            jf8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setForeground(Color.blue);
                }
            });
            jf.add(jf9);
            jf9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setForeground(Color.pink);
                }
            });
            jf.add(jf10);
            jf10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setForeground(Color.CYAN);
                }
            });
            jt = new JMenu("Change the Text Cursor Color");
            jt.setFont(font2);
            jt1 = new JMenuItem("Default");
            jt1.setFont(font2);
            jt2 = new JMenuItem("Red");
            jt2.setFont(font2);
            jt3 = new JMenuItem("Green");
            jt3.setFont(font2);
            jt4 = new JMenuItem("Orange");
            jt4.setFont(font2);
            jt5 = new JMenuItem("Magenta");
            jt5.setFont(font2);
            jt6 = new JMenuItem("Gray");
            jt6.setFont(font2);
            jt7 = new JMenuItem("Yellow");
            jt7.setFont(font2);
            jt8 = new JMenuItem("Blue");
            jt8.setFont(font2);
            jt9 = new JMenuItem("Pink");
            jt9.setFont(font2);
            jt10 = new JMenuItem("Cyan");
            jt10.setFont(font2);
            jt.add(jt1);
            jt1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (type.getBackground() == Color.white) {
                        type.getCaretPosition();
                        type.setCaretColor(Color.black);
                    } else if (type.getBackground() == Color.black) {
                        type.getCaretPosition();
                        type.setCaretColor(Color.white);
                    }
                }
            });
            jt.add(jt2);
            jt2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.getCaretPosition();
                    type.setCaretColor(Color.red);
                }
            });
            jt.add(jt3);
            jt3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.getCaretPosition();
                    type.setCaretColor(Color.GREEN);
                }
            });
            jt.add(jt4);
            jt4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.getCaretPosition();
                    type.setCaretColor(Color.ORANGE);
                }
            });
            jt.add(jt5);
            jt5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.getCaretPosition();
                    type.setCaretColor(Color.magenta);
                }
            });
            jt.add(jt6);
            jt6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.getCaretPosition();
                    type.setCaretColor(Color.DARK_GRAY);
                }
            });
            jt.add(jt7);
            jt7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.getCaretPosition();
                    type.setCaretColor(Color.yellow);
                }
            });
            jt.add(jt8);
            jt8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.getCaretPosition();
                    type.setCaretColor(Color.blue);
                }
            });
            jt.add(jt9);
            jt9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.getCaretPosition();
                    type.setCaretColor(Color.pink);
                }
            });
            jt.add(jt10);
            jt10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.getCaretPosition();
                    type.setCaretColor(Color.CYAN);
                }
            });
            jc.add(jf);
            jc.add(jt);
            jb3.add(j7);
            jb3.add(jc);
            j7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String s = type.getText();
                    String st = "";
                    String num = "";
                    String ot = "";
                    char[] ch = s.toCharArray();
                    for (int i = 0; i < s.length(); i++) {
                        if (ch[i] != '\n' && Character.isSpace(ch[i]) != true) {
                            if (Character.isAlphabetic(ch[i]) == true) {
                                st += ch[i];
                            } else if (Character.isDigit(ch[i]) == true) {
                                num += ch[i];
                            } else {
                                ot += ch[i];
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(j, "Total Number Of Letters Typed: " + st.length() + "\n" + "Total Number Of Numbers Typed: " + num.length() + "\n" + "Total Number Of Special Characters Typed: " + ot.length());
                }
            });
            fo = new JMenu("Font Size");
            fo.setFont(font2);
            fo2 = new JMenuItem("Font Size");
            fo2.setFont(font2);
            fo1 = new JMenuItem("Default");
            fo1.setFont(font2);
            jb2.add(fo);
            fo.add(fo1);
            fo.add(fo2);
            fo1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setFont(new Font("Dialog", Font.PLAIN, 12));
                }
            });
            fo2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String st = JOptionPane.showInputDialog("Enter The Preferred Font Size");
                    int size = Integer.parseInt(st);
                    type.setFont(new Font("Dialog", Font.PLAIN, size));
                }
            });
            jb4 = new JMenu("Settings");
            jb4.setFont(font2);
            j8 = new JMenuItem("About Version");
            j8.setFont(font2);
            j9 = new JMenuItem("Exit");
            j9.setFont(font2);
            jb4.add(j8);
            jb4.add(j9);
            j9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            j8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(j, "Version Up To Date" + "\n" + "    " + "Version 1.0.Y");
                }
            });
            jb4.add(j9);
            jb5 = new JMenu("Theme");
            jb5.setFont(font2);
            t = new JMenuItem("Dark Mode");
            t.setBackground(Color.black);
            t.setForeground(Color.white);
            t.setFont(font2);
            t1 = new JMenuItem("Light Mode");
            t1.setFont(font2);
            t1.setForeground(Color.black);
            t1.setBackground(Color.WHITE);
            t.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jp.setBackground(new Color(176, 196, 222));
                    jm.setBackground(new Color(176, 196, 222));
                    type.setBackground(Color.BLACK);
                    if (type.getForeground() == Color.black) {
                        type.setForeground(Color.white);
                    }
                    if (type.getCaretColor() == Color.black) {
                        type.getCaretPosition();
                        type.setCaretColor(Color.WHITE);
                    }
                }
            });
            t1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jp.setBackground(new Color(127,216,190));
                    j.getContentPane().setBackground(Color.white);
                    jm.setBackground(new Color(127,216,190));
                    type.setBackground(Color.white);
                    if (type.getForeground() == Color.WHITE) {
                        type.setForeground(Color.BLACK);
                    }
                    if (type.getCaretColor() == Color.white) {
                        type.getCaretPosition();
                        type.setCaretColor(Color.BLACK);
                    }
                }
            });
            jb5.add(t);
            jb5.add(t1);
            jm.add(jb5);
            jm.add(jb2);
            jm.add(jb3);
            jm.add(jb4);
            jm.add(jp);
            jm.add(Box.createHorizontalGlue());
            jm.add(date);
            j.setVisible(true);
        }
        public static void main(String[] args) {
            notepad(true);
        }
    }