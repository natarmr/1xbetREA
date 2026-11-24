package a;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes.dex */
public final class k44 extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oif0 f17649a;

    public k44(oif0 oif0Var) {
        this.f17649a = oif0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        ((l44) this.f17649a.d).i.e(-1, new jf4((byte) 18));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        ((l44) this.f17649a.d).i.e(-1, new jf4((byte) 19));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        ((l44) this.f17649a.d).i.e(-1, new jf4((byte) 18));
    }
}
