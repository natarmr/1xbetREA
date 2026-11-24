package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pa9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26644a;
    public final List b;
    public final rvm0 c;
    public final boolean d;
    public final List e;
    public final List f;
    public final wdn g;
    public final l9s h;
    public final boolean i;

    public pa9(List list, List list2, rvm0 rvm0Var, boolean z, List list3, List list4, wdn wdnVar, l9s l9sVar, boolean z2) {
        b1j.B(list2, list3, list4);
        this.f26644a = list;
        this.b = list2;
        this.c = rvm0Var;
        this.d = z;
        this.e = list3;
        this.f = list4;
        this.g = wdnVar;
        this.h = l9sVar;
        this.i = z2;
    }

    public static pa9 a(pa9 pa9Var, List list, ArrayList arrayList, rvm0 rvm0Var, boolean z, List list2, List list3, wdn wdnVar, l9s l9sVar, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = pa9Var.f26644a;
        }
        List list4 = list;
        List list5 = arrayList;
        if ((i & 2) != 0) {
            list5 = pa9Var.b;
        }
        List list6 = list5;
        if ((i & 4) != 0) {
            rvm0Var = pa9Var.c;
        }
        rvm0 rvm0Var2 = rvm0Var;
        if ((i & 8) != 0) {
            z = pa9Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            list2 = pa9Var.e;
        }
        List list7 = list2;
        List list8 = (i & 32) != 0 ? pa9Var.f : list3;
        wdn wdnVar2 = (i & 64) != 0 ? pa9Var.g : wdnVar;
        l9s l9sVar2 = (i & 128) != 0 ? pa9Var.h : l9sVar;
        boolean z4 = (i & 256) != 0 ? pa9Var.i : z2;
        pa9Var.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        return new pa9(list4, list6, rvm0Var2, z3, list7, list8, wdnVar2, l9sVar2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa9)) {
            return false;
        }
        pa9 pa9Var = (pa9) obj;
        return Intrinsics.d(this.f26644a, pa9Var.f26644a) && Intrinsics.d(this.b, pa9Var.b) && Intrinsics.d(this.c, pa9Var.c) && this.d == pa9Var.d && Intrinsics.d(this.e, pa9Var.e) && Intrinsics.d(this.f, pa9Var.f) && this.g == pa9Var.g && Intrinsics.d(this.h, pa9Var.h) && this.i == pa9Var.i;
    }

    public final int hashCode() {
        List list = this.f26644a;
        int iA = dw9.a((list == null ? 0 : list.hashCode()) * 31, 31, this.b);
        rvm0 rvm0Var = this.c;
        int iHashCode = (this.g.hashCode() + dw9.a(dw9.a(brm0.e((iA + (rvm0Var == null ? 0 : rvm0Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31;
        l9s l9sVar = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode + (l9sVar != null ? l9sVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("BuildDuelState(playersList=", ", subGames=", this.f26644a, ", currentSubGame=", this.b);
        sbT.append(this.c);
        sbT.append(", isError=");
        sbT.append(this.d);
        sbT.append(", firstTeam=");
        b1j.y(", secondTeam=", ", currentTeam=", sbT, this.e, this.f);
        sbT.append(this.g);
        sbT.append(", gameDetailsModel=");
        sbT.append(this.h);
        sbT.append(", isLoading=");
        return rw2.p(sbT, this.i, Separators.RPAREN);
    }
}
