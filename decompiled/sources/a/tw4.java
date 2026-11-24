package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tw4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34630a;
    public final zw4 b;
    public final uw4 c;
    public final int d;

    public tw4(String str, zw4 zw4Var, uw4 uw4Var, int i) {
        this.f34630a = str;
        this.b = zw4Var;
        this.c = uw4Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw4)) {
            return false;
        }
        tw4 tw4Var = (tw4) obj;
        return this.f34630a.equals(tw4Var.f34630a) && this.b == tw4Var.b && this.c == tw4Var.c && this.d == tw4Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f34630a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AutoBetHistoryCancelModel(id=" + this.f34630a + ", result=" + this.b + ", status=" + this.c + ", waitTime=" + this.d + Separators.RPAREN;
    }
}
