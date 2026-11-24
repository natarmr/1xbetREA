package a;

import android.util.Range;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class h55 {
    public static final Range h = new Range(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f12463a;
    public final Size b;
    public final agn c;
    public final int d;
    public final Range e;
    public final drd f;
    public final boolean g;

    public h55(Size size, Size size2, agn agnVar, int i, Range range, drd drdVar, boolean z) {
        this.f12463a = size;
        this.b = size2;
        this.c = agnVar;
        this.d = i;
        this.e = range;
        this.f = drdVar;
        this.g = z;
    }

    public static qgd a(Size size) {
        qgd qgdVar = new qgd((byte) 3);
        if (size == null) {
            hny.u("Null resolution");
            return null;
        }
        qgdVar.b = size;
        qgdVar.c = size;
        qgdVar.e = 0;
        Range range = h;
        if (range == null) {
            hny.u("Null expectedFrameRateRange");
            return null;
        }
        qgdVar.f = range;
        qgdVar.d = agn.d;
        qgdVar.h = Boolean.FALSE;
        return qgdVar;
    }

    public final qgd b() {
        qgd qgdVar = new qgd((byte) 3);
        qgdVar.b = this.f12463a;
        qgdVar.c = this.b;
        qgdVar.d = this.c;
        qgdVar.e = Integer.valueOf(this.d);
        qgdVar.f = this.e;
        qgdVar.g = this.f;
        qgdVar.h = Boolean.valueOf(this.g);
        return qgdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h55) {
            h55 h55Var = (h55) obj;
            if (this.f12463a.equals(h55Var.f12463a) && this.b.equals(h55Var.b) && this.c.equals(h55Var.c) && this.d == h55Var.d && this.e.equals(h55Var.e)) {
                drd drdVar = h55Var.f;
                drd drdVar2 = this.f;
                if (drdVar2 != null ? drdVar2.equals(drdVar) : drdVar == null) {
                    if (this.g == h55Var.g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f12463a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        drd drdVar = this.f;
        return (this.g ? 1231 : 1237) ^ ((iHashCode ^ (drdVar == null ? 0 : drdVar.hashCode())) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.f12463a);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.b);
        sb.append(", dynamicRange=");
        sb.append(this.c);
        sb.append(", sessionType=");
        sb.append(this.d);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", zslDisabled=");
        return rw2.p(sb, this.g, "}");
    }
}
