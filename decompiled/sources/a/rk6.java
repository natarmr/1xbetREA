package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class rk6 {
    public static final qk6 Companion = new qk6();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new lg6(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kh6 f30633a;
    public final List b;

    public /* synthetic */ rk6(int i, kh6 kh6Var, List list) {
        if ((i & 1) == 0) {
            this.f30633a = null;
        } else {
            this.f30633a = kh6Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk6)) {
            return false;
        }
        rk6 rk6Var = (rk6) obj;
        return Intrinsics.d(this.f30633a, rk6Var.f30633a) && Intrinsics.d(this.b, rk6Var.b);
    }

    public final int hashCode() {
        kh6 kh6Var = this.f30633a;
        int iHashCode = (kh6Var == null ? 0 : kh6Var.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "BetBuilderPenaltyResponse(score=" + this.f30633a + ", shots=" + this.b + Separators.RPAREN;
    }
}
