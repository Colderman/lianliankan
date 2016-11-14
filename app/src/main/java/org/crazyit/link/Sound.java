package org.crazyit.link;
//Download by http://www.codefans.net

import java.util.HashMap;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

public class Sound {

	//媒体播放器
	private MediaPlayer mp = null;
	public void play() {
		//mp = MediaPlayer.create, R.raw.bg);
		mp.setLooping(true);

	}
}
