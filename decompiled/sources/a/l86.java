package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l86 implements r86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2g f19592a;
    public final n2g b;
    public final a2m c;

    public l86(n2g n2gVar, n2g n2gVar2, a2m a2mVar) {
        this.f19592a = n2gVar;
        this.b = n2gVar2;
        this.c = a2mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l86)) {
            return false;
        }
        l86 l86Var = (l86) obj;
        return this.f19592a.equals(l86Var.f19592a) && this.b.equals(l86Var.b) && this.c.equals(l86Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f19592a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Cyber(firstOpponentModel=" + this.f19592a + ", secondOpponentModel=" + this.b + ", scoreModel=" + this.c + Separators.RPAREN;
    }
}
