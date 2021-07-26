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
public class EmployeeControl implements ActionListener {

    private Enterprise enterprise = new Enterprise();
    private EmployeeView view = new EmployeeView();

    /**
     * constructor
     *
     * @param view ventana Empleados
     *
     */
    public EmployeeControl(EmployeeView view) {
        this.view = view;
        this.view.btnAddEmploye.addActionListener(this);
        this.view.btnListEmployee.addActionListener(this);
        this.view.btnExitEmployee.addActionListener(this);
    }

    public void startEmployee() {
        view.setTitle("EMPRESA GRUPO 2");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {

        if (ev.getSource() == view.btnAddEmploye) {
            try {
                Employee employee = new Employee(Integer.parseInt(view.txtCode.getText()), Float.parseFloat(view.txtSalary.getText()),
                        view.txtNameEmployee.getText(), Integer.parseInt(view.txtAge.getText()));

                enterprise.hireEmployee(employee);
                this.clearText();
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
            }  catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Debe diligenciar todos los campos");
            }
        } else if (ev.getSource() == view.btnListEmployee) {
            EmployeeList window = new EmployeeList();
            EmployeeListControl employeelistcontrol = new EmployeeListControl(window);
            employeelistcontrol.startEmployeeList();
            employeelistcontrol.addEmployeeTable(enterprise);
        } else {
            view.dispose();
        }
    }

    public void clearText() {
        view.txtCode.setText("");
        view.txtNameEmployee.setText("");
        view.txtAge.setText("");
        view.txtSalary.setText("");
    }
}
