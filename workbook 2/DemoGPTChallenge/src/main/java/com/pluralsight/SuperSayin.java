package com.pluralsight;

public class SuperSayin {
    public class SuperSayin {

        String name;
        int powerlevel;

        public void PowerUp(){
            this.powerlevel = this.powerlevel *2;
        }

        public void Stats() {
            System.out.println(this.name + " powerlevel is " + this.powerlevel);
            if(this.powerlevel > 9000)
            {
                System.out.println("Vegeta shouts: ITS OVER 9000!");
            }
        }
        public void Attack(SuperSayin _anySaiyan) {
            _anySaiyan.powerlevel = _anySaiyan.powerlevel -100;
        }

        public void Heal() {

        }

    }
    ///

    // A class is a blueprint to create a type of object

    Student s1 = new Student();
    s1.firstname = "Oscar";
    s1.lastname = "Lopez";
    s1.age = 20;
//     s1.pincode = 1234;


    Student s2 = new Student();
    s2.firstname = "Imran";
    s2.lastname = "Ahmed";
    s2.age = 21;

    SuperSayin ss1 = new SuperSayin();
    ss1.name = "Goku";
    ss1.powerlevel = 1000;
     ss1.PowerUp();

    SuperSayin ss2 = new SuperSayin();
    ss2.name = "Vegeta";
    ss2.powerlevel = 998;
     ss2.PowerUp();
     ss2.Attack(ss1);
     ss1.Stats();
     ss2.Attack(ss1);
}
