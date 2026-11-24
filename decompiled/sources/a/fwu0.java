package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class fwu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gwu0 f10278a;
    public final hwu0 b;
    public final boolean c;

    public fwu0(gwu0 gwu0Var, hwu0 hwu0Var, boolean z) {
        this.f10278a = gwu0Var;
        this.b = hwu0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwu0)) {
            return false;
        }
        fwu0 fwu0Var = (fwu0) obj;
        return this.f10278a == fwu0Var.f10278a && this.b == fwu0Var.b && this.c == fwu0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f10278a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletMoneyActionButtonState(textType=");
        sb.append(this.f10278a);
        sb.append(", actionType=");
        sb.append(this.b);
        sb.append(", enabled=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
