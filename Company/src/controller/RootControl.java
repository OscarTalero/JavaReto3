package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;

/**
 *
 * @author oscar
 */
public class RootControl implements ActionListener {

    private Root view = new Root();

    /**
     * constructor
     *
     * @param view ventana principal
     */
    public RootControl(Root view) {
        this.view = view;
        this.view.btnEmpleados.addActionListener(this);
        this.view.btnClientes.addActionListener(this);
        this.view.btnSalirRoot.addActionListener(this);
    }

    /**
     *
     * muestra la ventana principal y la ubica en el centro de la pantalla
     */
    public void start() {
        view.setTitle("EMPRESA GRUPO 2");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.btnEmpleados) {
            //Crea la ventana Empleados
            EmployeeView window = new EmployeeView();
            EmployeeControl employeecontrol = new EmployeeControl(window);
            employeecontrol.startEmployee();

        } else if (e.getSource() == view.btnClientes) {
            //Crea la ventana clientes
            ClientView window = new ClientView();
            ClientControl clientcontrol = new ClientControl(window);
            clientcontrol.startClient();
            
        }  else {
            view.dispose();
        }
    }
}
