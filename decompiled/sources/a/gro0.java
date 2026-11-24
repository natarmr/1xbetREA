package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gro0 implements sso0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final foo0 f11790a;
    public final d4d b;

    public gro0(foo0 foo0Var, d4d d4dVar) {
        this.f11790a = foo0Var;
        this.b = d4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gro0)) {
            return false;
        }
        gro0 gro0Var = (gro0) obj;
        return this.f11790a == gro0Var.f11790a && this.b == gro0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11790a.hashCode() * 31);
    }

    public final String toString() {
        return "RectangularLFilledOutlined(backgroundColor=" + this.f11790a + ", borderColorKey=" + this.b + Separators.RPAREN;
    }
}
