public class AnimalListRunner
{
    public static void main(String[] args)
    {
        AnimalList zoo = new AnimalList();
        zoo.addAnimal("pig");
        zoo.addAnimal("zebra");
        zoo.addAnimal("frog");
        zoo.addAnimal("armadillo");
        zoo.addAnimal("aardvark");
        zoo.addAnimal("axolotl");
        zoo.addAnimal("elephant");
        zoo.addAnimal("zz");
        zoo.addAnimal("zi");
        zoo.displayList();
        System.out.println(zoo.getnumAddRemove());
    }
}
