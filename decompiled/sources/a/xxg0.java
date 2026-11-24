package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class xxg0 {
    public static final wxg0 Companion = new wxg0();
    public static final a8z[] o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41657a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final int f;
    public final long g;
    public final int h;
    public final int i;
    public final int j;
    public final double k;
    public final boolean l;
    public final List m;
    public final List n;

    static {
        wez wezVar = wez.f39042a;
        o = new a8z[]{null, null, null, maz.a(wezVar, new j6g0((byte) 25)), null, null, null, null, null, null, null, null, maz.a(wezVar, new j6g0((byte) 26)), maz.a(wezVar, new j6g0((byte) 27))};
    }

    public /* synthetic */ xxg0(int i, long j, String str, String str2, List list, int i2, int i3, long j2, int i4, int i5, int i6, double d, boolean z, List list2, List list3) {
        if (16383 != (i & 16383)) {
            m2x.I(i, 16383, vxg0.f38198a.getDescriptor());
            throw null;
        }
        this.f41657a = j;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = i2;
        this.f = i3;
        this.g = j2;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = d;
        this.l = z;
        this.m = list2;
        this.n = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxg0)) {
            return false;
        }
        xxg0 xxg0Var = (xxg0) obj;
        return this.f41657a == xxg0Var.f41657a && Intrinsics.d(this.b, xxg0Var.b) && Intrinsics.d(this.c, xxg0Var.c) && Intrinsics.d(this.d, xxg0Var.d) && this.e == xxg0Var.e && this.f == xxg0Var.f && this.g == xxg0Var.g && this.h == xxg0Var.h && this.i == xxg0Var.i && this.j == xxg0Var.j && Double.compare(this.k, xxg0Var.k) == 0 && this.l == xxg0Var.l && Intrinsics.d(this.m, xxg0Var.m) && Intrinsics.d(this.n, xxg0Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + dw9.a(brm0.e(brm0.d(this.k, twn.a(this.j, twn.a(this.i, twn.a(this.h, rw2.b(twn.a(this.f, twn.a(this.e, dw9.a(ua80.b(ua80.b(Long.hashCode(this.f41657a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g), 31), 31), 31), 31), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f41657a, "SaveCouponWithUserIdRequest(userId=", ", appGuid=", this.b);
        ua80.t(", lng=", this.c, ", events=", sbO, this.d);
        rw2.s(this.e, this.f, ", partner=", ", source=", sbO);
        kng0.A(sbO, ", expressNum=", this.g, ", vid=");
        axq.r(this.h, this.i, ", cfView=", ", checkCf=", sbO);
        sbO.append(this.j);
        sbO.append(", antiExpressCoef=");
        sbO.append(this.k);
        esw0.l(sbO, ", withLobby=", this.l, ", eventsIndexes=", this.m);
        return ohs0.s(sbO, ", minBetSystems=", this.n, Separators.RPAREN);
    }

    public xxg0(long j, String str, String str2, ArrayList arrayList, long j2, int i, int i2, int i3, double d, boolean z, List list, ArrayList arrayList2) {
        str.getClass();
        list.getClass();
        this.f41657a = j;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = 1;
        this.f = 22;
        this.g = j2;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = d;
        this.l = z;
        this.m = list;
        this.n = arrayList2;
    }
}
