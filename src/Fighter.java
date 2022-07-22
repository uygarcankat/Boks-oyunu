import java.lang.management.MemoryType;

public class Fighter {

    String name;
    int damage;
    int dodge;
    int health;
    int weight;

    Fighter(String name,int damage,int health,int weight, int dodge){

       this.name=name;
       this.damage=damage;
       this.health=health ;
       this.weight=weight;
       if(dodge>0 && dodge<100 ){

           this.dodge=dodge;

       }

       else{

           this.dodge=0;
           System.out.println("dodge kabul edilen aralıkta değildir!");
       }


    }


    int hit(Fighter foe){

        double random_number =  Math.random() * 100;
        if(random_number<=50) {

            System.out.println(this.name + "-->" + foe.name + "'e " + this.damage + " hasar verdi ");

            foe.health = foe.health - this.damage;



            if(foe.health<0){

                System.out.println("Tebrikler ! "+ this.name+  " oyunu kazandı");

                System.exit(0);

            }
            System.out.println(foe.name + " : "+ foe.health);

        }

        else{

            System.out.println(this.name + " rakip oyuncuya isabet ettiremedi. ");
        }



        return foe.health;
    }


    boolean dodge(Fighter foe){

        double random_number =  Math.random() *100;

        if(random_number<=this.dodge){

            System.out.println(this.name + " saldırıyı savuşturdu");

            return false;
        }

        else{

            return true;
        }

    }






}

