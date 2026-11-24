package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class c52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3750a;
    public final List b;
    public final List c;
    public final List d;
    public final wdj e;
    public final wdj f;
    public final boolean g;
    public final boolean h;
    public final HistoryTypeModel i;
    public final boolean j;
    public final int k;

    public c52(List list, List list2, List list3, List list4, wdj wdjVar, wdj wdjVar2, boolean z, boolean z2, HistoryTypeModel historyTypeModel, boolean z3, int i) {
        wdjVar.getClass();
        this.f3750a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = wdjVar;
        this.f = wdjVar2;
        this.g = z;
        this.h = z2;
        this.i = historyTypeModel;
        this.j = z3;
        this.k = i;
    }

    public static c52 a(c52 c52Var, List list, List list2, wdj wdjVar, int i) {
        List list3 = c52Var.f3750a;
        if ((i & 2) != 0) {
            list = c52Var.b;
        }
        List list4 = list;
        List list5 = c52Var.c;
        if ((i & 8) != 0) {
            list2 = c52Var.d;
        }
        List list6 = list2;
        if ((i & 16) != 0) {
            wdjVar = c52Var.e;
        }
        wdj wdjVar2 = wdjVar;
        wdj wdjVar3 = c52Var.f;
        c52Var.getClass();
        boolean z = c52Var.g;
        boolean z2 = c52Var.h;
        HistoryTypeModel historyTypeModel = c52Var.i;
        boolean z3 = c52Var.j;
        int i2 = c52Var.k;
        c52Var.getClass();
        wdjVar2.getClass();
        return new c52(list3, list4, list5, list6, wdjVar2, wdjVar3, z, z2, historyTypeModel, z3, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c52)) {
            return false;
        }
        c52 c52Var = (c52) obj;
        return this.f3750a.equals(c52Var.f3750a) && this.b.equals(c52Var.b) && this.c.equals(c52Var.c) && this.d.equals(c52Var.d) && Intrinsics.d(this.e, c52Var.e) && this.f.equals(c52Var.f) && this.g == c52Var.g && this.h == c52Var.h && this.i == c52Var.i && this.j == c52Var.j && this.k == c52Var.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + brm0.e((this.i.hashCode() + brm0.e(brm0.e(brm0.e((this.f.hashCode() + ((this.e.hashCode() + dw9.a(dw9.a(dw9.a(this.f3750a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31, false), 31, this.g), 31, this.h)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("AllFiltersState(defaultStatusModelList=", ", selectedStatusModelList=", this.f3750a, ", defaultBetTypeModelList=", this.b);
        b1j.y(", selectedBetTypeModelList=", ", selectedDatePeriod=", sbT, this.c, this.d);
        sbT.append(this.e);
        sbT.append(", defaultDatePeriod=");
        sbT.append(this.f);
        sbT.append(", resetButtonEnabled=false, hasHistoryPeriodFilter=");
        ua80.u(", hasHistoryToEmail=", ", historyType=", sbT, this.g, this.h);
        sbT.append(this.i);
        sbT.append(", isCalendarEnable=");
        sbT.append(this.j);
        sbT.append(", maxPeriod=");
        return rz4.j(this.k, Separators.RPAREN, sbT);
    }
}
