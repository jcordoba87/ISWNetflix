
public class PCs extends Netflix {

	public PCs(Descargas d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void DescargarPCs(Descargas download) {
		
		this.setDownload(download);
	}
	
	@Override
	public void obtener(){
		
		System.out.println("Descargando Video en PC");	
		
		this.getDownload().descargar();
		
	}
	
	

}
