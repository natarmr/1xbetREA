package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class b8e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2152a;
    public final String b;
    public final int c;

    public b8e0(int i, String str, String str2) {
        this.f2152a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8e0)) {
            return false;
        }
        b8e0 b8e0Var = (b8e0) obj;
        return this.f2152a.equals(b8e0Var.f2152a) && this.b.equals(b8e0Var.b) && this.c == b8e0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f2152a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("RatingTableColumnHeaderModel(title=", this.f2152a, ", subTitle=", this.b, ", columCount="));
    }
}
