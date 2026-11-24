package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wij0 implements bjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f39216a;
    public final int b;

    public wij0(ank0 ank0Var, int i) {
        this.f39216a = ank0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wij0)) {
            return false;
        }
        wij0 wij0Var = (wij0) obj;
        return this.f39216a.equals(wij0Var.f39216a) && this.b == wij0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f39216a.f1159a.hashCode() * 31);
    }

    public final String toString() {
        return "DealerNameAndScore(text=" + this.f39216a + ", background=" + this.b + Separators.RPAREN;
    }
}
