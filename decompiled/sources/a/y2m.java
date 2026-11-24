package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y2m implements a3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41911a;
    public final String b;
    public final n0x c;
    public final m0x d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final int j;
    public final long k;
    public final o0x l;

    public y2m(long j, String str, n0x n0xVar, m0x m0xVar, boolean z, boolean z2, boolean z3, String str2, String str3, int i, long j2, o0x o0xVar, int i2) {
        o0x o0xVar2 = (i2 & 2048) != 0 ? null : o0xVar;
        brm0.B(str, str2, str3);
        this.f41911a = j;
        this.b = str;
        this.c = n0xVar;
        this.d = m0xVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str2;
        this.i = str3;
        this.j = i;
        this.k = j2;
        this.l = o0xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2m)) {
            return false;
        }
        y2m y2mVar = (y2m) obj;
        return this.f41911a == y2mVar.f41911a && Intrinsics.d(this.b, y2mVar.b) && this.c.equals(y2mVar.c) && this.d.equals(y2mVar.d) && this.e == y2mVar.e && this.f == y2mVar.f && this.g == y2mVar.g && Intrinsics.d(this.h, y2mVar.h) && Intrinsics.d(this.i, y2mVar.i) && this.j == y2mVar.j && this.k == y2mVar.k && Intrinsics.d(this.l, y2mVar.l) && Float.compare(0.9f, 0.9f) == 0;
    }

    public final int hashCode() {
        int iB = rw2.b(twn.a(this.j, ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(cs0.a(this.d, f140.f(this.c, ua80.b(Long.hashCode(this.f41911a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k);
        o0x o0xVar = this.l;
        return Float.hashCode(0.9f) + ((iB + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f41911a, "Content(champId=", ", title=", this.b);
        sbO.append(", champImage=");
        sbO.append(this.c);
        sbO.append(", champPlaceholder=");
        sbO.append(this.d);
        w6x.A(", favorite=", ", liveButtonVisible=", sbO, this.e, this.f);
        hne.u(", lineButtonVisible=", ", liveCount=", this.h, sbO, this.g);
        axq.s(this.j, ", lineCount=", this.i, ", globalChampId=", sbO);
        kng0.A(sbO, ", subSportId=", this.k, ", disciplineIcon=");
        sbO.append(this.l);
        sbO.append(", widthRatio=0.9)");
        return sbO.toString();
    }
}
