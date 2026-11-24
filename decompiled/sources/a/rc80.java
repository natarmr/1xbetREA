package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rc80 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjm f30225a;
    public final qc80 b;

    public rc80(jjm jjmVar, qc80 qc80Var) {
        this.f30225a = jjmVar;
        this.b = qc80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc80)) {
            return false;
        }
        rc80 rc80Var = (rc80) obj;
        return this.f30225a.equals(rc80Var.f30225a) && this.b.equals(rc80Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return String.valueOf(this.f30225a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30225a.hashCode() * 31);
    }

    public final String toString() {
        return "OtherHeaderUiItem(model=" + this.f30225a + ", groupHeader=" + this.b + Separators.RPAREN;
    }
}
