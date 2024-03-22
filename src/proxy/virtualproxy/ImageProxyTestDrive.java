package proxy.virtualproxy;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable<String, String> photos = new Hashtable<String, String>();

    public static void main(String[] args) throws MalformedURLException {
        ImageProxyTestDrive imageProxyTestDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws MalformedURLException {
        photos.put("Young Messi", "https://e1.pxfuel.com/desktop-wallpaper/110/847/desktop-wallpaper-sayooj-leo-on-twitter-messi-young.jpg");

        URL initialUrl = new URL(photos.get("Young Messi"));
        menuBar = new JMenuBar();
        menu = new JMenu("King");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration<String> e = photos.keys(); e.hasMoreElements();) {
            String name = e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(event -> {
                imageComponent.setIcon(new ImageProxy(getAlbumUrl(event.getActionCommand())));
                frame.repaint();
            });
        }

        Icon icon = new ImageProxy(initialUrl);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    private URL getAlbumUrl(String name) {
        try {
            return new URL(photos.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}