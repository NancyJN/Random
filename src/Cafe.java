public class Cafe {
    public static void main(String[] args) {

        // main thread
        CoffeeMachine coffeeMachine= new CoffeeMachine();
        coffeeMachine.getEspresso();

    }
    static class CoffeeMachine{
        public void getEspresso() {
            grind();
            workupSteam();
            blend();
        }
        private void grind(){
            System.out.println("grinding beans");
        }
        private void workupSteam(){
            System.out.println("working up steam");
        }
        private void blend(){
            System.out.println("delivering the magic potion!!");
        }
    }
}
