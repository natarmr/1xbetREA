package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class pxg0 {
    public static final oxg0 Companion = new oxg0();
    public static final a8z[] p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27752a;
    public final long b;
    public final String c;
    public final String d;
    public final List e;
    public final int f;
    public final int g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;
    public final double l;
    public final boolean m;
    public final List n;
    public final List o;

    static {
        wez wezVar = wez.f39042a;
        p = new a8z[]{null, null, null, null, maz.a(wezVar, new j6g0((byte) 22)), null, null, null, null, null, null, null, null, maz.a(wezVar, new j6g0((byte) 23)), maz.a(wezVar, new j6g0((byte) 24))};
    }

    public /* synthetic */ pxg0(int i, String str, long j, String str2, String str3, List list, int i2, int i3, long j2, int i4, int i5, int i6, double d, boolean z, List list2, List list3) {
        if (32767 != (i & 32767)) {
            m2x.I(i, 32767, nxg0.f24283a.getDescriptor());
            throw null;
        }
        this.f27752a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = i2;
        this.g = i3;
        this.h = j2;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = d;
        this.m = z;
        this.n = list2;
        this.o = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxg0)) {
            return false;
        }
        pxg0 pxg0Var = (pxg0) obj;
        return Intrinsics.d(this.f27752a, pxg0Var.f27752a) && this.b == pxg0Var.b && Intrinsics.d(this.c, pxg0Var.c) && Intrinsics.d(this.d, pxg0Var.d) && Intrinsics.d(this.e, pxg0Var.e) && this.f == pxg0Var.f && this.g == pxg0Var.g && this.h == pxg0Var.h && this.i == pxg0Var.i && this.j == pxg0Var.j && this.k == pxg0Var.k && Double.compare(this.l, pxg0Var.l) == 0 && this.m == pxg0Var.m && Intrinsics.d(this.n, pxg0Var.n) && Intrinsics.d(this.o, pxg0Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + dw9.a(brm0.e(brm0.d(this.l, twn.a(this.k, twn.a(this.j, twn.a(this.i, rw2.b(twn.a(this.g, twn.a(this.f, dw9.a(ua80.b(ua80.b(rw2.b(this.f27752a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31), 31), 31), 31), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "SaveBetsRequest(betId=", this.f27752a, ", userId=");
        f140.v(sbO, ", appGuid=", this.c, ", lng=", this.d);
        sbO.append(", events=");
        sbO.append(this.e);
        sbO.append(", partner=");
        sbO.append(this.f);
        rw2.x(sbO, ", source=", this.g, ", expressNum=");
        ua80.v(sbO, this.h, ", vid=", this.i);
        rw2.s(this.j, this.k, ", cfView=", ", checkCf=", sbO);
        ohs0.A(sbO, this.l, ", antiExpressCoef=", ", withLobby=");
        vqd.y(sbO, ", eventsIndexes=", this.n, ", minBetSystems=", this.m);
        return dw9.r(sbO, this.o, Separators.RPAREN);
    }

    public pxg0(String str, long j, String str2, String str3, ArrayList arrayList, long j2, int i, int i2, int i3, double d, boolean z, List list, iun iunVar) {
        str.getClass();
        str2.getClass();
        list.getClass();
        iunVar.getClass();
        this.f27752a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = arrayList;
        this.f = 1;
        this.g = 22;
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = d;
        this.m = z;
        this.n = list;
        this.o = iunVar;
    }
}
