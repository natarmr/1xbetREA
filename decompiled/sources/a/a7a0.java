package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a7a0 implements c7a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4n f357a;
    public final boolean b;

    public a7a0(j4n j4nVar, boolean z) {
        this.f357a = j4nVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7a0)) {
            return false;
        }
        a7a0 a7a0Var = (a7a0) obj;
        return this.f357a.equals(a7a0Var.f357a) && this.b == a7a0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f357a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(value=" + this.f357a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
