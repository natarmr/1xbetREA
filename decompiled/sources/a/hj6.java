package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hj6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13145a;
    public final ji6 b;
    public final l9s c;
    public final List d;
    public final Long e;
    public final String f;
    public final boolean g;
    public final oxk0 h;
    public final boolean i;
    public final List j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public hj6(boolean z, ji6 ji6Var, l9s l9sVar, List list, Long l, String str, boolean z2, oxk0 oxk0Var, boolean z3, List list2, boolean z4, boolean z5, boolean z6) {
        list.getClass();
        list2.getClass();
        this.f13145a = z;
        this.b = ji6Var;
        this.c = l9sVar;
        this.d = list;
        this.e = l;
        this.f = str;
        this.g = z2;
        this.h = oxk0Var;
        this.i = z3;
        this.j = list2;
        this.k = z4;
        this.l = z5;
        this.m = z6;
    }

    public static hj6 a(hj6 hj6Var, boolean z, ji6 ji6Var, l9s l9sVar, List list, Long l, String str, boolean z2, List list2, int i) {
        boolean z3 = (i & 1) != 0 ? hj6Var.f13145a : z;
        ji6 ji6Var2 = (i & 2) != 0 ? hj6Var.b : ji6Var;
        l9s l9sVar2 = (i & 4) != 0 ? hj6Var.c : l9sVar;
        List list3 = (i & 8) != 0 ? hj6Var.d : list;
        Long l2 = (i & 16) != 0 ? hj6Var.e : l;
        String str2 = (i & 32) != 0 ? hj6Var.f : str;
        boolean z4 = (i & 64) != 0 ? hj6Var.g : z2;
        oxk0 oxk0Var = hj6Var.h;
        boolean z5 = hj6Var.i;
        List list4 = (i & 512) != 0 ? hj6Var.j : list2;
        boolean z6 = hj6Var.k;
        boolean z7 = hj6Var.l;
        boolean z8 = hj6Var.m;
        hj6Var.getClass();
        list3.getClass();
        str2.getClass();
        list4.getClass();
        return new hj6(z3, ji6Var2, l9sVar2, list3, l2, str2, z4, oxk0Var, z5, list4, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj6)) {
            return false;
        }
        hj6 hj6Var = (hj6) obj;
        return this.f13145a == hj6Var.f13145a && Intrinsics.d(this.b, hj6Var.b) && Intrinsics.d(this.c, hj6Var.c) && Intrinsics.d(this.d, hj6Var.d) && Intrinsics.d(this.e, hj6Var.e) && this.f.equals(hj6Var.f) && this.g == hj6Var.g && this.h == hj6Var.h && this.i == hj6Var.i && Intrinsics.d(this.j, hj6Var.j) && this.k == hj6Var.k && this.l == hj6Var.l && this.m == hj6Var.m;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f13145a) * 31;
        ji6 ji6Var = this.b;
        int iHashCode2 = (iHashCode + (ji6Var == null ? 0 : ji6Var.hashCode())) * 31;
        l9s l9sVar = this.c;
        int iA = dw9.a((iHashCode2 + (l9sVar == null ? 0 : l9sVar.hashCode())) * 31, 31, this.d);
        Long l = this.e;
        return Boolean.hashCode(this.m) + brm0.e(brm0.e(dw9.a(brm0.e((this.h.hashCode() + brm0.e(ua80.b((iA + (l != null ? l.hashCode() : 0)) * 31, 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetBuilderMarketsStateModel(live=");
        sb.append(this.f13145a);
        sb.append(", betBuilderMarkets=");
        sb.append(this.b);
        sb.append(", gameInfo=");
        sb.append(this.c);
        sb.append(", subGames=");
        sb.append(this.d);
        sb.append(", delegateSubGameId=");
        rz4.v(this.e, ", subGamesSearchQuery=", this.f, ", isBetBuilderModeEnabled=", sb);
        sb.append(this.g);
        sb.append(", supportedSpecialType=");
        sb.append(this.h);
        sb.append(", rtlSupport=");
        vqd.y(sb, ", totalExactSelectedModels=", this.j, ", isCheckNewPromocodes=", this.i);
        ua80.u(", isNewEventParams=", ", isNewEventParamsLogsEnabled=", sb, this.k, this.l);
        return rw2.p(sb, this.m, Separators.RPAREN);
    }
}
