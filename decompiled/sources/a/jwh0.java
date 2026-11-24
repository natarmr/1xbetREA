package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jwh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko7 f17251a;
    public final boolean b;
    public final boolean c;

    public jwh0(ko7 ko7Var, boolean z, boolean z2) {
        this.f17251a = ko7Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwh0)) {
            return false;
        }
        jwh0 jwh0Var = (jwh0) obj;
        return this.f17251a.equals(jwh0Var.f17251a) && this.b == jwh0Var.b && this.c == jwh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f17251a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentKeyModel(betTypeUiModel=");
        sb.append(this.f17251a);
        sb.append(", hasPromoTab=");
        sb.append(this.b);
        sb.append(", hasAutoTab=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
