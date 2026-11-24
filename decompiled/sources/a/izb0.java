package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class izb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15628a;
    public final String b;
    public final int c;

    public izb0(int i, String str, String str2) {
        this.f15628a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izb0)) {
            return false;
        }
        izb0 izb0Var = (izb0) obj;
        return this.f15628a.equals(izb0Var.f15628a) && this.b.equals(izb0Var.b) && this.c == izb0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f15628a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("ProductItemModel(img=", this.f15628a, ", name=", this.b, ", productId="));
    }
}
