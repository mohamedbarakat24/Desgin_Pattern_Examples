package proxy;
public class ProxyPatternDemoMain {

    public static void main(String[] args) {

        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // The image will be loaded from disk and displayed
        image1.display();
        System.out.println();

        // The image is already loaded, so it will just be displayed
        image1.display();
        System.out.println();

        // The image will be loaded from disk and displayed
        image2.display();
        //output
        //        Loading image1.jpg
        //        Displaying image1.jpg
        //
        //        Displaying image1.jpg
        //
        //        Loading image2.jpg
        //        Displaying image2.jpg

    }
}