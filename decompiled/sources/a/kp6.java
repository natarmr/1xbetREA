package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kp6 implements np6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f18662a;
    public final mdm b;

    public kp6(mdm mdmVar, imm immVar) {
        this.f18662a = immVar;
        this.b = mdmVar;
    }

    @Override // a.np6
    public final imm c() {
        return this.f18662a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp6)) {
            return false;
        }
        kp6 kp6Var = (kp6) obj;
        return this.f18662a.equals(kp6Var.f18662a) && this.b.equals(kp6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18662a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(appBarUiModel=" + this.f18662a + ", config=" + this.b + Separators.RPAREN;
    }
}
