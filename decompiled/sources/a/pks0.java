package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.presentation.TransferScreenParams;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class pks0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferScreenParams f27151a;
    public final long b;
    public final String c;
    public final String d;
    public final j0g0 e;
    public final ypl0 f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final List j;
    public final TransferTimeFilterUiModel k;
    public final List l;

    public pks0(TransferScreenParams transferScreenParams, long j, String str, String str2, j0g0 j0g0Var, ypl0 ypl0Var, boolean z, boolean z2, String str3, List list, TransferTimeFilterUiModel transferTimeFilterUiModel, List list2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.f27151a = transferScreenParams;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = j0g0Var;
        this.f = ypl0Var;
        this.g = z;
        this.h = z2;
        this.i = str3;
        this.j = list;
        this.k = transferTimeFilterUiModel;
        this.l = list2;
    }

    public static pks0 a(pks0 pks0Var, long j, j0g0 j0g0Var, ypl0 ypl0Var, boolean z, boolean z2, String str, TransferTimeFilterUiModel transferTimeFilterUiModel, List list, int i) {
        TransferScreenParams transferScreenParams = pks0Var.f27151a;
        long j2 = (i & 2) != 0 ? pks0Var.b : j;
        String str2 = pks0Var.c;
        String str3 = pks0Var.d;
        j0g0 j0g0Var2 = (i & 16) != 0 ? pks0Var.e : j0g0Var;
        ypl0 ypl0Var2 = (i & 32) != 0 ? pks0Var.f : ypl0Var;
        boolean z3 = (i & 64) != 0 ? pks0Var.g : z;
        boolean z4 = (i & 128) != 0 ? pks0Var.h : z2;
        String str4 = (i & 256) != 0 ? pks0Var.i : str;
        List list2 = pks0Var.j;
        TransferTimeFilterUiModel transferTimeFilterUiModel2 = (i & 1024) != 0 ? pks0Var.k : transferTimeFilterUiModel;
        List list3 = (i & 2048) != 0 ? pks0Var.l : list;
        pks0Var.getClass();
        str2.getClass();
        str3.getClass();
        list2.getClass();
        list3.getClass();
        return new pks0(transferScreenParams, j2, str2, str3, j0g0Var2, ypl0Var2, z3, z4, str4, list2, transferTimeFilterUiModel2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pks0)) {
            return false;
        }
        pks0 pks0Var = (pks0) obj;
        return this.f27151a.equals(pks0Var.f27151a) && this.b == pks0Var.b && Intrinsics.d(this.c, pks0Var.c) && Intrinsics.d(this.d, pks0Var.d) && Intrinsics.d(this.e, pks0Var.e) && Intrinsics.d(this.f, pks0Var.f) && this.g == pks0Var.g && this.h == pks0Var.h && this.i.equals(pks0Var.i) && Intrinsics.d(this.j, pks0Var.j) && this.k.equals(pks0Var.k) && Intrinsics.d(this.l, pks0Var.l);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(rw2.b(this.f27151a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        j0g0 j0g0Var = this.e;
        int iB2 = (iB + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31;
        ypl0 ypl0Var = this.f;
        return this.l.hashCode() + ((this.k.hashCode() + dw9.a(ua80.b(brm0.e(brm0.e((iB2 + (ypl0Var != null ? ypl0Var.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransfersStateModel(params=");
        sb.append(this.f27151a);
        sb.append(", selectedSubSportId=");
        sb.append(this.b);
        f140.v(sb, ", screenTitle=", this.c, ", searchHint=", this.d);
        sb.append(", transfers=");
        sb.append(this.e);
        sb.append(", sportSimpleModel=");
        sb.append(this.f);
        w6x.A(", searchEnabled=", ", resetScroll=", sb, this.g, this.h);
        ua80.t(", query=", this.i, ", timeFilter=", sb, this.j);
        sb.append(", selectedTimeFilter=");
        sb.append(this.k);
        sb.append(", disciplineFilter=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
