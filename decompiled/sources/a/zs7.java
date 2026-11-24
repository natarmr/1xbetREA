package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zs7 {
    public static final ys7 Companion = new ys7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f44893a;
    public final String b;
    public final Long c;

    public /* synthetic */ zs7(int i, Long l, Long l2, String str) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, xs7.f41402a.getDescriptor());
            throw null;
        }
        this.f44893a = l;
        this.b = str;
        this.c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs7)) {
            return false;
        }
        zs7 zs7Var = (zs7) obj;
        return Intrinsics.d(this.f44893a, zs7Var.f44893a) && Intrinsics.d(this.b, zs7Var.b) && Intrinsics.d(this.c, zs7Var.c);
    }

    public final int hashCode() {
        Long l = this.f44893a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.c;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.r(cs0.s(this.f44893a, "BetsHistoryHideUserBetsRequest(hideInterval=", ", couponId=", this.b, ", bonusUserId="), this.c, Separators.RPAREN);
    }

    public zs7(Long l, Long l2, String str) {
        this.f44893a = l;
        this.b = str;
        this.c = l2;
    }
}
