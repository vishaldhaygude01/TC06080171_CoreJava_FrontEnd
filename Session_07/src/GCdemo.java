
public class GCdemo {
	
	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("GC Called....");
	}
	
	public static void main(String[] args) {
		GCdemo g1 = new GCdemo();
		GCdemo g2 = new GCdemo();
		GCdemo g3 = new GCdemo();
		g1 = null;
		g2 = null;
		g3 = null;
		
		System.gc();
	}
}
