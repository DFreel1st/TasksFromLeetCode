import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class n1805 {

    public static void main(String[] args) {
        String exampleOne = "3lnhx1n3h5vcb6l7mj3541oimktoxoqk4k8fl5bsur6duunwwsxfv5lmh9nikrihrvrupz846p32wk1hg0haqhubmux8z2ypas3r4c5qz3z78m1bvddlprgobs0i40t8rzoqznydwiz77brqs9ebt7og5db8gqzyctwcfopoho2g3xy575aex6l0mq9j2wekz17hz7bhip95evvt8egpd06c31g6oboi7swik9y50rsl7656ek0kutxr72qgw6xz0eukl63ktp7i0txrj7helqydgh2bo84e8adv9p5jlhep0ma1ff0a85pejprrdhme3260y2jk6ikw6z230rdql58bywjmjxfkx51x7hx7ecivu77m05hph942c7fe9ixd1q6er9p6pcozkdfd417mcklxakfvdv66cogmo6buqfwff2741u0sw8lo7t1rmp4gzbst2ag5k7alkaajyw5ilyzae866zj875p2to4a0ezu2l4ev8gm8zifgkamitw4jlij61vjmzbvmpz6shz87itepu611h4bulsc7w5avqd176n70eyovulnqtu2exsea7mu11gejustlqxo5rpsmbd0gy0ux8eul526tkxpudp73luzcxzfen2tmmvlb6ycod7zbjwy36gk7bftai2j4bdwo598pdmqaiucz5ht1eofv3uftfd26o76qs7dpcl5nxs98sv2z7frubxf36y8ctkyt6grrz19a3w7g81suggnfdy3vne3urcehxnt57q0zpwhcv37pmjt9p3syeuj5g8bjq4jeptzu1p1yd1gqgijer92xsbn1mb7f8a07eaehlr0gxfs7dfyntjm07qd1p2m3x834c9ik0ra4oauwhjl7q6kzy2uawx7drdvdj4q5n047k1r4h3edql4iakqcvpk3rnw6rxfy0tsxt3m0xjtl9wt066x4cnnbl718f850ghy5vgspllnetwqdh0b3c1uw6o8p4zl1kbhopa99";
        String exampleTwo = "";
        n1805 one = new n1805();
        one.numDifferentIntegers(exampleOne);
    }

    public int numDifferentIntegers(String word) {
        if (word.matches("[0-9]*")) return 1;

        String newWord = word.replaceAll("[a-z]", " ");

        if (newWord.length() == 0) return 0;

        ArrayList<String> arrayList = new ArrayList<>(List.of(newWord.strip().split(" ")));

        HashSet<String> stringHashSet = new HashSet<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == "") continue;

            if (arrayList.get(i).matches("^0+[0-9]*")) {
                arrayList.set(i, arrayList.get(i).replaceAll("^0+(?!$)",""));
//                System.out.println(arrayList.get(i));
            }

            stringHashSet.add(arrayList.get(i));
        }

//        System.out.println(stringHashSet.size());
//        System.out.println(stringHashSet);

        return stringHashSet.size();
    }
}