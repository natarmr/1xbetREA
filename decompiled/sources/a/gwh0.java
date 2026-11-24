package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gwh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fo7 f12028a;
    public final boolean b;
    public final boolean c;

    public gwh0(fo7 fo7Var, boolean z, boolean z2) {
        this.f12028a = fo7Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwh0)) {
            return false;
        }
        gwh0 gwh0Var = (gwh0) obj;
        return this.f12028a.equals(gwh0Var.f12028a) && this.b == gwh0Var.b && this.c == gwh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f12028a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentKeyModel(betTypeStateModel=");
        sb.append(this.f12028a);
        sb.append(", hasPromoTab=");
        sb.append(this.b);
        sb.append(", hasAutoTab=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
