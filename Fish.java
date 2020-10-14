public class Fish 
{
	private String color = "blue";
	//attribute or data member

	//method
	public void Swim ()
	{
		System.out.println(color + " fish swim");
	}

	public void SetColor(String warna)
	{
		color = warna;
	}

	public String GetColor() 
	{
		return color;
	}
}