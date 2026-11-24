package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class iv4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15427a;
    public final ix4 b;
    public final vv4 c;
    public final int d;

    public iv4(String str, ix4 ix4Var, vv4 vv4Var, int i) {
        this.f15427a = str;
        this.b = ix4Var;
        this.c = vv4Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv4)) {
            return false;
        }
        iv4 iv4Var = (iv4) obj;
        return this.f15427a.equals(iv4Var.f15427a) && this.b == iv4Var.b && this.c == iv4Var.c && this.d == iv4Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f15427a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AutoBetCancelModel(id=" + this.f15427a + ", result=" + this.b + ", status=" + this.c + ", waitTime=" + this.d + Separators.RPAREN;
    }
}
