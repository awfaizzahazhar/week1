// Awfa Izzah Binti Azhar
// D031910356

public class Driver
{
	public static void main(String [] arg)
	{
		//Fish is a data type
		//fish nemo; == int x;
		Fish nemo = new Fish();
		nemo.Swim();
		//nemo.color="red";
		nemo.SetColor("red");
		nemo.Swim();

		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();

		//Fish dory = new Fish();
		//dory.Swim();
		//dory.color = "yellow";
		//dory.SetColor("yellow");
		//dory.Swim();

		//Aquirim fancyAquirim = new Aquirim();
		//fancyAquirim.fillFish();

	}
}