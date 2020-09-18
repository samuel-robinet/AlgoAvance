class DessinFractale{
    private final Turtle bob;
    
    private final static int LARGEUR = 800;
    private final static int HAUTEUR = 600;
    //taille de la fenetre graphique

    public DessinFractale(){
	bob  = new Turtle();
	Turtle.setCanvasSize(LARGEUR,HAUTEUR);//à appeler APRES création de la tortue
    }

    public DessinFractale(int v){
	//attention, plus v est grand, plus bob va lentement !
	this();
	bob.speed(v);
    }


    public void reset(){
	bob.clear();
	bob.up();
	bob.setPosition(0,0);
	bob.setDirection(0);
	bob.down();

    }

    public void close(){
	bob.exit();
    }
    public void dneuf(){bob.left(90);}


    public void carre(double l){
		bob.forward(l);
		bob.left(90);
		bob.forward(l);
		bob.left(90);
		bob.forward(l);
		bob.left(90);
		bob.forward(l);
    }
	public void vonKoch(double l, int n){
		if(n==0){
			bob.forward(l);

		}
		else{
			vonKoch(l/3,n-1);
			bob.left(60);
			vonKoch(l/3,n-1);
			bob.right(120);
			vonKoch(l/3,n-1);
			bob.left(60);
			vonKoch(l/3,n-1);

		}
		//vonKoch(l/3,n-1);
		/*
    	bob.forward(l/3);


		bob.left(45);
		bob.forward(l/3);
		bob.right(90);
		bob.forward(l/3);
		bob.left(45);
		bob.forward(l/3);
*/

	}
	public void arbre(double l, int n) {
		if(n==0){
			bob.forward(l);
			//bob.forward(-l);
		}
		else{
			arbre(l,n-1);
			bob.left(45);
			arbre(l/3,n-1);
			bob.forward(-l/3);
			bob.right(45);
			arbre(l/3,n-1);
			bob.forward(-l/3);
			bob.right(45);
			arbre(l/3,n-1);
			bob.forward(-l/3);
			bob.left(45);
		}


	}
	public void arbre2(double l, int n) {
		if(n==0){
			//bob.forward(l);
			//bob.forward(-l);
		}
		else{
			bob.forward(l);
			arbre2(l,n-1);
			bob.left(45);
			arbre2(l/3,n-1);
			bob.forward(-l/3);
			bob.right(45);
			arbre(l/3,n-1);
			bob.forward(-l/3);
			bob.right(45);
			arbre2(l/3,n-1);
			bob.forward(-l/3);
			bob.left(45);
			bob.forward(-l);
		}


	}

	public void triforce(double l,int n){
    	if (n==0){
			bob.forward(l);
			bob.left(120);
			bob.forward(l);
			bob.left(120);
			bob.forward(l);
			bob.left(120);
			bob.forward(l);

		}
    	else{
    		triforce(l/2,n-1);
    		triforce(l/2,n-1);
			bob.left(120);
			bob.forward(l/2);
			bob.left(60);
			bob.forward(l/2);
			bob.left(180);
			triforce(l/2,n-1);
			bob.right(60);
			bob.forward(l/2);
			bob.left(60);



		}
	}

	public void dragonClient(double l,int n) {
    	dragon(l,n,true);


	}
	public void dragon(double l,int n,boolean b){
		if(n==0) {
			bob.forward(l);

		}
		else if (b == true) {
			dragon(l, n - 1, true);
			bob.left(90);
			dragon(l, n - 1, false);

		} else {
			dragon(l, n - 1, true);
			bob.left(-90);
			dragon(l, n - 1, false);
		}



	}
    public static void main(String[] args){
	DessinFractale d = new DessinFractale(1);
	//d.carre(90);
	//d.reset();
	//d.vonKoch(500,2);
	//d.dneuf();
	//d.arbre2(500,2);
	//d.triforce(500,1);
	d.dragonClient(500,4);
	//d.reset();
	//d.close();
    }
    
}