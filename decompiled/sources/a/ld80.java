package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ld80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19837a;
    public final boolean b;
    public final boolean c;
    public final zpv d;
    public final kd80 e;

    public ld80(boolean z, boolean z2, boolean z3, zpv zpvVar, kd80 kd80Var) {
        this.f19837a = z;
        this.b = z2;
        this.c = z3;
        this.d = zpvVar;
        this.e = kd80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld80)) {
            return false;
        }
        ld80 ld80Var = (ld80) obj;
        return this.f19837a == ld80Var.f19837a && this.b == ld80Var.b && this.c == ld80Var.c && this.d.equals(ld80Var.d) && this.e.equals(ld80Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f19837a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("OtherUiState(refreshing=", ", scrollToTop=", ", canScrollUp=", this.f19837a, this.b);
        sbQ.append(this.c);
        sbQ.append(", headerActionsState=");
        sbQ.append(this.d);
        sbQ.append(", content=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
