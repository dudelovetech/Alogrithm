
public class QuickFind {

	// the array that saves all relationships
	private int[] id;
	
	public boolean isConnected(int p, int q){
		return id[p] == id[q];
	}
	
	public void union(int p, int q){
		for (int i = 0; i < id.length; i++){
			if (id[i] == id[p]){
					id[i] = id[q];
			}
		}
		
	}
}
