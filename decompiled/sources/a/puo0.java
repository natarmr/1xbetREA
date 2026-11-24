package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class puo0 implements suo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27627a;
    public final pms b;
    public final mzb0 c;

    public puo0(int i, pms pmsVar, mzb0 mzb0Var) {
        this.f27627a = i;
        this.b = pmsVar;
        this.c = mzb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puo0)) {
            return false;
        }
        puo0 puo0Var = (puo0) obj;
        return this.f27627a == puo0Var.f27627a && this.b.equals(puo0Var.b) && this.c.equals(puo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f27627a) * 31)) * 31);
    }

    public final String toString() {
        return "Fs(count=" + this.f27627a + ", gameModel=" + this.b + ", product=" + this.c + Separators.RPAREN;
    }
}
