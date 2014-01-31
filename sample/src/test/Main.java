package test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

  public static void main(String[] args){
    Frame frame = new Frame();
    frame.setTitle("Title");
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        super.windowClosing(e);
        System.exit(0);
      }
    });
    frame.setVisible(true);
  }



}
