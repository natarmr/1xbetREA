package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mgl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8l0 f21749a;
    public final g8l0 b;
    public final j8l0 c;
    public final k8l0 d;

    public mgl0(i8l0 i8l0Var, g8l0 g8l0Var, j8l0 j8l0Var, k8l0 k8l0Var) {
        this.f21749a = i8l0Var;
        this.b = g8l0Var;
        this.c = j8l0Var;
        this.d = k8l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgl0)) {
            return false;
        }
        mgl0 mgl0Var = (mgl0) obj;
        return this.f21749a == mgl0Var.f21749a && this.b == mgl0Var.b && this.c == mgl0Var.c && this.d == mgl0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f21749a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SportItemsConfig(iconStylePath=" + this.f21749a + ", filterStyle=" + this.b + ", listStyle=" + this.c + ", popularSportStyle=" + this.d + Separators.RPAREN;
    }
}
