package taller3.televisores;

public class TV {
	Marca marca;
	int precio=500;
	int canal=1;
	int volumen=1;
	Control control;
	boolean estado;
	static int numTV;
	public TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	
	public static void setNumTV(int num) {
		numTV=num;
	}

	public void setPrecio(int p) {
		precio=p;
	}

	public void setCanal(int c) {
		if (estado) {
			if (c>=1 && c<=120) {
				canal=c;
			}
		}
	}

	public void setVolumen(int v) {
		volumen=v;
	}
	
	public void setControl(Control con) {
		control=con;
	}
	
	public void setMarca(Marca m) {
		marca=m;
	}

	public int getPrecio() {
		return precio;
	}

	public int getCanal() {
		return canal;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public Control getControl() {
		return control;
	}

	public Marca getMarca() {
		return marca;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		estado=true;
	}
	
	public void turnOff() {
		estado=false;
	}
	
	public void volumenUp() {
		if (estado) {
			if(volumen<6 && volumen>-1) {
				volumen++;
			}
		}
	}
	
	public void volumenDown() {
		if (estado) {
			if(volumen<7 && volumen>0) {
				volumen--;
			}
		}
	}
	
	public void canalUp() {
		if (estado) {
			if(canal<120 && canal>0) {
				canal++;
			}
		}
	}
	
	public void canalDown() {
		if (estado) {
			if(canal<121 && canal>1) {
				canal--;
			}
		}
	}
	public boolean getEstado() {
		return estado;
	}
	
	
	


}
