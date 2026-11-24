package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eql0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8244a;
    public final dql0 b;

    public eql0(int i, dql0 dql0Var) {
        this.f8244a = i;
        this.b = dql0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eql0)) {
            return false;
        }
        eql0 eql0Var = (eql0) obj;
        return this.f8244a == eql0Var.f8244a && this.b == eql0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f8244a) * 31);
    }

    public final String toString() {
        return "SportTabZipModel(position=" + this.f8244a + ", type=" + this.b + Separators.RPAREN;
    }
}
