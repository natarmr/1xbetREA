package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class j72 implements l72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qim f16019a;
    public final afb b;
    public final boolean c;
    public final boolean d;

    public j72(qim qimVar, afb afbVar, boolean z, boolean z2) {
        this.f16019a = qimVar;
        this.b = afbVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j72)) {
            return false;
        }
        j72 j72Var = (j72) obj;
        return this.f16019a.equals(j72Var.f16019a) && this.b.equals(j72Var.b) && this.c == j72Var.c && this.d == j72Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f16019a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediumItemsSpaceSeparator(headerModel=");
        sb.append(this.f16019a);
        sb.append(", champResultUiState=");
        sb.append(this.b);
        sb.append(", refresh=");
        return ohs0.p(", scrollTop=", Separators.RPAREN, sb, this.c, this.d);
    }
}
