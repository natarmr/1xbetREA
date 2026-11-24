package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ws50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39676a;
    public final int b;
    public final xyq0 c;
    public final List d;
    public final List e;
    public final int f;
    public final mdm g;

    public ws50(boolean z, int i, xyq0 xyq0Var, List list, List list2, int i2, mdm mdmVar) {
        list.getClass();
        list2.getClass();
        this.f39676a = z;
        this.b = i;
        this.c = xyq0Var;
        this.d = list;
        this.e = list2;
        this.f = i2;
        this.g = mdmVar;
    }

    public static ws50 a(ws50 ws50Var, boolean z, int i, xyq0 xyq0Var, List list, List list2, mdm mdmVar, int i2) {
        if ((i2 & 1) != 0) {
            z = ws50Var.f39676a;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i = ws50Var.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            xyq0Var = ws50Var.c;
        }
        xyq0 xyq0Var2 = xyq0Var;
        if ((i2 & 8) != 0) {
            list = ws50Var.d;
        }
        List list3 = list;
        if ((i2 & 16) != 0) {
            list2 = ws50Var.e;
        }
        List list4 = list2;
        int i4 = ws50Var.f;
        if ((i2 & 64) != 0) {
            mdmVar = ws50Var.g;
        }
        ws50Var.getClass();
        list3.getClass();
        list4.getClass();
        return new ws50(z2, i3, xyq0Var2, list3, list4, i4, mdmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws50)) {
            return false;
        }
        ws50 ws50Var = (ws50) obj;
        return this.f39676a == ws50Var.f39676a && this.b == ws50Var.b && this.c.equals(ws50Var.c) && Intrinsics.d(this.d, ws50Var.d) && Intrinsics.d(this.e, ws50Var.e) && this.f == ws50Var.f && Intrinsics.d(this.g, ws50Var.g);
    }

    public final int hashCode() {
        int iA = twn.a(this.f, dw9.a(dw9.a((this.c.hashCode() + twn.a(this.b, Boolean.hashCode(this.f39676a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31);
        mdm mdmVar = this.g;
        return iA + (mdmVar == null ? 0 : mdmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = ohs0.t(this.b, "NewsCatalogRowsState(loading=", ", topBannerCurrentIndex=", ", topBannerPauseConditions=", this.f39676a);
        sbT.append(this.c);
        sbT.append(", cmsBannerItems=");
        sbT.append(this.d);
        sbT.append(", bannerItems=");
        brm0.v(this.f, ", lottieTypeId=", ", errorLottieConfig=", sbT, this.e);
        return cs0.m(sbT, this.g, Separators.RPAREN);
    }
}
