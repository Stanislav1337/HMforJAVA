package HM6;



import java.io.IOException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        List<Description> list = new ArrayList<>();

        Description note1 = new Description(17.6, "hp", "i4", "windows", 4, 128);
        Description note2 = new Description(13.6, "asus", "i4", "linux", 32, 256);
        Description note3 = new Description(15.6, "samsung", "i3", "windows", 16, 64);
        Description note4 = new Description(12.6, "macbook", "m1", "macos", 8, 128);
        Description note5 = new Description(14.6, "acer", "i7", "dos", 16, 64);
        Description note6 = new Description(11.6, "lenovo", "i9", "chromeos", 32, 256);

        Collections.addAll(list, note1, note2, note3, note4, note5, note6);

        System.out.print("""
                1 - модель
                2 - диогональ экрана
                3 - процессор
                4 - операционная система
                5 - оперативная память
                6 - объем накопителя
                введите критерий сортировки через пробел:\s""");


        Scanner in = new Scanner(System.in);
        String[] choice = in.nextLine().split(" ");

        try {
            for (String str : choice) {
                switch (str) {
                    case "1" -> {
                        System.out.print("введите модель (acer, lenova, hp, asus, macbook): ");
                        modelSort(list, in.next().toLowerCase());
                        System.out.println(list);
                    }
                    case "2" -> {
                        System.out.print("введите размер диогонали (13.3, 15.6, 17.0): ");
                        sizeSort(list, in.next().toLowerCase());
                        System.out.println(list);
                    }
                    case "3" -> {
                        System.out.print("введите модель процессора (i3, i5, i7): ");
                        cpuSort(list, in.next().toLowerCase());
                        System.out.println(list);
                    }
                    case "4" -> {
                        System.out.println("введите операционную систему (linux, windows, ios): ");
                        osSort(list, in.next().toLowerCase());
                        System.out.println(list);
                    }
                    case "5" -> {
                        System.out.print("введите объем ОЗУ(4, 8, 16, 32): ");
                        ramSort(list, in.next());
                        System.out.println(list);
                    }
                    case "6" -> {
                        System.out.print("введите объем накопителя(128, 254, 512, 1024): ");
                        ssdSort(list, in.next().toLowerCase());
                        System.out.println(list);
                    }
                    default -> throw new Exception();
                }
            }
        } catch (Exception e) {
            System.out.println("введены не корректные данные!!!");
        }

        in.close();
    }
        private static void modelSort(List<Description> list, String str) {

            list.removeIf(item -> !str.equals(item.getMODEL()));
        }

        private static void sizeSort(List<Description> list, String str) {

            list.removeIf(item -> !str.equals(item.getSIZE().toString()));

        }

        private static void cpuSort(List<Description> list, String str) {

            list.removeIf(item -> !str.equals(item.getCPU()));
        }

        private static void osSort(List<Description> list, String str) {
            list.removeIf(item -> !str.equals(item.getOS()));
        }

        private static void ramSort(List<Description> list, String str) {

            list.removeIf(item -> !(item.getRAM() == Integer.parseInt(str)));
        }

        private static void ssdSort(List<Description> list, String str) {

            list.removeIf(item -> !(item.getSSD() == Integer.parseInt(str)));
        }














    }























