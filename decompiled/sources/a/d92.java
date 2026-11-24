package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e92 f5678a;
    public final b92 b;
    public final lwk0 c;
    public final List d;
    public final boolean e;
    public final yi50 f;
    public final dj50 g;
    public final long h;
    public final long i;
    public final bj50 j;
    public final boolean k;

    public d92(e92 e92Var, b92 b92Var, lwk0 lwk0Var, List list, boolean z, yi50 yi50Var, dj50 dj50Var, long j, long j2, bj50 bj50Var, boolean z2) {
        list.getClass();
        this.f5678a = e92Var;
        this.b = b92Var;
        this.c = lwk0Var;
        this.d = list;
        this.e = z;
        this.f = yi50Var;
        this.g = dj50Var;
        this.h = j;
        this.i = j2;
        this.j = bj50Var;
        this.k = z2;
    }

    public static d92 a(d92 d92Var, b92 b92Var, lwk0 lwk0Var, List list, yi50 yi50Var, dj50 dj50Var, long j, bj50 bj50Var, int i) {
        e92 e92Var = d92Var.f5678a;
        b92 b92Var2 = (i & 2) != 0 ? d92Var.b : b92Var;
        lwk0 lwk0Var2 = (i & 4) != 0 ? d92Var.c : lwk0Var;
        List list2 = (i & 8) != 0 ? d92Var.d : list;
        boolean z = d92Var.e;
        yi50 yi50Var2 = (i & 32) != 0 ? d92Var.f : yi50Var;
        dj50 dj50Var2 = (i & 64) != 0 ? d92Var.g : dj50Var;
        long j2 = d92Var.h;
        long j3 = (i & 256) != 0 ? d92Var.i : j;
        bj50 bj50Var2 = (i & 512) != 0 ? d92Var.j : bj50Var;
        boolean z2 = d92Var.k;
        d92Var.getClass();
        list2.getClass();
        return new d92(e92Var, b92Var2, lwk0Var2, list2, z, yi50Var2, dj50Var2, j2, j3, bj50Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d92) {
            d92 d92Var = (d92) obj;
            if (this.f5678a.equals(d92Var.f5678a) && this.b.equals(d92Var.b) && this.c.equals(d92Var.c) && Intrinsics.d(this.d, d92Var.d) && this.e == d92Var.e && this.f.equals(d92Var.f) && Intrinsics.d(this.g, d92Var.g) && znq0.e(this.h, d92Var.h) && this.i == d92Var.i && Intrinsics.d(this.j, d92Var.j) && this.k == d92Var.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + brm0.e(dw9.a((this.c.hashCode() + ((this.b.hashCode() + (this.f5678a.f7400a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e)) * 31;
        dj50 dj50Var = this.g;
        int iB = rw2.b(rw2.b((iHashCode + (dj50Var == null ? 0 : dj50Var.hashCode())) * 31, 31, this.h), 31, this.i);
        bj50 bj50Var = this.j;
        return Boolean.hashCode(this.k) + ((iB + (bj50Var != null ? bj50Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strH = znq0.h(this.h);
        String strG = ynq0.g(this.i);
        StringBuilder sb = new StringBuilder("AltDesignLSpecialEventMainState(toolbar=");
        sb.append(this.f5678a);
        sb.append(", settings=");
        sb.append(this.b);
        sb.append(", tabs=");
        sb.append(this.c);
        sb.append(", favoriteTeamModelList=");
        sb.append(this.d);
        sb.append(", isBettingDisabled=");
        sb.append(this.e);
        sb.append(", nearestGameLoadState=");
        sb.append(this.f);
        sb.append(", nearestGameTimer=");
        sb.append(this.g);
        sb.append(", eventStartTime=");
        sb.append(strH);
        sb.append(", eventStartTimerValue=");
        sb.append(strG);
        sb.append(", nearestGameScoreSnapshotModel=");
        sb.append(this.j);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.k, Separators.RPAREN);
    }
}
