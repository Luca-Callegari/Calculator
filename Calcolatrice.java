import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Calcolatrice extends JFrame {
    /*realizzare una finestra grafica che contiene una etichetta
     * con la scritta ADDIZIONE e due JTextField che rappresentano
     * gli operandi. E' poi presente un pulsante con la scritta SOMMA
     * alla cui pressione si calcola la somma degli operandi e si
     * visualizza in una JOptionPane*/

    private JPanel sfondo;
    private JTextField input1;
    private JTextField input2;
    private JButton pulsante;
    //private JButton canc;
    private JButton SOMMA;
    private JButton SOTTR;
    private JButton MOLT;
    private JButton DIV;


    class Sommare implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Random r = new Random();
            Color color = new Color(1 + r.nextInt(255), 1 + r.nextInt(255), 1 + r.nextInt(255));
            Calcolatrice.this.sfondo.setBackground(color);


            String Sv1 = Calcolatrice.this.input1.getText();
            float v1 = Float.parseFloat(Sv1);

            String Sv2 = Calcolatrice.this.input2.getText();
            float v2 = Float.parseFloat(Sv2);

            //SOMMA
            float somma = v1 + v2;
            String Ssomma = String.valueOf(somma);
            //JOptionPane.showMessageDialog(Calcolatrice.this, Ssomma);
            Calcolatrice.this.SOMMA = new JButton("Somma: " + Ssomma);
            Calcolatrice.this.sfondo.add(SOMMA);
            Calcolatrice.this.SOMMA.setLocation(100, 150);
            Calcolatrice.this.SOMMA.setSize(300, 30);
            //SOTTRAZIONE
            float sottrazione = v1 - v2;
            String Ssottrazione = String.valueOf(sottrazione);
            Calcolatrice.this.SOTTR = new JButton("Sottrazione: " + Ssottrazione);
            Calcolatrice.this.sfondo.add(SOTTR);
            Calcolatrice.this.SOTTR.setLocation(100, 200);
            Calcolatrice.this.SOTTR.setSize(300, 30);
            //MOLTIPLICAZIONE
            float moltiplicazione = v1 * v2;
            String Mmoltiplicazione = String.valueOf(moltiplicazione);
            Calcolatrice.this.MOLT = new JButton("Moltiplicazione: " + Mmoltiplicazione);
            Calcolatrice.this.sfondo.add(MOLT);
            Calcolatrice.this.MOLT.setLocation(100, 250);
            Calcolatrice.this.MOLT.setSize(300, 30);
            //DIVISIONE
            float divisione = v1 / v2;
            String Ddivisione = String.valueOf(divisione);
            Calcolatrice.this.DIV = new JButton("Divisione: " + Ddivisione);
            Calcolatrice.this.sfondo.add(DIV);
            Calcolatrice.this.DIV.setLocation(100, 300);
            Calcolatrice.this.DIV.setSize(300, 30);


        }
    }

    public Calcolatrice() {

        //CREARE FINESTRA
        super.setTitle("Calcolatrice");
        super.setSize(600, 400);
        super.setLocation(0, 0);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setVisible(true);


        //CREAZIONE SFONDO
        this.sfondo = new JPanel();
        super.setContentPane(sfondo);
        this.sfondo.setLayout(null);
        Random r = new Random();
        Color color = new Color(1 + r.nextInt(255), 1 + r.nextInt(255), 1 + r.nextInt(255));
        this.sfondo.setBackground(color);

        //CREAZIONE CASELLE:
        //1
        this.input1 = new JTextField();
        this.sfondo.add(this.input1);
        this.input1.setSize(300, 30);
        this.input1.setLocation(100, 60);
        //2
        this.input2 = new JTextField();
        this.sfondo.add(this.input2);
        this.input2.setSize(300, 30);
        this.input2.setLocation(100, 100);

        //CREAZIONE PULSANTE
        this.pulsante = new JButton("Clicca");
        this.sfondo.add(pulsante);
        this.pulsante.setSize(100, 30);
        this.pulsante.setLocation(200, 10);

        //CREAZIONE PULSANTE CANCELLAZIONE

        //this.canc = new JButton("Cancella");
        //this.sfondo.add(canc);
        //this.canc.setSize(100, 30);
        //this.canc.setLocation(10, 10);


        //IMMETTERE NELL'AZIONE
        Sommare s = new Sommare();
        this.pulsante.addActionListener(s);


    }

    public static void main(String[] args) {
        new Calcolatrice();
    }

}
