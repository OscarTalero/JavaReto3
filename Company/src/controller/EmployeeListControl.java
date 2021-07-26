package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.EmployeeList;
import model.Enterprise;

/**
 *
 * @author oscar
 */
public class EmployeeListControl implements ActionListener {

    public EmployeeList employeelist = new EmployeeList();
    public Enterprise enterprise = new Enterprise();

    /**
     * constructor
     *
     * @param employeelist ventana lista de empleados
     */
    public EmployeeListControl(EmployeeList employeelist) {

        this.employeelist = employeelist;
        this.employeelist.btnExitListEmployee.addActionListener(this);
    }

    public void startEmployeeList() {
        employeelist.setTitle("EMPRESA GRUPO 2");
        employeelist.setLocationRelativeTo(null);
        employeelist.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        employeelist.dispose();
    }

    public void addEmployeeTable(Enterprise enterprise) {

        String matriz[][] = new String[enterprise.getEmployee().size()][4];

        for (int i = 0; i < enterprise.getEmployee().size(); i++) {
            matriz[i][0] = String.valueOf(enterprise.getEmployee().get(i).getCode());
            matriz[i][1] = enterprise.getEmployee().get(i).getName();
            matriz[i][2] = String.valueOf(enterprise.getEmployee().get(i).getAge());
            matriz[i][3] = String.valueOf(enterprise.getEmployee().get(i).getSalary());
        }

        employeelist.jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Codigo", "Nombre", "Edad", "Salario"
                }
        ));
    }
}
