package a;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: classes.dex */
public final class r24 extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ krs0 f29711a;

    public r24(krs0 krs0Var) {
        this.f29711a = krs0Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f29711a.j();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        krs0 krs0Var = this.f29711a;
        if (vtt0.l((AudioDeviceInfo) krs0Var.j, audioDeviceInfoArr)) {
            krs0Var.j = null;
        }
        krs0Var.j();
    }
}
