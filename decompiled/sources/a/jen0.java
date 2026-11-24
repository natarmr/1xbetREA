package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jen0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16384a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final een0 e;

    public jen0(boolean z, boolean z2, boolean z3, List list, een0 een0Var) {
        list.getClass();
        this.f16384a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = een0Var;
    }

    public static jen0 a(jen0 jen0Var, boolean z, boolean z2, boolean z3, List list, een0 een0Var, int i) {
        if ((i & 1) != 0) {
            z = jen0Var.f16384a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = jen0Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = jen0Var.c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            list = jen0Var.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            een0Var = jen0Var.e;
        }
        jen0Var.getClass();
        list2.getClass();
        return new jen0(z4, z5, z6, list2, een0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jen0)) {
            return false;
        }
        jen0 jen0Var = (jen0) obj;
        return this.f16384a == jen0Var.f16384a && this.b == jen0Var.b && this.c == jen0Var.c && Intrinsics.d(this.d, jen0Var.d) && this.e == jen0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f16384a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SubscriptionsTeamBetTeamsState(connected=", ", isRefreshing=", ", isTablet=", this.f16384a, this.b);
        vqd.y(sbQ, ", items=", this.d, ", contentType=", this.c);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
