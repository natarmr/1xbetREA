package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fwh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko7 f10260a;
    public final boolean b;
    public final boolean c;

    public fwh0(ko7 ko7Var, boolean z, boolean z2) {
        this.f10260a = ko7Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwh0)) {
            return false;
        }
        fwh0 fwh0Var = (fwh0) obj;
        return this.f10260a.equals(fwh0Var.f10260a) && this.b == fwh0Var.b && this.c == fwh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f10260a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentKeyModel(betTypeUiModel=");
        sb.append(this.f10260a);
        sb.append(", hasPromoTab=");
        sb.append(this.b);
        sb.append(", hasAutoTab=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
