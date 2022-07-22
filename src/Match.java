public class Match {

    Fighter f1;
    Fighter f2;
    int min_weight;
    int max_weight;


    Match(Fighter f1, Fighter f2, int min_weight, int max_weight) {

        this.f1 = f1;
        this.f2 = f2;
        this.min_weight = min_weight;
        this.max_weight = max_weight;

    }

    void run() {

        if (isCheck()) {
            while (this.f1.health >= 0 && this.f2.health >= 0) {

                System.out.println("Round başladı");
                System.out.println("--------------------------");


                if (f2.dodge(f1)) {

                    f1.hit(f2);

                }

                if (f1.dodge(f2)) {

                    f2.hit(f1);
                }

                System.out.println("*******ROUND SONU***********");
            }
        } else {

            System.out.println("Kilo aralıkları kriterleri karşılamıyor");
        }

    }

    boolean isCheck() {

        return (this.f1.weight >= min_weight && this.f1.weight <= max_weight) && (this.f2.weight >= min_weight && this.f2.weight <= max_weight);
    }
}
