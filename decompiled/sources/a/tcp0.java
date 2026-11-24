package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tcp0 implements xcp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d5a0 f33728a;
    public final d5a0 b;

    public tcp0(d5a0 d5a0Var, d5a0 d5a0Var2) {
        this.f33728a = d5a0Var;
        this.b = d5a0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcp0)) {
            return false;
        }
        tcp0 tcp0Var = (tcp0) obj;
        return this.f33728a.equals(tcp0Var.f33728a) && this.b.equals(tcp0Var.b);
    }

    public final int hashCode() {
        return this.b.f5497a.hashCode() + (this.f33728a.f5497a.hashCode() * 31);
    }

    public final String toString() {
        return "WithLogoOnlyHorizontal(firstPlayerLogo=" + this.f33728a + ", secondPlayerLogo=" + this.b + Separators.RPAREN;
    }
}
