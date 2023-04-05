public class Main {
    public static void main(String[] args) {
        sayiBulacak();
    }

    public static void sayiBulacak() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varmi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varmi = true;
                break;
            }
        }

        if (varmi) {
            mesajVer(aranacak);
        } else {
            System.out.println("mevcut degildir");
        }
    }

        public static void mesajVer(int aranacak){
            System.out.println("sayi mevcuttur: " +aranacak);
        }
    }
