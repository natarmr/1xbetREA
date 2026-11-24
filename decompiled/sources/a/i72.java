package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class i72 implements l72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qim f14269a;
    public final afb b;
    public final boolean c;
    public final boolean d;

    public i72(qim qimVar, afb afbVar, boolean z, boolean z2) {
        this.f14269a = qimVar;
        this.b = afbVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i72)) {
            return false;
        }
        i72 i72Var = (i72) obj;
        return this.f14269a.equals(i72Var.f14269a) && this.b.equals(i72Var.b) && this.c == i72Var.c && this.d == i72Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (this.f14269a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediumItemsLineSeparator(headerModel=");
        sb.append(this.f14269a);
        sb.append(", champResultUiState=");
        sb.append(this.b);
        sb.append(", refresh=");
        return ohs0.p(", scrollTop=", Separators.RPAREN, sb, this.c, this.d);
    }
}
