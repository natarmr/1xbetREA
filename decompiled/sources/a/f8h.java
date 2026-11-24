package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f8h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9103a;
    public final String b;
    public final String c;
    public final vvv d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    public final List n;

    public f8h(long j, String str, String str2, vvv vvvVar, int i, int i2, int i3, int i4, int i5, List list, List list2, List list3, List list4, List list5) {
        rz4.B(list, list2, list3, list4, list5);
        this.f9103a = j;
        this.b = str;
        this.c = str2;
        this.d = vvvVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = list;
        this.k = list2;
        this.l = list3;
        this.m = list4;
        this.n = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8h)) {
            return false;
        }
        f8h f8hVar = (f8h) obj;
        return this.f9103a == f8hVar.f9103a && this.b.equals(f8hVar.b) && this.c.equals(f8hVar.c) && this.d.equals(f8hVar.d) && this.e == f8hVar.e && this.f == f8hVar.f && this.g == f8hVar.g && this.h == f8hVar.h && this.i == f8hVar.i && Intrinsics.d(this.j, f8hVar.j) && Intrinsics.d(this.k, f8hVar.k) && Intrinsics.d(this.l, f8hVar.l) && Intrinsics.d(this.m, f8hVar.m) && Intrinsics.d(this.n, f8hVar.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(twn.a(this.i, twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, (this.d.hashCode() + ua80.b(ua80.b(Long.hashCode(this.f9103a) * 31, 31, this.b), 31, this.c)) * 31, 31), 31), 31), 31), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f9103a, "CyberMatchTeamPlayerModel(id=", ", name=", this.b);
        sbO.append(", image=");
        sbO.append(this.c);
        sbO.append(", hero=");
        sbO.append(this.d);
        rw2.s(this.e, this.f, ", gpm=", ", xpm=", sbO);
        rw2.s(this.g, this.h, ", kills=", ", deaths=", sbO);
        sbO.append(", assists=");
        sbO.append(this.i);
        sbO.append(", killTargets=");
        sbO.append(this.j);
        hne.v(", significantItems=", ", neutralItems=", sbO, this.k, this.l);
        hne.v(", supportItems=", ", abilities=", sbO, this.m, this.n);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
