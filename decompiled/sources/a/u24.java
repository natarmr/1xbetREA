package a;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class u24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f34929a;
    public AudioFocusRequest b;

    public u24(us00 us00Var) {
        Object systemService = us00Var.getSystemService("audio");
        systemService.getClass();
        this.f34929a = (AudioManager) systemService;
    }

    public final void a() {
        AudioManager audioManager = this.f34929a;
        audioManager.setMode(3);
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.requestAudioFocus(null, 0, 1);
            return;
        }
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(2).setContentType(1).build();
        audioAttributesBuild.getClass();
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(audioAttributesBuild).build();
        audioFocusRequestBuild.getClass();
        this.b = audioFocusRequestBuild;
        audioManager.requestAudioFocus(audioFocusRequestBuild);
    }
}
