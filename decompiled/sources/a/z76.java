package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z76 implements b86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uws0 f43903a;
    public final uws0 b;
    public final kpm c;
    public final String d;
    public final r0n e;

    public z76(uws0 uws0Var, uws0 uws0Var2, kpm kpmVar, String str, r0n r0nVar) {
        this.f43903a = uws0Var;
        this.b = uws0Var2;
        this.c = kpmVar;
        this.d = str;
        this.e = r0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z76)) {
            return false;
        }
        z76 z76Var = (z76) obj;
        return this.f43903a.equals(z76Var.f43903a) && this.b.equals(z76Var.b) && this.c.equals(z76Var.c) && this.d.equals(z76Var.d) && this.e.equals(z76Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(dw9.c(this.c, (this.b.hashCode() + (this.f43903a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "TwoOpponents(firstOpponentModel=" + this.f43903a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + ", options=" + this.e + Separators.RPAREN;
    }
}
