
public class TVs extends Netflix{

	public TVs(Descargas download)
	{
		super(download);	
		
	}	
	public void DescargarTVs(Descargas download) {
		
		this.setDownload(download);
	}
	
	@Override
	public void obtener(){
		
		System.out.println("Descargando Video en TV");	
		
		this.getDownload().descargar();
		
	}
}
