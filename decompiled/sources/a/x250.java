package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x250 implements z250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjl f40151a;
    public final ijl b;

    public x250(ijl ijlVar, jjl jjlVar) {
        this.f40151a = jjlVar;
        this.b = ijlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x250)) {
            return false;
        }
        x250 x250Var = (x250) obj;
        return this.f40151a.equals(x250Var.f40151a) && this.b == x250Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40151a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountSelection(model=" + this.f40151a + ", style=" + this.b + Separators.RPAREN;
    }
}
