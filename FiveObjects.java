//Создать классы, описывающие 5 любых предметов (например - электрочайник, книгу, телефон, гелевую ручку, купюру в 10 гривен, и тп).


import java.util.Date;

public class FiveObjects {

    public static void main(String[] args) {

        Flower orchid = new Flower("White", "Orchid", 0.5, new Date(2016, 9, 24), new Date(2016, 12, 24));
        System.out.println(orchid.toString());

        Lipstick myLipstick = new Lipstick("Glam_shine", 545.32, "Rose");
        System.out.println(myLipstick.toString());

        Child child = new Child("Adam Smith", "Marta Smith", new Date(2000, 9, 12), "male", "chess", "Treasure Island", "potatoes");
        System.out.println(child.toString());

        Painting galleryPainting = new Painting("Salvador Dali", "Oil on canvas", "The Persistence of Memory", "Cadaques", " New York City");
        System.out.println(galleryPainting.toString());

        CD favouriteCD = new CD("Bob Marley", "Bob Marley and the Wailers", "Africa unite", new Date(1989, 9, 21), "Raggae", 12);
        System.out.println(favouriteCD.toString());
    }

    static public class Flower {

        String type;
        String colour;
        double height;
        Date plantTime;
        Date blossomTime;

        public Flower(String colour, String type, double height, Date plantTime, Date blossomTime) {
            this.colour = colour;
            this.type = type;
            this.height = height;
            this.plantTime = plantTime;
            this.blossomTime = blossomTime;
        }

        @Override
        public String toString() {
            return "Flower{" +
                    "type='" + type + '\'' +
                    ", colour='" + colour + '\'' +
                    ", height=" + height +
                    ", plantTime=" + plantTime +
                    ", blossomTime=" + blossomTime +
                    '}';
        }
    }

    public static class Lipstick {

        String type;
        double price;
        String colour;

        public Lipstick(String type, double price, String colour) {
            this.type = type;
            this.price = price;
            this.colour = colour;
        }

        @Override
        public String toString() {
            return "Lipstick{" +
                    "type='" + type + '\'' +
                    ", price=" + price +
                    ", colour='" + colour + '\'' +
                    '}';
        }
    }

    static public class Child {

        String father;
        String mother;
        Date birthday;
        String sex;
        String hobby;
        String favouriteMeal;
        String favouriteBook;

        public Child(String father, String mother, Date birthday, String sex, String hobby, String favouriteBook, String favouriteMeal) {
            this.father = father;
            this.mother = mother;
            this.birthday = birthday;
            this.sex = sex;
            this.hobby = hobby;
            this.favouriteBook = favouriteBook;
            this.favouriteMeal = favouriteMeal;
        }

        @Override
        public String toString() {
            return "Child{" +
                    "father='" + father + '\'' +
                    ", mother='" + mother + '\'' +
                    ", birthday=" + birthday +
                    ", sex='" + sex + '\'' +
                    ", hobby='" + hobby + '\'' +
                    ", favouriteMeal='" + favouriteMeal + '\'' +
                    ", favouriteBook='" + favouriteBook + '\'' +
                    '}';
        }
    }

    static public class Painting {

        String author;
        String name;
        String type;
        String placeOfCreation;
        String placeOfStorage;


        public Painting(String author, String type, String name, String placeOfCreation, String placeOfStorage) {
            this.author = author;
            this.name = name;
            this.type = type;
            this.placeOfCreation = placeOfCreation;
            this.placeOfStorage = placeOfStorage;
        }


        @Override
        public String toString() {
            return "Painting{" +
                    "author='" + author + '\'' +
                    ", name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", placeOfCreation='" + placeOfCreation + '\'' +
                    ", placeOfStorage='" + placeOfStorage + '\'' +
                    '}';
        }
    }

    static public class CD {

        String composer;
        String artist;
        String albumName;
        Date releaseDate;
        String genre;
        int songsQuantity;


        public CD(String composer, String artist, String albumName, Date releaseDate, String genre, int songsQuantity) {
            this.composer = composer;
            this.artist = artist;
            this.albumName = albumName;
            this.releaseDate = releaseDate;
            this.genre = genre;
            this.songsQuantity = songsQuantity;
        }

        @Override
        public String toString() {
            return "CD{" +
                    "composer='" + composer + '\'' +
                    ", artist='" + artist + '\'' +
                    ", albumName='" + albumName + '\'' +
                    ", releaseDate=" + releaseDate +
                    ", genre='" + genre + '\'' +
                    ", songsQuantity=" + songsQuantity +
                    '}';
        }
    }
}

