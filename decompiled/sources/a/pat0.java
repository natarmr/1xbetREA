package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pat0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26671a;
    public final q8m b;

    public pat0(String str, q8m q8mVar) {
        this.f26671a = str;
        this.b = q8mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pat0)) {
            return false;
        }
        pat0 pat0Var = (pat0) obj;
        return this.f26671a.equals(pat0Var.f26671a) && this.b.equals(pat0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f26671a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26671a.hashCode() * 31);
    }

    public final String toString() {
        return "UniversalChampPrizePoolCellUiModel(key=" + this.f26671a + ", cell=" + this.b + Separators.RPAREN;
    }
}
