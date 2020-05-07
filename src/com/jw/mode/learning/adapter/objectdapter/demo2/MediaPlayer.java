package com.jw.mode.learning.adapter.objectdapter.demo2;

/**
 * @author NOknow
 * @version 1.0
 * @date 2020/04/30
 * @description
 */
public interface MediaPlayer {

  void play(MediaType mediaType, String filePath);

  enum MediaType {
    MP3, MP4
  }
}
