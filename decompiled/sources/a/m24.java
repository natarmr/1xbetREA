package a;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class m24 {
    public static final m24 b = new m24();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f21038a;

    static {
        hne.s(0, 1, 2, 3, 4);
        vtt0.H(5);
        vtt0.H(6);
    }

    public final AudioAttributes a() {
        AudioAttributes audioAttributes = this.f21038a;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            usage.setAllowedCapturePolicy(1);
            usage.setHapticChannelsMuted(true);
        }
        if (i >= 32) {
            usage.setSpatializationBehavior(0);
            usage.setIsContentSpatialized(false);
        }
        AudioAttributes audioAttributesBuild = usage.build();
        this.f21038a = audioAttributesBuild;
        return audioAttributesBuild;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m24.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}
