package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.*;
import view.*;

/**
 *
 * @author oscar
 */
public class ClientControl implements ActionListener{

    private ClientView clientview = new ClientView();
    private Enterprise enterprise = new Enterprise();
    
    /**
     * constructor
     *
     * @param clientview  ventana clientes
     */
    public ClientControl(ClientView clientview) {
        this.clientview = clientview;
        this.clientview.btnAddClient.addActionListener(this);
        this.clientview.btnListClient.addActionListener(this);
        this.clientview.btnExitClient.addActionListener(this);
    }

    public void startClient (){
    clientview.setTitle("MI EMPRESA GRUPO 2");
    clientview.setVisible(true);
    clientview.setLocationRelativeTo(null);
}
    @Override
    public void actionPerformed(ActionEvent evt) {
        
        if (evt.getSource() == clientview.btnAddClient) {
            System.out.println("primero");
            try {
                Client client = new Client(Integer.parseInt(clientview.txtPhoneClient.getText()), 
                        clientview.txtNameClient.getText(), Integer.parseInt(clientview.txtAgeClient.getText()));
               enterprise.linkClient(client);
                System.out.println(client);
                this.clearText();
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
            }  catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Debe diligenciar todos los campos");
            }
        }   else if (evt.getSource() == clientview.btnListClient) {
             ClientList window = new ClientList();
            ClientListControl clientlistcontrol = new ClientListControl(window);
            clientlistcontrol.startClientList();
            clientlistcontrol.addEmployeeTable(enterprise);
        } else {
            clientview.dispose();
        }
    }
    
    public void clearText() {
        clientview.txtNameClient.setText("");
        clientview.txtAgeClient.setText("");
        clientview.txtPhoneClient.setText("");
     }
    
}
