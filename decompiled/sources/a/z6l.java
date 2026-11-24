package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z6l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43874a;
    public final long b;
    public final o4i0 c;
    public final List d;
    public final long e;
    public final long f;
    public final boolean g;

    public z6l(long j, long j2, long j3, long j4, o4i0 o4i0Var, List list, boolean z) {
        list.getClass();
        this.f43874a = j;
        this.b = j2;
        this.c = o4i0Var;
        this.d = list;
        this.e = j3;
        this.f = j4;
        this.g = z;
    }

    public static z6l a(z6l z6lVar, long j, long j2, o4i0 o4i0Var, ArrayList arrayList, long j3, long j4, boolean z, int i) {
        if ((i & 1) != 0) {
            j = z6lVar.f43874a;
        }
        long j5 = j;
        long j6 = (i & 2) != 0 ? z6lVar.b : j2;
        o4i0 o4i0Var2 = (i & 4) != 0 ? z6lVar.c : o4i0Var;
        List list = (i & 8) != 0 ? z6lVar.d : arrayList;
        long j7 = (i & 16) != 0 ? z6lVar.e : j3;
        long j8 = (i & 32) != 0 ? z6lVar.f : j4;
        boolean z2 = (i & 64) != 0 ? z6lVar.g : z;
        list.getClass();
        return new z6l(j5, j6, j7, j8, o4i0Var2, list, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6l)) {
            return false;
        }
        z6l z6lVar = (z6l) obj;
        return this.f43874a == z6lVar.f43874a && this.b == z6lVar.b && this.c.equals(z6lVar.c) && Intrinsics.d(this.d, z6lVar.d) && this.e == z6lVar.e && this.f == z6lVar.f && this.g == z6lVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + rw2.b(rw2.b(dw9.a((this.c.hashCode() + rw2.b(Long.hashCode(this.f43874a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f43874a, "DotaSelectedStateModel(statisticSelectedTabId=", ", heroSelectedTabId=");
        sbQ.append(this.b);
        sbQ.append(", selectedPlayers=");
        sbQ.append(this.c);
        sbQ.append(", expandedPlayers=");
        sbQ.append(this.d);
        sbQ.append(", bestHeroesSelectedTabId=");
        sbQ.append(this.e);
        kng0.A(sbQ, ", lastMatchesSelectedTabId=", this.f, ", lastMatchesFooterCollapsed=");
        return rw2.p(sbQ, this.g, Separators.RPAREN);
    }
}
