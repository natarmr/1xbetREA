package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iq90 implements nq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15199a;
    public final String b;

    public iq90(int i, String str) {
        this.f15199a = i;
        this.b = str;
    }

    @Override // a.nq90
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq90)) {
            return false;
        }
        iq90 iq90Var = (iq90) obj;
        return this.f15199a == iq90Var.f15199a && this.b.equals(iq90Var.b);
    }

    @Override // a.nq90
    public final int getId() {
        return this.f15199a;
    }

    @Override // a.nq90
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + brm0.e(Integer.hashCode(this.f15199a) * 31, 31, false);
    }

    public final String toString() {
        return defpackage.c.b(this.f15199a, "Document(id=", ", isRecommend=false, title=", this.b, Separators.RPAREN);
    }
}
