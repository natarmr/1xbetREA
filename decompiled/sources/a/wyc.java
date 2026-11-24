package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39968a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final vyc g;
    public final float h;
    public final int i;
    public final int j;
    public final double k;
    public final double l;
    public final long m;

    public wyc(long j, long j2, String str, String str2, boolean z, boolean z2, vyc vycVar, float f, int i, int i2, double d, double d2, long j3) {
        str.getClass();
        str2.getClass();
        this.f39968a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = vycVar;
        this.h = f;
        this.i = i;
        this.j = i2;
        this.k = d;
        this.l = d2;
        this.m = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyc)) {
            return false;
        }
        wyc wycVar = (wyc) obj;
        return this.f39968a == wycVar.f39968a && this.b == wycVar.b && Intrinsics.d(this.c, wycVar.c) && Intrinsics.d(this.d, wycVar.d) && this.e == wycVar.e && this.f == wycVar.f && this.g == wycVar.g && Float.compare(this.h, wycVar.h) == 0 && this.i == wycVar.i && this.j == wycVar.j && Double.compare(this.k, wycVar.k) == 0 && Double.compare(this.l, wycVar.l) == 0 && this.m == wycVar.m;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + brm0.d(this.l, brm0.d(this.k, twn.a(this.j, twn.a(this.i, defpackage.c.a((this.g.hashCode() + brm0.e(brm0.e(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f39968a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, this.h, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f39968a, "CoefBetButtonUiModel(id=", ", betGameId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        w6x.z(", value=", this.d, ", markerVisible=", sbQ, this.e);
        sbQ.append(", locked=");
        sbQ.append(this.f);
        sbQ.append(", coefBetButtonColor=");
        sbQ.append(this.g);
        sbQ.append(", alpha=");
        sbQ.append(this.h);
        sbQ.append(", trackedIcon=");
        sbQ.append(this.i);
        rw2.x(sbQ, ", blockedIcon=", this.j, ", param=");
        sbQ.append(this.k);
        ohs0.A(sbQ, this.l, ", coef=", ", groupId=");
        return brm0.k(this.m, Separators.RPAREN, sbQ);
    }
}
