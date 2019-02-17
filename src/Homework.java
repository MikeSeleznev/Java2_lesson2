public class Homework {

    public static void main(String[] args) {
        Character[][] massive = new Character[4][4];
        massive[0][0] = '0';
        massive[0][1] = '2';
        massive[0][2] = '3';
        massive[0][3] = '4';
        massive[1][0] = '5';
        massive[1][1] = '6';
        massive[1][2] = '7';
        massive[1][3] = '8';
        massive[2][0] = 'c';
        massive[2][1] = '1';
        massive[2][2] = '2';
        massive[2][3] = '3';
        massive[3][0] = '4';
        massive[3][1] = '5';
        massive[3][2] = '6';
        massive[3][3] = '7';

        try {
            myMethod(massive);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }


    public static void myMethod(Character[][] charMassive) throws MyArraySizeException {
        if (!(charMassive.length == 4&&charMassive[0].length == 4)){
            MyArraySizeException my = new MyArraySizeException("Массив не подходит под условие задачи");
            throw my;
        }
            parseMassive(charMassive);

    }

    public static void parseMassive(Character[][] charMassive) throws MyArrayDataException{
        for (int i = 0; i < charMassive.length; i++) {
            for (int j = 0; j < charMassive[0].length; j++) {
                try{
                    int symbol = Integer.parseInt(charMassive[i][j].toString());
                    //MyArrayDataException my2 = new MyArrayDataException("Не удалось преобразовать в ячейке " + i + " " + j);
                   // throw  my2;
                }
                catch (MyArrayDataException e){
                    System.out.println("Не удалось преобразовать в ячейке " + i + " " + j);
                    e.printStackTrace();
                }
            }

        }
    }

}
