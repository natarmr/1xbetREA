package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g8r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fck f10881a;
    public final int b;
    public final int c;
    public final int d;

    public g8r0(fck fckVar, int i, int i2, int i3) {
        this.f10881a = fckVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8r0)) {
            return false;
        }
        g8r0 g8r0Var = (g8r0) obj;
        return this.f10881a == g8r0Var.f10881a && this.b == g8r0Var.b && this.c == g8r0Var.c && this.d == g8r0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, this.f10881a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopLineInformationModel(description=");
        sb.append(this.f10881a);
        sb.append(", leftDataScore=");
        sb.append(this.b);
        sb.append(", rightDataScore=");
        return w6x.o(this.c, this.d, ", totalDataScore=", Separators.RPAREN, sb);
    }
}
