package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rbp0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30200a;
    public final edm b;

    public rbp0(String str, edm edmVar) {
        this.f30200a = str;
        this.b = edmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbp0)) {
            return false;
        }
        rbp0 rbp0Var = (rbp0) obj;
        return this.f30200a.equals(rbp0Var.f30200a) && this.b.equals(rbp0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f30200a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30200a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamDetailsTransferCardUiModel(key=" + this.f30200a + ", model=" + this.b + Separators.RPAREN;
    }
}
