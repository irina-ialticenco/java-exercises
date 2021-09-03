public class CodulAscii {
    public static void main(String[] args) {
        char varS = 83;
        char varT = 84;
        char varE = 69;
        char varP = 80;
        char varI = 73;
        char varA = 65;
        char varC = 67;
        char varD = 68;
        char varM = 77;
        char varY = 89;
        char varSpace = 32;

        char[] characters = new char[]{
                varS, varT, varE, varP,
                varSpace,
                varI, varT,
                varSpace,
                varA, varC, varA, varD, varE, varM, varY
        };

        for( int i =0; i<characters.length;i++ ){
            System.out.print(characters[i]);
        }

        /*System.out.print(varS);
        System.out.print(varT);
        System.out.print(varE);
        System.out.print(varP);
        System.out.print(varSpace);
        System.out.print(varI);
        System.out.print(varT);
        System.out.print(varSpace);
        System.out.print(varA);
        System.out.print(varC);
        System.out.print(varA);
        System.out.print(varD);
        System.out.print(varE);
        System.out.print(varM);
        System.out.print(varY);
*/
    }
}