package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ewh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko7 f8526a;
    public final boolean b;
    public final boolean c;

    public ewh0(ko7 ko7Var, boolean z, boolean z2) {
        this.f8526a = ko7Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewh0)) {
            return false;
        }
        ewh0 ewh0Var = (ewh0) obj;
        return this.f8526a.equals(ewh0Var.f8526a) && this.b == ewh0Var.b && this.c == ewh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f8526a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentKeyModel(betTypeUiModel=");
        sb.append(this.f8526a);
        sb.append(", hasPromoTab=");
        sb.append(this.b);
        sb.append(", hasAutoTab=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
