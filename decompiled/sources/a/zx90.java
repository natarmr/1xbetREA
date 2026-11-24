package a;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zx90 {
    public static final zx90 d = new zx90(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f45148a;
    public final float b;
    public final int c;

    static {
        vtt0.H(0);
        vtt0.H(1);
    }

    public zx90(float f, float f2) {
        x0x.A(f > 0.0f);
        x0x.A(f2 > 0.0f);
        this.f45148a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zx90.class == obj.getClass()) {
            zx90 zx90Var = (zx90) obj;
            if (this.f45148a == zx90Var.f45148a && this.b == zx90Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.f45148a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f45148a), Float.valueOf(this.b)};
        String str = vtt0.f38024a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
