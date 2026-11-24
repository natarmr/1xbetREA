package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d1z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5333a;
    public final boolean b;
    public final int c;
    public final zdm0 d;
    public final nc5 e;
    public final n3q f;
    public final List g;
    public final hxs0 h;
    public final boolean i;

    public d1z(boolean z, boolean z2, int i, zdm0 zdm0Var, nc5 nc5Var, n3q n3qVar, List list, hxs0 hxs0Var, boolean z3) {
        list.getClass();
        this.f5333a = z;
        this.b = z2;
        this.c = i;
        this.d = zdm0Var;
        this.e = nc5Var;
        this.f = n3qVar;
        this.g = list;
        this.h = hxs0Var;
        this.i = z3;
    }

    public static d1z a(d1z d1zVar, boolean z, boolean z2, int i, zdm0 zdm0Var, nc5 nc5Var, n3q n3qVar, ArrayList arrayList, hxs0 hxs0Var, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            z = d1zVar.f5333a;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            z2 = d1zVar.b;
        }
        boolean z5 = z2;
        if ((i2 & 4) != 0) {
            i = d1zVar.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            zdm0Var = d1zVar.d;
        }
        zdm0 zdm0Var2 = zdm0Var;
        if ((i2 & 16) != 0) {
            nc5Var = d1zVar.e;
        }
        nc5 nc5Var2 = nc5Var;
        n3q n3qVar2 = (i2 & 32) != 0 ? d1zVar.f : n3qVar;
        List list = (i2 & 64) != 0 ? d1zVar.g : arrayList;
        hxs0 hxs0Var2 = (i2 & 128) != 0 ? d1zVar.h : hxs0Var;
        boolean z6 = (i2 & 256) != 0 ? d1zVar.i : z3;
        d1zVar.getClass();
        list.getClass();
        return new d1z(z4, z5, i3, zdm0Var2, nc5Var2, n3qVar2, list, hxs0Var2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1z)) {
            return false;
        }
        d1z d1zVar = (d1z) obj;
        return this.f5333a == d1zVar.f5333a && this.b == d1zVar.b && this.c == d1zVar.c && this.d.equals(d1zVar.d) && this.e.equals(d1zVar.e) && this.f == d1zVar.f && Intrinsics.d(this.g, d1zVar.g) && Intrinsics.d(this.h, d1zVar.h) && this.i == d1zVar.i;
    }

    public final int hashCode() {
        int iA = dw9.a((this.f.hashCode() + ((this.e.hashCode() + kng0.a(this.d, twn.a(this.c, brm0.e(Boolean.hashCode(this.f5333a) * 31, 31, this.b), 31), 31)) * 31)) * 31, 31, this.g);
        hxs0 hxs0Var = this.h;
        return Boolean.hashCode(this.i) + ((iA + (hxs0Var == null ? 0 : hxs0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("LastGamesState(isLoading=", ", hasError=", ", selectedTab=", this.f5333a, this.b);
        sbQ.append(this.c);
        sbQ.append(", statisticHeaderUiModel=");
        sbQ.append(this.d);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.e);
        sbQ.append(", selectedFilter=");
        sbQ.append(this.f);
        sbQ.append(", filterModelList=");
        sbQ.append(this.g);
        sbQ.append(", twoTeamLastGamesModel=");
        sbQ.append(this.h);
        sbQ.append(", headerExpanded=");
        return rw2.p(sbQ, this.i, Separators.RPAREN);
    }
}
