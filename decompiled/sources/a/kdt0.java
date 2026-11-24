package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kdt0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18123a;
    public final jam b;

    public kdt0(String str, jam jamVar) {
        this.f18123a = str;
        this.b = jamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdt0)) {
            return false;
        }
        kdt0 kdt0Var = (kdt0) obj;
        return this.f18123a.equals(kdt0Var.f18123a) && this.b.equals(kdt0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f18123a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18123a.hashCode() * 31);
    }

    public final String toString() {
        return "UniversalRatingTableUiModel(key=" + this.f18123a + ", table=" + this.b + Separators.RPAREN;
    }
}
