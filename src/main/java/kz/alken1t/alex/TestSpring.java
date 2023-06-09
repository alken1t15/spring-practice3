package kz.alken1t.alex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        TestBean testBean = context.getBean("testBean",TestBean.class);
//        System.out.println(testBean.getName());

      //  Music music = context.getBean("musicBean", Music.class);
       // MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        musicPlayer.playAllMusic();
        context.close();
    }
}
