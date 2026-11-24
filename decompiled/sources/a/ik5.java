package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ik5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14908a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public ik5(boolean z, boolean z2, boolean z3, lc00 lc00Var) {
        lc00Var.getClass();
        this.f14908a = z;
        this.b = z2;
        this.c = z3;
        this.d = lc00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik5)) {
            return false;
        }
        ik5 ik5Var = (ik5) obj;
        return this.f14908a == ik5Var.f14908a && this.b == ik5Var.b && this.c == ik5Var.c && Intrinsics.d(this.d, ik5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f14908a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BalanceManagementProfileInfoModel(balanceTopUpEnabled=", ", balanceWithdrawalEnabled=", ", isVerificationComplete=", this.f14908a, this.b);
        sbQ.append(this.c);
        sbQ.append(", balanceManagementMenuItemsList=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
