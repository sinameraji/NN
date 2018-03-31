import java.util.Random;

class Perceptron {
    double[] weights = new double[2];
    Random rand;
    
    Perceptron(){
        for (int i = 0; i < weights.length; i++){
            weights[i] = rand.nextInt(3) - 1;
        }
    }
}