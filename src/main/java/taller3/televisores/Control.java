package taller3.televisores;

public class Control {
	TV tv;

	public void enlazar(TV tv1) {
		tv = tv1;
		tv.setControl(this);
	}

	public void turnOff() {
		if (tv.estado == true) {
			tv.estado = false;
		}
		
	}
	
	public void turnOn() {
		if (tv.estado == false) {
			tv.estado = true;
		}
		
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}

	public void setCanal(int i) {
		if (tv.estado) {
			if (i>=1 && i<=120) {
				tv.canal=i;
			}
		}
	}
	
	public void setTv(TV t) {
		tv=t;
	}

	public TV getTv() {
		return tv;
	}

}
