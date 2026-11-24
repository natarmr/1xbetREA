package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class rqt0 {
    public static final qqt0 Companion = new qqt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f30948a;
    public final String b;
    public final long c;

    public /* synthetic */ rqt0(int i, Long l, String str, long j) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, pqt0.f27432a.getDescriptor());
            throw null;
        }
        this.f30948a = l;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqt0)) {
            return false;
        }
        rqt0 rqt0Var = (rqt0) obj;
        return Intrinsics.d(this.f30948a, rqt0Var.f30948a) && Intrinsics.d(this.b, rqt0Var.b) && this.c == rqt0Var.c;
    }

    public final int hashCode() {
        Long l = this.f30948a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return Long.hashCode(this.c) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, cs0.s(this.f30948a, "UserBetsHideRequest(hideInterval=", ", couponId=", this.b, ", bonusUserId="));
    }

    public rqt0(Long l, String str, long j) {
        this.f30948a = l;
        this.b = str;
        this.c = j;
    }
}
