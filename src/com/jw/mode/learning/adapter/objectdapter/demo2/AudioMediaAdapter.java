package com.jw.mode.learning.adapter.objectdapter.demo2;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/04/30
 * @description
 */
public class AudioMediaAdapter implements MediaPlayer {

  @Override
  public void play(MediaType mediaType, String filePath) {
    switch (mediaType) {
      case MP3:
        System.out.println("MP3格式，直接播放");
        break;
      case MP4:
        System.out.println("MP4格式，提取MP4文件的音频");
        break;
      default:
        System.out.println("unsupported media type.");
        return;
    }
    doPlayAudio(filePath);
  }

  private void doPlayAudio(String filePath) {
    System.out.println("播放音频[音频来自]");
    System.out.println(String.format("播放音频[音频来自文件:%s]", filePath));
  }
}
