package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ya00 implements db00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42272a;
    public final boolean b;
    public final mdm c;

    public ya00(boolean z, boolean z2, mdm mdmVar) {
        this.f42272a = z;
        this.b = z2;
        this.c = mdmVar;
    }

    @Override // a.db00
    public final boolean a() {
        return this.b;
    }

    @Override // a.db00
    public final boolean b() {
        return this.f42272a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya00)) {
            return false;
        }
        ya00 ya00Var = (ya00) obj;
        return this.f42272a == ya00Var.f42272a && this.b == ya00Var.b && this.c.equals(ya00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f42272a) * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.m(f140.q("Error(isExpanded=", ", isImplemented=", ", lottieConfig=", this.f42272a, this.b), this.c, Separators.RPAREN);
    }
}
