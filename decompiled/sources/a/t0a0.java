package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t0a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33110a;
    public final c280 b;
    public final String c;
    public final String d;
    public final s0a0 e;

    public t0a0(String str, c280 c280Var, String str2, String str3, s0a0 s0a0Var) {
        brm0.B(str, str2, str3);
        this.f33110a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = str3;
        this.e = s0a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0a0)) {
            return false;
        }
        t0a0 t0a0Var = (t0a0) obj;
        return Intrinsics.d(this.f33110a, t0a0Var.f33110a) && this.b.equals(t0a0Var.b) && Intrinsics.d(this.c, t0a0Var.c) && Intrinsics.d(this.d, t0a0Var.d) && Intrinsics.d(this.e, t0a0Var.e);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(hne.g(this.b, this.f33110a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        s0a0 s0a0Var = this.e;
        return iB + (s0a0Var == null ? 0 : s0a0Var.f31402a.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "PlayerCellUiModel(playerId=", this.f33110a, ", playerIcon=", ", playerName=");
        f140.v(sbP, this.c, ", playerType=", this.d, ", playerRoleUiModel=");
        sbP.append(this.e);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
