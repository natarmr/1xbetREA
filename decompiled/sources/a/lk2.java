package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lk2 implements xk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zia f20177a;
    public final long b;

    public lk2(zia ziaVar, long j) {
        this.f20177a = ziaVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk2)) {
            return false;
        }
        lk2 lk2Var = (lk2) obj;
        return this.f20177a.equals(lk2Var.f20177a) && this.b == lk2Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f20177a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCardIndicatorClick(model=" + this.f20177a + ", marketTypeId=" + this.b + Separators.RPAREN;
    }
}
