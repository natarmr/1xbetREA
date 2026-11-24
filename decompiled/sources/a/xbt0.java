package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xbt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40616a;
    public final Object b;
    public final Object c;
    public final List d;
    public final ypl0 e;
    public final qgg f;
    public final Object g;
    public final List h;
    public final Object i;
    public final Object j;
    public final String k;

    public xbt0(Object obj, Object obj2, Object obj3, List list, ypl0 ypl0Var, qgg qggVar, Object obj4, List list2, Object obj5, Object obj6, String str) {
        list.getClass();
        ypl0Var.getClass();
        qggVar.getClass();
        list2.getClass();
        this.f40616a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = list;
        this.e = ypl0Var;
        this.f = qggVar;
        this.g = obj4;
        this.h = list2;
        this.i = obj5;
        this.j = obj6;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbt0)) {
            return false;
        }
        xbt0 xbt0Var = (xbt0) obj;
        Object obj2 = xbt0Var.f40616a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f40616a, obj2) && Intrinsics.d(this.b, xbt0Var.b) && Intrinsics.d(this.c, xbt0Var.c) && Intrinsics.d(this.d, xbt0Var.d) && Intrinsics.d(this.e, xbt0Var.e) && Intrinsics.d(this.f, xbt0Var.f) && Intrinsics.d(this.g, xbt0Var.g) && Intrinsics.d(this.h, xbt0Var.h) && Intrinsics.d(this.i, xbt0Var.i) && Intrinsics.d(this.j, xbt0Var.j) && this.k.equals(xbt0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + twn.c(twn.c(dw9.a(twn.c((this.f.hashCode() + ((this.e.hashCode() + dw9.a(twn.c(twn.c(j0g0.b(this.f40616a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        String strD = j0g0.d(this.f40616a);
        String strD2 = j0g0.d(this.b);
        String strD3 = j0g0.d(this.c);
        String strD4 = j0g0.d(this.g);
        String strD5 = j0g0.d(this.i);
        String strD6 = j0g0.d(this.j);
        StringBuilder sbN = b1j.n("UniversalChampScenarioModel(tournamentModel=", strD, ", liveChampEvent=", strD2, ", lineChampEvent=");
        cs0.y(strD3, ", champBanners=", ", sportSimpleModel=", sbN, this.d);
        sbN.append(this.e);
        sbN.append(", champsImagesModel=");
        sbN.append(this.f);
        sbN.append(", tournamentFeedStatistic=");
        cs0.y(strD4, ", socialMediaList=", ", resultsCalendarDates=", sbN, this.h);
        f140.v(sbN, strD5, ", universalChampResults=", strD6, ", tourTime=");
        return axq.n(sbN, this.k, Separators.RPAREN);
    }
}
