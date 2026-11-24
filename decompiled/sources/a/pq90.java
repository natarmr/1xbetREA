package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pq90 implements sq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27405a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public pq90(int i, int i2, String str, boolean z, boolean z2) {
        this.f27405a = str;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq90)) {
            return false;
        }
        pq90 pq90Var = (pq90) obj;
        return this.f27405a.equals(pq90Var.f27405a) && this.b == pq90Var.b && this.c == pq90Var.c && this.d == pq90Var.d && this.e == pq90Var.e;
    }

    @Override // a.sq90
    public final int getId() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, brm0.e(brm0.e(this.f27405a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("SimpleText(description=", this.f27405a, ", isLastItem=", this.b, ", selected=");
        ua80.q(this.d, ", id=", ", textColor=", sbU, this.c);
        return rz4.j(this.e, Separators.RPAREN, sbU);
    }
}
