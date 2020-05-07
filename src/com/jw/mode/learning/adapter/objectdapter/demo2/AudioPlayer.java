package com.jw.mode.learning.adapter.objectdapter.demo2;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/04/30
 * @description
 */
public class AudioPlayer implements MediaPlayer {

  private AudioMediaAdapter audioMediaAdapter;

  @Override
  public void play(MediaType mediaType, String filePath) {
    switch (mediaType) {
      case MP3:
        System.out.println(String.format("MP3格式，直接播放[%s]", filePath));
        break;
      case MP4:
        System.out.println(String.format("MP4格式，提取[%s]MP4文件的音频", filePath));
        break;
      default:
        System.out.println("unsupported media type.");
        return;
    }
    audioMediaAdapter.play(mediaType, filePath);
  }
}
