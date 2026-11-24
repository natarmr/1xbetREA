package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pyy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27820a;
    public final ypl0 b;
    public final j0g0 c;
    public final Set d;
    public final List e;
    public final sff0 f;
    public final boolean g;

    public pyy(boolean z, ypl0 ypl0Var, j0g0 j0g0Var, Set set, List list, sff0 sff0Var, boolean z2) {
        set.getClass();
        list.getClass();
        this.f27820a = z;
        this.b = ypl0Var;
        this.c = j0g0Var;
        this.d = set;
        this.e = list;
        this.f = sff0Var;
        this.g = z2;
    }

    public static pyy a(pyy pyyVar, boolean z, ypl0 ypl0Var, j0g0 j0g0Var, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            z = pyyVar.f27820a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            ypl0Var = pyyVar.b;
        }
        ypl0 ypl0Var2 = ypl0Var;
        if ((i & 4) != 0) {
            j0g0Var = pyyVar.c;
        }
        j0g0 j0g0Var2 = j0g0Var;
        Set set = linkedHashSet;
        if ((i & 8) != 0) {
            set = pyyVar.d;
        }
        Set set2 = set;
        List list = pyyVar.e;
        sff0 sff0Var = pyyVar.f;
        boolean z3 = pyyVar.g;
        pyyVar.getClass();
        ypl0Var2.getClass();
        set2.getClass();
        list.getClass();
        return new pyy(z2, ypl0Var2, j0g0Var2, set2, list, sff0Var, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyy)) {
            return false;
        }
        pyy pyyVar = (pyy) obj;
        return this.f27820a == pyyVar.f27820a && this.b.equals(pyyVar.b) && Intrinsics.d(this.c, pyyVar.c) && Intrinsics.d(this.d, pyyVar.d) && Intrinsics.d(this.e, pyyVar.e) && this.f.equals(pyyVar.f) && this.g == pyyVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.f27820a) * 31)) * 31;
        j0g0 j0g0Var = this.c;
        return Boolean.hashCode(this.g) + cs0.c(this.f, dw9.a(ohs0.g(this.d, (iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31, 31), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastFightsStateModel(connected=");
        sb.append(this.f27820a);
        sb.append(", sportSimpleModel=");
        sb.append(this.b);
        sb.append(", fighterResults=");
        sb.append(this.c);
        sb.append(", expandedHistoryGamesIds=");
        sb.append(this.d);
        sb.append(", specialEventList=");
        sb.append(this.e);
        sb.append(", remoteConfigModel=");
        sb.append(this.f);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
