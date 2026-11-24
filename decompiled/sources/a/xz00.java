package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xz00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41731a;
    public final pz00 b;
    public final d310 c;
    public final qz00 d;

    public xz00(int i, pz00 pz00Var, d310 d310Var, qz00 qz00Var) {
        this.f41731a = i;
        this.b = pz00Var;
        this.c = d310Var;
        this.d = qz00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz00)) {
            return false;
        }
        xz00 xz00Var = (xz00) obj;
        return this.f41731a == xz00Var.f41731a && this.b == xz00Var.b && this.c == xz00Var.c && this.d == xz00Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f41731a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LolGameLogItemModel(minuteEvent=" + this.f41731a + ", numberEvent=" + this.b + ", side=" + this.c + ", eventType=" + this.d + Separators.RPAREN;
    }
}
