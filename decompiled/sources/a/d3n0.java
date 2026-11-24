package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class d3n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5411a;
    public final String b;

    public d3n0(int i, String str) {
        this.f5411a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3n0)) {
            return false;
        }
        d3n0 d3n0Var = (d3n0) obj;
        return this.f5411a == d3n0Var.f5411a && this.b.equals(d3n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f5411a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f5411a, "SubSportModel(id=", ", name=", this.b, Separators.RPAREN);
    }
}
