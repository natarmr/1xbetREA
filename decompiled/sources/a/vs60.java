package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class vs60 {
    public static final us60 Companion = new us60();
    public static final a8z[] h = {null, null, null, null, null, null, maz.a(wez.f39042a, new fq60(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37934a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final Set g;

    public /* synthetic */ vs60(int i, long j, int i2, String str, int i3, int i4, int i5, Set set) {
        if (127 != (i & 127)) {
            m2x.I(i, 127, ts60.f34447a.getDescriptor());
            throw null;
        }
        this.f37934a = j;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs60)) {
            return false;
        }
        vs60 vs60Var = (vs60) obj;
        return this.f37934a == vs60Var.f37934a && this.b == vs60Var.b && Intrinsics.d(this.c, vs60Var.c) && this.d == vs60Var.d && this.e == vs60Var.e && this.f == vs60Var.f && Intrinsics.d(this.g, vs60Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + twn.a(this.f, twn.a(this.e, twn.a(this.d, ua80.b(twn.a(this.b, Long.hashCode(this.f37934a) * 31, 31), 31, this.c), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f37934a, "OneXGamesByGameIdsRequestOld(userId=", ", whence=");
        axq.s(this.d, ", language=", this.c, ", refId=", sbQ);
        rw2.s(this.e, this.f, ", groupId=", ", countryId=", sbQ);
        sbQ.append(", gameIdSet=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public vs60(long j, String str, int i, Set set) {
        set.getClass();
        this.f37934a = j;
        this.b = 22;
        this.c = str;
        this.d = 1;
        this.e = 1357;
        this.f = i;
        this.g = set;
    }
}
