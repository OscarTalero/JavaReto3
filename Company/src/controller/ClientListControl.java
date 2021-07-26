package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Enterprise;
import view.ClientList;

/**
 *
 * @author oscar
 */
public class ClientListControl implements ActionListener {
    
    private ClientList clientview = new ClientList();

 /**
 *
 *@param clientview ventana lista de clientes
 */
    public ClientListControl(ClientList clientview) {
        
        this.clientview = clientview;
        this.clientview.btnEXitListClient.addActionListener(this);
    }
    
    public void startClientList() {
        clientview.setTitle("EMPRESA GRUPO 2");
        clientview.setLocationRelativeTo(null);
        clientview.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        clientview.dispose();
    }
    
    public void addEmployeeTable(Enterprise enterprise) {

        String matriz[][] = new String[enterprise.getClient().size()][3];

        for (int i = 0; i < enterprise.getClient().size(); i++) {
            matriz[i][0] = enterprise.getClient().get(i).getName();
            matriz[i][1] = String.valueOf(enterprise.getClient().get(i).getAge());
            matriz[i][2] = String.valueOf(enterprise.getClient().get(i).getPhone());
        }

        clientview.jTableClient.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                     "Nombre", "Edad", "Telefono"
                }
        ));
    }
}
