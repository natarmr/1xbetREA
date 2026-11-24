package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bnl0 implements hnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uum f2890a;
    public final uum b;
    public final a2m c;

    public bnl0(uum uumVar, uum uumVar2, a2m a2mVar) {
        this.f2890a = uumVar;
        this.b = uumVar2;
        this.c = a2mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnl0)) {
            return false;
        }
        bnl0 bnl0Var = (bnl0) obj;
        return this.f2890a.equals(bnl0Var.f2890a) && this.b.equals(bnl0Var.b) && this.c.equals(bnl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f2890a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Cyber(teamOneModel=" + this.f2890a + ", teamTwoModel=" + this.b + ", scoreModel=" + this.c + Separators.RPAREN;
    }
}
