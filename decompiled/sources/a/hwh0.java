package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hwh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fo7 f13769a;
    public final boolean b;
    public final boolean c;

    public hwh0(fo7 fo7Var, boolean z, boolean z2) {
        this.f13769a = fo7Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwh0)) {
            return false;
        }
        hwh0 hwh0Var = (hwh0) obj;
        return this.f13769a.equals(hwh0Var.f13769a) && this.b == hwh0Var.b && this.c == hwh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f13769a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentKeyModel(betTypeStateModel=");
        sb.append(this.f13769a);
        sb.append(", hasPromoTab=");
        sb.append(this.b);
        sb.append(", hasAutoTab=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
