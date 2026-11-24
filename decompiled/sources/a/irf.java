package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class irf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15253a;
    public final sqf b;
    public final String c;
    public final boolean d;
    public final kif e;
    public final long f;
    public final long g;
    public final List h;
    public final List i;
    public final float j;
    public final List k;
    public final short l;
    public final short m;
    public final List n;

    /* JADX WARN: Multi-variable type inference failed */
    public irf(int i, sqf sqfVar, String str, boolean z, kif kifVar, long j, long j2, List list, List list2, float f, List list3, int i2, int i3, List list4) {
        hne.C(list, list2, list3, list4);
        this.f15253a = i;
        this.b = sqfVar;
        this.c = str;
        this.d = z;
        this.e = kifVar;
        this.f = j;
        this.g = j2;
        this.h = list;
        this.i = list2;
        this.j = f;
        this.k = list3;
        this.l = i2;
        this.m = i3;
        this.n = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irf)) {
            return false;
        }
        irf irfVar = (irf) obj;
        return this.f15253a == irfVar.f15253a && this.b == irfVar.b && this.c.equals(irfVar.c) && this.d == irfVar.d && this.e.equals(irfVar.e) && this.f == irfVar.f && this.g == irfVar.g && Intrinsics.d(this.h, irfVar.h) && Intrinsics.d(this.i, irfVar.i) && Float.compare(this.j, irfVar.j) == 0 && Intrinsics.d(this.k, irfVar.k) && this.l == irfVar.l && this.m == irfVar.m && Intrinsics.d(this.n, irfVar.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + twn.a(this.m, twn.a(this.l, dw9.a(defpackage.c.a(dw9.a(dw9.a(rw2.b(rw2.b((this.e.hashCode() + brm0.e(ua80.b((this.b.hashCode() + (Integer.hashCode(this.f15253a) * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), this.j, 31), 31, this.k), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2StatisticInfoModel(currentRound=");
        sb.append(this.f15253a);
        sb.append(", stateRound=");
        sb.append(this.b);
        sb.append(", mapName=");
        brm0.C(this.c, ", hasBomb=", ", bomb=", sb, this.d);
        sb.append(this.e);
        sb.append(", bombTimer=");
        sb.append(this.f);
        kng0.A(sb, ", timer=", this.g, ", matchInfo=");
        b1j.y(", gameLog=", ", resolution=", sb, this.h, this.i);
        sb.append(this.j);
        sb.append(", deadPlayers=");
        sb.append(this.k);
        sb.append(", mapOffsetX=");
        axq.r(this.l, this.m, ", mapOffsetY=", ", mapSplits=", sb);
        return dw9.r(sb, this.n, Separators.RPAREN);
    }
}
