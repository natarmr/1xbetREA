package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nt0 extends t9p {
    public final String b;
    public final zll c;

    public nt0(String str, zll zllVar) {
        super(str, zllVar.c);
        this.b = str;
        this.c = zllVar;
    }

    public static nt0 c(nt0 nt0Var, zll zllVar) {
        String str = nt0Var.b;
        nt0Var.getClass();
        return new nt0(str, zllVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt0)) {
            return false;
        }
        nt0 nt0Var = (nt0) obj;
        return this.b.equals(nt0Var.b) && this.c.equals(nt0Var.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b + Separators.SP + this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorGameCardCollection(id=" + this.b + ", content=" + this.c + Separators.RPAREN;
    }
}
