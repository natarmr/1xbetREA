package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class szo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0t f33080a;
    public final List b;
    public final izo0 c;
    public final nzo0 d;
    public final boolean e;
    public final boolean f;

    public szo0(d0t d0tVar, List list, izo0 izo0Var, nzo0 nzo0Var, boolean z, boolean z2) {
        list.getClass();
        this.f33080a = d0tVar;
        this.b = list;
        this.c = izo0Var;
        this.d = nzo0Var;
        this.e = z;
        this.f = z2;
    }

    public static szo0 a(szo0 szo0Var, d0t d0tVar, ArrayList arrayList, izo0 izo0Var, nzo0 nzo0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            d0tVar = szo0Var.f33080a;
        }
        d0t d0tVar2 = d0tVar;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = szo0Var.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            izo0Var = szo0Var.c;
        }
        izo0 izo0Var2 = izo0Var;
        if ((i & 8) != 0) {
            nzo0Var = szo0Var.d;
        }
        nzo0 nzo0Var2 = nzo0Var;
        if ((i & 16) != 0) {
            z = szo0Var.e;
        }
        boolean z2 = z;
        boolean z3 = (i & 32) != 0 ? szo0Var.f : false;
        szo0Var.getClass();
        list2.getClass();
        return new szo0(d0tVar2, list2, izo0Var2, nzo0Var2, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szo0)) {
            return false;
        }
        szo0 szo0Var = (szo0) obj;
        return Intrinsics.d(this.f33080a, szo0Var.f33080a) && Intrinsics.d(this.b, szo0Var.b) && this.c == szo0Var.c && Intrinsics.d(this.d, szo0Var.d) && this.e == szo0Var.e && this.f == szo0Var.f;
    }

    public final int hashCode() {
        d0t d0tVar = this.f33080a;
        int iHashCode = (this.c.hashCode() + dw9.a((d0tVar == null ? 0 : d0tVar.hashCode()) * 31, 31, this.b)) * 31;
        nzo0 nzo0Var = this.d;
        return Boolean.hashCode(this.f) + brm0.e((iHashCode + (nzo0Var != null ? nzo0Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamBetEventsScreenState(nearestEvent=");
        sb.append(this.f33080a);
        sb.append(", upcomingEvents=");
        sb.append(this.b);
        sb.append(", errorType=");
        sb.append(this.c);
        sb.append(", config=");
        sb.append(this.d);
        sb.append(", isRefreshing=");
        return ohs0.p(", eventsFirstRequest=", Separators.RPAREN, sb, this.e, this.f);
    }
}
