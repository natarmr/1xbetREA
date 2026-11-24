package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qr6 implements tr6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f29194a;
    public final mdm b;

    public qr6(mdm mdmVar, imm immVar) {
        this.f29194a = immVar;
        this.b = mdmVar;
    }

    @Override // a.tr6
    public final imm c() {
        return this.f29194a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr6)) {
            return false;
        }
        qr6 qr6Var = (qr6) obj;
        return this.f29194a.equals(qr6Var.f29194a) && this.b.equals(qr6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29194a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(appBarUiModel=" + this.f29194a + ", config=" + this.b + Separators.RPAREN;
    }
}
