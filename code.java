class DummyBean
{
	private String s;
	
	public void setDummy(String sc)
	{
		this.s = sc;
	}
	
	public String getDummy()
	{
		return this.s;
	}
} 



public class code
{
	public static void main (String[] args)
	{
		DummyBean dum = new DummyBean();
		dum.setDummy("foo");
		System.out.println(dum.getDummy()); // prints 'foo'

		DummyBean dumtwo = dum;
		System.out.println(dumtwo.getDummy()); // prints 'foo'

		dumtwo.setDummy("bar");
		System.out.println(dum.getDummy()); // prints 'bar' but it should print 'foo'
	}
}