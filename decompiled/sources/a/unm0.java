package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class unm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35971a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final HistoryTypeModel h;

    public unm0(List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, HistoryTypeModel historyTypeModel) {
        this.f35971a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = historyTypeModel;
    }

    public static unm0 a(unm0 unm0Var, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = unm0Var.f35971a;
        }
        List list2 = list;
        List list3 = unm0Var.b;
        if ((i & 4) != 0) {
            z = unm0Var.c;
        }
        boolean z6 = z;
        if ((i & 8) != 0) {
            z2 = unm0Var.d;
        }
        boolean z7 = z2;
        if ((i & 16) != 0) {
            z3 = unm0Var.e;
        }
        boolean z8 = z3;
        if ((i & 32) != 0) {
            z4 = unm0Var.f;
        }
        boolean z9 = z4;
        boolean z10 = (i & 64) != 0 ? unm0Var.g : z5;
        HistoryTypeModel historyTypeModel = unm0Var.h;
        unm0Var.getClass();
        return new unm0(list2, list3, z6, z7, z8, z9, z10, historyTypeModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unm0)) {
            return false;
        }
        unm0 unm0Var = (unm0) obj;
        return this.f35971a.equals(unm0Var.f35971a) && this.b.equals(unm0Var.b) && this.c == unm0Var.c && this.d == unm0Var.d && this.e == unm0Var.e && this.f == unm0Var.f && this.g == unm0Var.g && this.h == unm0Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(dw9.a(this.f35971a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("StatusFilterModel(couponStatusList=", ", initialCouponStatusList=", this.f35971a, ", isConfirmButtonEnable=", this.b);
        ua80.u(", isClearButtonEnable=", ", isAllStateFilterEnable=", sbT, this.c, this.d);
        ua80.u(", isAllTypeGameEnable=", ", isAllBetTypeEnable=", sbT, this.e, this.f);
        sbT.append(this.g);
        sbT.append(", historyTypeModel=");
        sbT.append(this.h);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
