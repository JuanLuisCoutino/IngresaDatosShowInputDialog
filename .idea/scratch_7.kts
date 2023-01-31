import javax.swing.JOptionPane

println("Vamos a mostrar un dialogo")

var numero= JOptionPane.showInputDialog("Ingresa tu turno")!!.toInt()
numero++
JOptionPane.showMessageDialog(null, "Ese es tu turno: ${numero}")

//Ing. JUAN LUIS COUTIÑO LÓPEZ
