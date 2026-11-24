package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class fit0 {
    public static final eit0 Companion = new eit0();
    public static final a8z[] d = {maz.a(wez.f39042a, new tht0(1)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9604a;
    public final long b;
    public final long c;

    public /* synthetic */ fit0(int i, List list, long j, long j2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, dit0.f6152a.getDescriptor());
            throw null;
        }
        this.f9604a = list;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fit0)) {
            return false;
        }
        fit0 fit0Var = (fit0) obj;
        return Intrinsics.d(this.f9604a, fit0Var.f9604a) && this.b == fit0Var.b && this.c == fit0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(this.f9604a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateCouponMultiSingleRequest(coupons=");
        sb.append(this.f9604a);
        sb.append(", userId=");
        sb.append(this.b);
        return rw2.n(sb, this.c, ", userBonusId=", Separators.RPAREN);
    }

    public fit0(long j, long j2, ArrayList arrayList) {
        this.f9604a = arrayList;
        this.b = j;
        this.c = j2;
    }
}
