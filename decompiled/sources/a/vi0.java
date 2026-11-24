package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class vi0 implements gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37453a;
    public final ti0 b;

    public vi0(String str, ti0 ti0Var) {
        this.f37453a = str;
        this.b = ti0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi0)) {
            return false;
        }
        vi0 vi0Var = (vi0) obj;
        return this.f37453a.equals(vi0Var.f37453a) && this.b.equals(vi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37453a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthorizationBannerModel(id=" + this.f37453a + ", headerModel=" + this.b + Separators.RPAREN;
    }
}
