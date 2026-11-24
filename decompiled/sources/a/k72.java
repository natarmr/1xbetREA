package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class k72 implements l72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qim f17797a;
    public final afb b;
    public final boolean c;
    public final boolean d;

    public k72(qim qimVar, afb afbVar, boolean z, boolean z2) {
        this.f17797a = qimVar;
        this.b = afbVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k72)) {
            return false;
        }
        k72 k72Var = (k72) obj;
        return this.f17797a.equals(k72Var.f17797a) && this.b.equals(k72Var.b) && this.c == k72Var.c && this.d == k72Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f17797a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmallItemLineSeparator(headerModel=");
        sb.append(this.f17797a);
        sb.append(", champResultUiState=");
        sb.append(this.b);
        sb.append(", refresh=");
        return ohs0.p(", scrollTop=", Separators.RPAREN, sb, this.c, this.d);
    }
}
