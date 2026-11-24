package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ifb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14678a;
    public final heb0 b;
    public final neb0 c;
    public final neb0 d;
    public final List e;
    public final leb0 f;
    public final mdm g;

    public ifb0(List list, heb0 heb0Var, neb0 neb0Var, neb0 neb0Var2, List list2, leb0 leb0Var, mdm mdmVar) {
        list.getClass();
        this.f14678a = list;
        this.b = heb0Var;
        this.c = neb0Var;
        this.d = neb0Var2;
        this.e = list2;
        this.f = leb0Var;
        this.g = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifb0)) {
            return false;
        }
        ifb0 ifb0Var = (ifb0) obj;
        return Intrinsics.d(this.f14678a, ifb0Var.f14678a) && Intrinsics.d(this.b, ifb0Var.b) && Intrinsics.d(this.c, ifb0Var.c) && Intrinsics.d(this.d, ifb0Var.d) && Intrinsics.d(this.e, ifb0Var.e) && Intrinsics.d(this.f, ifb0Var.f) && Intrinsics.d(this.g, ifb0Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.f14678a.hashCode() * 31;
        heb0 heb0Var = this.b;
        int iHashCode2 = (iHashCode + (heb0Var == null ? 0 : heb0Var.hashCode())) * 31;
        neb0 neb0Var = this.c;
        int iHashCode3 = (iHashCode2 + (neb0Var == null ? 0 : neb0Var.hashCode())) * 31;
        neb0 neb0Var2 = this.d;
        int iHashCode4 = (iHashCode3 + (neb0Var2 == null ? 0 : neb0Var2.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        leb0 leb0Var = this.f;
        int iHashCode6 = (iHashCode5 + (leb0Var == null ? 0 : leb0Var.hashCode())) * 31;
        mdm mdmVar = this.g;
        return iHashCode6 + (mdmVar != null ? mdmVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopularOneXGamesMapperContentState(order=");
        sb.append(this.f14678a);
        sb.append(", bannersUiModel=");
        sb.append(this.b);
        sb.append(", luckyWheelUiModel=");
        sb.append(this.c);
        sb.append(", jackpotUiModel=");
        sb.append(this.d);
        sb.append(", categoriesUiModels=");
        sb.append(this.e);
        sb.append(", spotlightUiModel=");
        sb.append(this.f);
        sb.append(", errorUiModel=");
        return cs0.m(sb, this.g, Separators.RPAREN);
    }
}
