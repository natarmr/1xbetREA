package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ilf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14976a;
    public final int b;
    public final xrt0 c;
    public final boolean d;
    public final mlf0 e;

    public ilf0(int i, int i2, xrt0 xrt0Var, boolean z, mlf0 mlf0Var) {
        this.f14976a = i;
        this.b = i2;
        this.c = xrt0Var;
        this.d = z;
        this.e = mlf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilf0)) {
            return false;
        }
        ilf0 ilf0Var = (ilf0) obj;
        return this.f14976a == ilf0Var.f14976a && this.b == ilf0Var.b && this.c.equals(ilf0Var.c) && this.d == ilf0Var.d && this.e.equals(ilf0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e((this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f14976a) * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("ReplyMessageModel(messageId=", this.f14976a, ", parentMessageId=", ", userModel=", this.b);
        sbT.append(this.c);
        sbT.append(", quote=");
        sbT.append(this.d);
        sbT.append(", payload=");
        sbT.append(this.e);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
