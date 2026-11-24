package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cl30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4537a;
    public final int b;
    public final int c;
    public final int d;

    public cl30(int i, int i2, int i3, String str) {
        this.f4537a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl30)) {
            return false;
        }
        cl30 cl30Var = (cl30) obj;
        return this.f4537a.equals(cl30Var.f4537a) && this.b == cl30Var.b && this.c == cl30Var.c && this.d == cl30Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, this.f4537a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", bronze=", Separators.RPAREN, kng0.p(this.b, "MedalsModel(competition=", this.f4537a, ", gold=", ", silver="));
    }
}
