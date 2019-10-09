
public abstract class Netflix {
	
	Descargas download;	
	
	String nombre;
	
	public Netflix(Descargas d) {
		this.download = d;		
	}

	public Descargas getDownload() {
		return this.download;
	}

	public void setDownload(Descargas download) {
		this.download = download;
	}
	
	
	public abstract void obtener();

}
