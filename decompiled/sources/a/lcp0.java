package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lcp0 implements ncp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19810a;
    public final qep0 b;
    public final f5a0 c;

    public lcp0(String str, qep0 qep0Var, f5a0 f5a0Var) {
        this.f19810a = str;
        this.b = qep0Var;
        this.c = f5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcp0)) {
            return false;
        }
        lcp0 lcp0Var = (lcp0) obj;
        return this.f19810a.equals(lcp0Var.f19810a) && this.b == lcp0Var.b && this.c.equals(lcp0Var.c);
    }

    public final int hashCode() {
        return this.c.f8953a.hashCode() + ((this.b.hashCode() + (this.f19810a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Default(name=" + this.f19810a + ", order=" + this.b + ", playerIcon=" + this.c + Separators.RPAREN;
    }
}
