package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pu7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qqp0 f27601a;
    public final cu7 b;
    public final long c;
    public final a8h0 d;

    public pu7(qqp0 qqp0Var, cu7 cu7Var, long j, a8h0 a8h0Var) {
        this.f27601a = qqp0Var;
        this.b = cu7Var;
        this.c = j;
        this.d = a8h0Var;
    }

    public static pu7 a(pu7 pu7Var, qqp0 qqp0Var, cu7 cu7Var, long j, a8h0 a8h0Var, int i) {
        if ((i & 1) != 0) {
            qqp0Var = pu7Var.f27601a;
        }
        qqp0 qqp0Var2 = qqp0Var;
        if ((i & 2) != 0) {
            cu7Var = pu7Var.b;
        }
        cu7 cu7Var2 = cu7Var;
        if ((i & 4) != 0) {
            j = pu7Var.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            a8h0Var = pu7Var.d;
        }
        pu7Var.getClass();
        qqp0Var2.getClass();
        return new pu7(qqp0Var2, cu7Var2, j2, a8h0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu7)) {
            return false;
        }
        pu7 pu7Var = (pu7) obj;
        return this.f27601a.equals(pu7Var.f27601a) && this.b == pu7Var.b && this.c == pu7Var.c && Intrinsics.d(this.d, pu7Var.d);
    }

    public final int hashCode() {
        int iB = rw2.b((this.b.hashCode() + (this.f27601a.hashCode() * 31)) * 31, 31, this.c);
        a8h0 a8h0Var = this.d;
        return iB + (a8h0Var == null ? 0 : a8h0Var.hashCode());
    }

    public final String toString() {
        return "BetsOnPlayersState(teamsResult=" + this.f27601a + ", mode=" + this.b + ", subGameId=" + this.c + ", screenSelects=" + this.d + Separators.RPAREN;
    }
}
