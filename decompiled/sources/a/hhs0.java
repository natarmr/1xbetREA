package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hhs0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13081a;
    public final edm b;

    public hhs0(String str, edm edmVar) {
        this.f13081a = str;
        this.b = edmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhs0)) {
            return false;
        }
        hhs0 hhs0Var = (hhs0) obj;
        return this.f13081a.equals(hhs0Var.f13081a) && this.b.equals(hhs0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f13081a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13081a.hashCode() * 31);
    }

    public final String toString() {
        return "TransferCardUiModel(key=" + this.f13081a + ", model=" + this.b + Separators.RPAREN;
    }
}
