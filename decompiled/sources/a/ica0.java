package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ica0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14527a;
    public final edm b;

    public ica0(String str, edm edmVar) {
        this.f14527a = str;
        this.b = edmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ica0)) {
            return false;
        }
        ica0 ica0Var = (ica0) obj;
        return this.f14527a.equals(ica0Var.f14527a) && this.b.equals(ica0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f14527a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14527a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerTransferCardUiModel(key=" + this.f14527a + ", model=" + this.b + Separators.RPAREN;
    }
}
