package a;

import android.gov.nist.core.Separators;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class m78 extends a4d {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public m78(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            kw2.g();
            porterDuffColorFilter = kw2.c(fbc.U(j), dj8.b0(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(fbc.U(j), dj8.d0(i));
        }
        super(porterDuffColorFilter);
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m78)) {
            return false;
        }
        m78 m78Var = (m78) obj;
        long j = m78Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && this.c == m78Var.c;
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return b1j.k("BlendModeColorFilter(color=", y3d.i(this.b), ", blendMode=", l78.a(this.c), Separators.RPAREN);
    }
}
