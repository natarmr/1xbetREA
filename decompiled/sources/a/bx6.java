package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class bx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f3362a;
    public final tw6 b;
    public final boolean c;

    public bx6(a8q0 a8q0Var, tw6 tw6Var, boolean z) {
        this.f3362a = a8q0Var;
        this.b = tw6Var;
        this.c = z;
    }

    public static bx6 a(bx6 bx6Var, a8q0 a8q0Var, tw6 tw6Var, boolean z, int i) {
        if ((i & 1) != 0) {
            a8q0Var = bx6Var.f3362a;
        }
        if ((i & 2) != 0) {
            tw6Var = bx6Var.b;
        }
        if ((i & 4) != 0) {
            z = bx6Var.c;
        }
        bx6Var.getClass();
        return new bx6(a8q0Var, tw6Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx6)) {
            return false;
        }
        bx6 bx6Var = (bx6) obj;
        return this.f3362a.equals(bx6Var.f3362a) && this.b.equals(bx6Var.b) && this.c == bx6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f3362a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetFieldStateModel(fieldState=");
        sb.append(this.f3362a);
        sb.append(", betFieldParamsStateModel=");
        sb.append(this.b);
        sb.append(", isUserInput=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
