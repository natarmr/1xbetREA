package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yrj0 implements uqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43124a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final ArrayList e;
    public final boolean f;
    public final jmo g;
    public final boolean h;

    public yrj0(List list, List list2, boolean z, boolean z2, ArrayList arrayList, boolean z3, jmo jmoVar, boolean z4) {
        list.getClass();
        list2.getClass();
        this.f43124a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
        this.e = arrayList;
        this.f = z3;
        this.g = jmoVar;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrj0)) {
            return false;
        }
        yrj0 yrj0Var = (yrj0) obj;
        return Intrinsics.d(this.f43124a, yrj0Var.f43124a) && Intrinsics.d(this.b, yrj0Var.b) && this.c == yrj0Var.c && this.d == yrj0Var.d && this.e.equals(yrj0Var.e) && this.f == yrj0Var.f && this.g.equals(yrj0Var.g) && this.h == yrj0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + brm0.e(twn.g(this.e, brm0.e(brm0.e(dw9.a(this.f43124a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("ShortStatisticUiModel(teamOneImageUrls=", ", teamTwoImageUrls=", this.f43124a, ", pairTeam=", this.b);
        ua80.u(", hostVsGuests=", ", infoList=", sbT, this.c, this.d);
        sbT.append(this.e);
        sbT.append(", expanded=");
        sbT.append(this.f);
        sbT.append(", btnUiModel=");
        sbT.append(this.g);
        sbT.append(", rtlSupport=");
        sbT.append(this.h);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
