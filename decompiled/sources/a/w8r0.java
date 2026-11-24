package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w8r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38737a;
    public final String b;

    public w8r0(int i, String str) {
        this.f38737a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8r0)) {
            return false;
        }
        w8r0 w8r0Var = (w8r0) obj;
        return this.f38737a == w8r0Var.f38737a && this.b.equals(w8r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f38737a) * 31);
    }

    public final String toString() {
        return b1j.k("TopPlayerColumnModel(id=", kcm0.a(this.f38737a), ", shortTitle=", this.b, Separators.RPAREN);
    }
}
