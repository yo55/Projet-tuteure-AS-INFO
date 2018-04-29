package project.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

import project.network.Network;
import project.network.Node;

/**
 * Classe qui génère le bloc d'affichage et de modification des consommations des groupes présents sur le réseau
 * 
 * @author yoann
 *
 */
public abstract class InputWindowElement {
	
	// JPanel de l'élément
	protected JPanel elementDisplay;
	
	// Réseau
	protected Network model;
	
	
	// titre de l'élément
	protected JLabel titre;
	

	/**
	 * Constructeur
	 */
	public InputWindowElement(Network ntw, String titre) {
		this.titre = new JLabel(titre);
		this.model = ntw;
		
		this.elementDisplay = new JPanel();
	}
	
	/**
	 * @return Le JPanel de l'élément
	 */
	public JPanel getDisplay() {
		return elementDisplay;
	}
	
	public abstract void createElement();
	
	public abstract void updateElement();
	

}