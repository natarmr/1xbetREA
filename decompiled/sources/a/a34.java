package a;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final m24 d;
    public final Object e;

    public a34(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, m24 m24Var, boolean z) {
        this.f155a = i;
        this.c = handler;
        this.d = m24Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.b = new z24(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.e = new AudioFocusRequest.Builder(i).setAudioAttributes(m24Var.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z).build();
        } else {
            this.e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a34)) {
            return false;
        }
        a34 a34Var = (a34) obj;
        return this.f155a == a34Var.f155a && Objects.equals(this.b, a34Var.b) && this.c.equals(a34Var.c) && Objects.equals(this.d, a34Var.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f155a), this.b, this.c, this.d, Boolean.FALSE);
    }
}
