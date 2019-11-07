package controllers;

	import java.util.ArrayList;

	import models.Usuario;
public class UsuarioController {

		private ArrayList<Usuario> usuario = new ArrayList<>();
		
		private Usuario usuariolista = new Usuario(null, null, null);
		
	    public UsuarioController() {
	    	
	    	usuario.add(usuariolista);
	    	
	    }
		
	    public ArrayList<Usuario> getUsuario() {
	    	
	    	return this.usuario;
	    	
	    }
	    
	    public void cadastraUsuario(Usuario u) {
	    	usuario.add(u);
	    }
	    
	    public String[] toArray() {
	    	
	    	String[] temp = new String[ this.usuario.size() ];
	    	
	    	for(int c = 0; c < this.usuario.size(); c++) {
	    		
	    		temp[c] = this.usuario.get(c).toString();
	    		
	    	}
	    	
	    	return temp;
	    	
	    

	    }
}
