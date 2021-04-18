package org.My.Daemon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

  //  public static void main(String[] args){
  //      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
     //           "applicationContex.xml");
 // MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
   //     MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

 /* boolean comparison = firstMusicPlayer==secondMusicPlayer;
  System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
 // musicPlayer.playMusic();
//System.out.println(musicPlayer.getVolume());
     //   System.out.println(musicPlayer.getName())*/

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(EMusic.CLASSIC);
        player.playMusic(EMusic.ROCK);
        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player1.getVolume());

        context.close();
    }



}
