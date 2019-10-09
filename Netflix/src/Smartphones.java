
public class Smartphones extends Netflix {

public Smartphones(Descargas d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

public void DescargarSmartphone(Descargas download) {
		
		this.setDownload(download);
	}
	
	@Override
	public void obtener(){
		
		System.out.println("Descargando Video en SmartPhone");	
		
		this.getDownload().descargar();
		
	}
	
	

}
