package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wrp0 implements yrp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctp0 f39656a;
    public final int b;

    public wrp0(ctp0 ctp0Var, int i) {
        this.f39656a = ctp0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrp0)) {
            return false;
        }
        wrp0 wrp0Var = (wrp0) obj;
        return this.f39656a.equals(wrp0Var.f39656a) && this.b == wrp0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f39656a.hashCode() * 31);
    }

    public final String toString() {
        return "OnItemClick(teamsStatisticMenuType=" + this.f39656a + ", selectedTab=" + this.b + Separators.RPAREN;
    }
}
