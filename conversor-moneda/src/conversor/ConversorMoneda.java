package conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorMoneda {
	public static void main(String[] args) {
		principal();
	}
	public static void principal() {
		double tasaEuro = 0.05;
	    double tasaLibra = 0.05;
	    double tasaYen = 8.56;
	    double tasaDolar = 0.06;
	    double tasaWon = 77.50;
	DecimalFormat dosDecimales = new DecimalFormat("#.00");

	Object [] menu = {"Conversor de Temperatura", "Conversor de Monedad"};
	String selectMenu = (String)JOptionPane.showInputDialog(null,
                "Selecciona una opcion",
                "Menu",
                JOptionPane.PLAIN_MESSAGE,
                null, menu,
                "Conversor de Moneda");
	if (selectMenu == null) {
        JOptionPane.showMessageDialog(null, "Operación cancelada. Hasta luego.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }else if(selectMenu != null && selectMenu.equals("Conversor de Temperatura")) {
		System.out.println("HACER MENU DE TEMPERATURA");
	}else {
		Object[] opciones = {
				"De Peso a Dolar",
  				"De Peso a Euro",
  				"De Peso a Libra",
  				"De Peso a Won",
  				"De Peso a Yen",
  				"De Dolar a Peso",
  				"De Euro a Peso",
  				"De Libra a Peso",
  				"De Won a Peso",
  				"De Yen a Peso"
  				};

		String selectOpcion = (String)JOptionPane.showInputDialog(null,
             "Selecciona una opcion de conversion", "Monedas",
             JOptionPane.INFORMATION_MESSAGE, null,
             opciones, opciones[0]);
		if (selectOpcion == null) {
	        JOptionPane.showMessageDialog(null, "Operación cancelada. Hasta luego.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		}else {
		String entrada = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir");
		if (entrada == null) {
	        JOptionPane.showMessageDialog(null, "Operación cancelada. Hasta luego.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	    }
		else if (esNumero(entrada)) {
		double cantidadAConvertir = Double.parseDouble(entrada);
		switch (selectOpcion) {
		case "De Peso a Dolar":
		    JOptionPane.showMessageDialog(null, "Tienes " +"$"+ dosDecimales.format(cantidadAConvertir * tasaDolar) + " Dolares");
			break;
		case "De Peso a Euro":
		    JOptionPane.showMessageDialog(null, "Tienes " +"$"+ dosDecimales.format(cantidadAConvertir * tasaEuro) + " Euros");
			break;
		case "De Peso a Libra":
		    JOptionPane.showMessageDialog(null, "Tienes " +"$"+ dosDecimales.format(cantidadAConvertir * tasaLibra) + " Libras");
			break;
		case "De Peso a Won":
		    JOptionPane.showMessageDialog(null, "Tienes " +"$"+ dosDecimales.format(cantidadAConvertir * tasaWon) + " Wones");
			break;
		case "De Peso a Yen":
		    JOptionPane.showMessageDialog(null, "Tienes " +"$"+ dosDecimales.format(cantidadAConvertir * tasaYen) + " Euros");
			break;
		case "De Dolar a Peso":
		    JOptionPane.showMessageDialog(null, "Tienes " +"$"+ dosDecimales.format(cantidadAConvertir / tasaDolar) + " Pesos");
			break;
		case "De Euro a Peso":
		    JOptionPane.showMessageDialog(null, "Tienes " +"$"+ dosDecimales.format(cantidadAConvertir / tasaEuro) + " Pesos");
			break;
		case "De Libra a Peso":
		    JOptionPane.showMessageDialog(null, "Tienes " +"$"+ dosDecimales.format(cantidadAConvertir / tasaLibra) + " Pesos");
			break;
		case "De Won a Peso":
		    JOptionPane.showMessageDialog(null, "Tienes " +"$"+ (cantidadAConvertir / tasaWon) + " Pesos");
			break;
		case "De Yen a Peso":
		    JOptionPane.showMessageDialog(null, "Tienes " +"$"+ (cantidadAConvertir / tasaYen) + " Pesos");
			break;
			}

		int selectOpcion2 = JOptionPane.showConfirmDialog(null,
	             "¿Desea continuar?", "Selecciona una opción",
	             JOptionPane.YES_NO_CANCEL_OPTION);
		switch(selectOpcion2) {
		case JOptionPane.YES_OPTION:
			principal();
			break;
		case JOptionPane.NO_OPTION:
	        JOptionPane.showMessageDialog(null, "Hasta luego.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);;
	        break;
		case JOptionPane.CANCEL_OPTION:
	        JOptionPane.showMessageDialog(null, "Operación cancelada. Hasta luego.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	        break;
			}

		}else{
            // Si la entrada no es un número, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Error: Ingresa un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        	}
		}
		}

	}
	// Método para validar si una cadena es un número
    private static boolean esNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
