import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Cinemx {
    private int FILS = 12;
    private int COLS = 10;
    JButton[][] CUADRO;

    private JPanel panel1;
    private JPanel panel_asientos;
    private JPanel panel_acciones;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button29;
    private JButton button30;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JButton button35;
    private JButton button36;
    private JButton button37;
    private JButton button38;
    private JButton button39;
    private JButton button40;
    private JButton button41;
    private JButton button42;
    private JButton button43;
    private JButton button44;
    private JButton button45;
    private JButton button46;
    private JButton button47;
    private JButton button48;
    private JButton button49;
    private JButton button50;
    private JButton button51;
    private JButton button52;
    private JButton button53;
    private JButton button54;
    private JButton button55;
    private JButton button56;
    private JLabel pantalLa;
    private JButton apartados;
    private JButton compra;
    private JLabel disponible;
    private JLabel apartado;
    private JLabel reservado;
    private JButton recetiar;
    private JLabel opcion_eligida;
    private JLabel anuncio;
    //Asegurece que la rute este escrito correctamente para que salgan las imagenes
    private ImageIcon asient_disp = new ImageIcon(getClass().getResource("/Imagenes/asiento disponible.png"));
    private ImageIcon asient_apart = new ImageIcon(getClass().getResource("/Imagenes/asiento apartado.png"));
    private ImageIcon asient_resev = new ImageIcon(getClass().getResource("/Imagenes/asiento reservado.png"));
    private ImageIcon opcion = null;

    public Cinemx() {
        JButton asientos[] = {button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12,
                button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25,
                button26, button27, button28, button29, button30, button31, button32, button33, button34, button35, button36, button37, button38,
                button39, button40, button41, button42, button43, button44, button45, button46, button47, button48, button49, button50, button51,
                button52, button53, button54, button55, button56};
        for (int i = 0; i < 56; i++) {
            asientos[i].setIcon(asient_disp);
        }
        opcion_eligida.setText("¡¡Bienvenido!!");

        recetiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 56; i++) {
                    asientos[i].setIcon(asient_disp);
                }
                opcion = null;
                opcion_eligida.setText("¡¡Bienvenido!!");
                opcion_eligida.setIcon(null);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button1);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button2);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button3);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button4);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button5);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button6);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button7);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button8);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button9);
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button10);
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button11);
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button12);
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button13);
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button14);
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button15);
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button16);
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button17);
            }
        });
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button18);
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button19);
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button20);
            }
        });
        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button21);
            }
        });
        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button22);
            }
        });
        button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button23);
            }
        });
        button24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button24);
            }
        });
        button25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button25);
            }
        });
        button26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button26);
            }
        });
        button27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button27);
            }
        });
        button28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button28);
            }
        });
        button29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button29);
            }
        });
        button30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button30);
            }
        });
        button31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button31);
            }
        });
        button32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button32);
            }
        });
        button33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button33);
            }
        });
        button34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button34);
            }
        });
        button35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button35);
            }
        });
        button36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button36);
            }
        });
        button37.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button37);
            }
        });
        button38.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button38);
            }
        });
        button39.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button39);
            }
        });
        button40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button40);
            }
        });
        button41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button41);
            }
        });
        button42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button42);
            }
        });
        button43.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button43);
            }
        });
        button44.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button44);
            }
        });
        button45.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button45);
            }
        });
        button46.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button46);
            }
        });
        button47.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button47);
            }
        });
        button48.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button48);
            }
        });
        button49.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button49);
            }
        });
        button50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button50);
            }
        });
        button51.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button51);
            }
        });
        button52.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button52);
            }
        });
        button53.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button53);
            }
        });
        button54.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button54);
            }
        });
        button55.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button55);
            }
        });
        button56.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                control(button56);
            }
        });
        ///////////Botones de lo que se va a realizar///////////
        compra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opcion = asient_resev;
                opcion_eligida.setIcon(asient_resev);
                opcion_eligida.setText("Comprando");
            }
        });
        apartados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opcion = asient_apart;
                opcion_eligida.setIcon(asient_apart);
                opcion_eligida.setText("Apartando");
            }
        });
    }

    public void control(JButton asiento) {
        if (asiento.getIcon().equals(asient_apart) || asiento.getIcon().equals(asient_disp) && opcion != null) {
            asiento.setIcon(opcion);
        }
        if (asiento.getIcon().equals(asient_resev)) {
            opcion_eligida.setIcon(asient_resev);
            opcion_eligida.setText("Reservado!");
        }
        if (asiento.getIcon().equals(asient_apart)) {
            ////////////TIEMPO///////////////
            Tiempo(asiento);
            opcion_eligida.setIcon(asient_apart);
            opcion_eligida.setText("Apartando");
        }
        if (opcion == null) {
            opcion_eligida.setText("Elija una opcion");
            opcion_eligida.setIcon(null);
        }
    }

    public void Tiempo(JButton asiento) {
        TimerTask timerTask = new TimerTask() {
            public void run() {
                //codigo a ejecutar al terminar el tiempo
                if (asiento.getIcon().equals(asient_apart)) {
                    asiento.setIcon(asient_disp);
                }
            }
        };
        // Aquí se pone en marcha el timer cada segundo.
        Timer timer = new Timer();
        //300s=5m    300,000=5min                   1m=60000
        timer.scheduleAtFixedRate(timerTask, 6000, 1000);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cinemx");
        frame.setContentPane(new Cinemx().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setBounds(400, 100, 670, 370);

    }

}
