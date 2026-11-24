package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class h72 implements l72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qim f12555a;
    public final afb b;
    public final boolean c;
    public final boolean d;

    public h72(qim qimVar, afb afbVar, boolean z, boolean z2) {
        this.f12555a = qimVar;
        this.b = afbVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h72)) {
            return false;
        }
        h72 h72Var = (h72) obj;
        return this.f12555a.equals(h72Var.f12555a) && this.b.equals(h72Var.b) && this.c == h72Var.c && this.d == h72Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f12555a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LargeItemSpaceSeparator(headerModel=");
        sb.append(this.f12555a);
        sb.append(", champResultUiState=");
        sb.append(this.b);
        sb.append(", refresh=");
        return ohs0.p(", scrollTop=", Separators.RPAREN, sb, this.c, this.d);
    }
}
