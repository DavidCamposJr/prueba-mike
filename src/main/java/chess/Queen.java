package chess;

public class Queen {
    public int possitionX;
    public int possitionY;

    public Queen(int possitionX, int possitionY) {
        this.possitionX = possitionX;
        this.possitionY = possitionY;
    }

    public void validateColission(Queen adversary) {
        validateColissionX(adversary);
        validateColissionY(adversary);
        validateDiagonalRightDown(adversary, 7, 7);
        validateDiagonalRightUp(adversary, 7, 7);

    }

    public void validateColissionX(Queen adversary) {
        if (adversary.possitionX == this.possitionX) {
            System.out.println("Colisión horizontal.");
            System.out.printf("La reina [%d,%d] chocó con la reina [%d, %d]%n",
                    this.possitionX, this.possitionY, adversary.possitionX, adversary.possitionY);
        }
    }

    public void validateColissionY(Queen adversary) {
        if (adversary.possitionY == this.possitionY) {
            System.out.println("Colisión vertical.");
            System.out.printf("La reina [%d,%d] chocó con la reina [%d, %d]%n",
                    this.possitionX, this.possitionY, adversary.possitionX, adversary.possitionY);
        }
    }

    public void validateDiagonalRightDown(Queen adversary, int lenghtX, int lenghtY) {
        for(int i = 0; i <= lenghtX; ++i) {
            int avanceX;
            int avanceY;
            avanceX = i - this.possitionX;
            avanceY = this.possitionY + avanceX;
            if(adversary.possitionX == i && adversary.possitionY == avanceY) {
                System.out.println("Colisión diagonal.");
                System.out.printf("La reina [%d,%d] chocó con la reina [%d, %d]%n",
                        this.possitionX, this.possitionY, adversary.possitionX, adversary.possitionY);
            }
        }
    }

    public void validateDiagonalRightUp(Queen adversary, int lenghtX, int lenghtY) {
        for(int i = 0; i <= lenghtX; ++i) {
            int avanceX;
            int avanceY;
            avanceX = this.possitionX - i;
            avanceY = this.possitionY + avanceX;
            if(adversary.possitionX == i && adversary.possitionY == avanceY) {
                System.out.println("Colisión diagonal inversa.");
                System.out.printf("La reina [%d,%d] chocó con la reina [%d, %d]%n",
                        this.possitionX, this.possitionY, adversary.possitionX, adversary.possitionY);
            }
        }
    }

}
