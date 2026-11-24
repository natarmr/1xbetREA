package a;

import androidx.media3.common.MediaItem;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ly90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20852a;
    public final int b;
    public final MediaItem c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        hne.s(0, 1, 2, 3, 4);
        vtt0.H(5);
        vtt0.H(6);
    }

    public ly90(Object obj, int i, MediaItem mediaItem, Object obj2, int i2, long j, long j2, int i3, int i4) {
        x0x.A(i >= 0);
        x0x.A(i2 >= 0);
        this.f20852a = obj;
        this.b = i;
        this.c = mediaItem;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ly90.class == obj.getClass()) {
            ly90 ly90Var = (ly90) obj;
            if (this.b == ly90Var.b && this.e == ly90Var.e && this.f == ly90Var.f && this.g == ly90Var.g && this.h == ly90Var.h && this.i == ly90Var.i && Objects.equals(this.c, ly90Var.c) && Objects.equals(this.f20852a, ly90Var.f20852a) && Objects.equals(this.d, ly90Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20852a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        StringBuilder sbT = brm0.t(str, ", contentPos=");
        ua80.v(sbT, this.g, ", adGroup=", i);
        sbT.append(", ad=");
        sbT.append(this.i);
        return sbT.toString();
    }
}
