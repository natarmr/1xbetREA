package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mmv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22062a;
    public final boolean b;
    public final boolean c;
    public final vk90 d;
    public final String e;

    public mmv0(boolean z, boolean z2, boolean z3, vk90 vk90Var, String str) {
        this.f22062a = z;
        this.b = z2;
        this.c = z3;
        this.d = vk90Var;
        this.e = str;
    }

    public static mmv0 a(mmv0 mmv0Var, boolean z, boolean z2, boolean z3, vk90 vk90Var, int i) {
        if ((i & 8) != 0) {
            vk90Var = mmv0Var.d;
        }
        String str = mmv0Var.e;
        mmv0Var.getClass();
        return new mmv0(z, z2, z3, vk90Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmv0)) {
            return false;
        }
        mmv0 mmv0Var = (mmv0) obj;
        return this.f22062a == mmv0Var.f22062a && this.b == mmv0Var.b && this.c == mmv0Var.c && Intrinsics.d(this.d, mmv0Var.d) && this.e.equals(mmv0Var.e);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(Boolean.hashCode(this.f22062a) * 31, 31, this.b), 31, this.c);
        vk90 vk90Var = this.d;
        return this.e.hashCode() + ((iE + (vk90Var == null ? 0 : vk90Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("WinterGamesPersonalStatisticState(isLoading=", ", isError=", ", isEmpty=", this.f22062a, this.b);
        sbQ.append(this.c);
        sbQ.append(", personalStatistic=");
        sbQ.append(this.d);
        sbQ.append(", playerId=");
        return axq.n(sbQ, this.e, Separators.RPAREN);
    }
}
