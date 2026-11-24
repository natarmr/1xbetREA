package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class cj0 implements gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4437a;
    public final ti0 b;
    public final int c;
    public final int d;
    public final pc0 e;

    public cj0(String str, ti0 ti0Var, int i, int i2, pc0 pc0Var) {
        this.f4437a = str;
        this.b = ti0Var;
        this.c = i;
        this.d = i2;
        this.e = pc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj0)) {
            return false;
        }
        cj0 cj0Var = (cj0) obj;
        return this.f4437a.equals(cj0Var.f4437a) && this.b.equals(cj0Var.b) && this.c == cj0Var.c && this.d == cj0Var.d && this.e == cj0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, (this.b.hashCode() + (this.f4437a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotMachineModel(id=");
        sb.append(this.f4437a);
        sb.append(", headerModel=");
        sb.append(this.b);
        sb.append(", categoryId=");
        axq.r(this.c, this.d, ", limit=", ", layoutType=", sb);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
