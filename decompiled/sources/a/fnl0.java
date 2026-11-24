package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fnl0 implements hnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1n f9843a;
    public final b1n b;
    public final y1m c;

    public fnl0(b1n b1nVar, b1n b1nVar2, y1m y1mVar) {
        this.f9843a = b1nVar;
        this.b = b1nVar2;
        this.c = y1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnl0)) {
            return false;
        }
        fnl0 fnl0Var = (fnl0) obj;
        return this.f9843a.equals(fnl0Var.f9843a) && this.b.equals(fnl0Var.b) && this.c.equals(fnl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f9843a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TwoOpponents(teamOneModel=" + this.f9843a + ", teamTwoModel=" + this.b + ", scoreModel=" + this.c + Separators.RPAREN;
    }
}
