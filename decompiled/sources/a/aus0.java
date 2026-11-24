package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aus0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1495a;
    public final wts0 b;
    public final zts0 c;
    public final zts0 d;

    public aus0(String str, wts0 wts0Var, zts0 zts0Var, zts0 zts0Var2) {
        this.f1495a = str;
        this.b = wts0Var;
        this.c = zts0Var;
        this.d = zts0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aus0)) {
            return false;
        }
        aus0 aus0Var = (aus0) obj;
        return this.f1495a.equals(aus0Var.f1495a) && this.b.equals(aus0Var.b) && this.c.equals(aus0Var.c) && this.d.equals(aus0Var.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "TWENTY_ONE_KEY";
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ua80.b(1434901128, 31, this.f1495a)) * 31)) * 31);
    }

    public final String toString() {
        return "TwentyOneClassicUiModel(key=TWENTY_ONE_KEY, background=" + this.f1495a + ", gameInfo=" + this.b + ", dealerInfo=" + this.c + ", playerInfo=" + this.d + Separators.RPAREN;
    }
}
