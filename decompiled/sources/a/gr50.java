package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gr50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11764a;
    public final int b;
    public final List c;
    public final List d;
    public final int e;
    public final mdm f;

    public gr50(boolean z, int i, List list, List list2, int i2, mdm mdmVar) {
        list.getClass();
        list2.getClass();
        this.f11764a = z;
        this.b = i;
        this.c = list;
        this.d = list2;
        this.e = i2;
        this.f = mdmVar;
    }

    public static gr50 a(gr50 gr50Var, boolean z, int i, List list, List list2, mdm mdmVar, int i2) {
        if ((i2 & 1) != 0) {
            z = gr50Var.f11764a;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i = gr50Var.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list = gr50Var.c;
        }
        List list3 = list;
        if ((i2 & 8) != 0) {
            list2 = gr50Var.d;
        }
        List list4 = list2;
        int i4 = gr50Var.e;
        if ((i2 & 32) != 0) {
            mdmVar = gr50Var.f;
        }
        gr50Var.getClass();
        list3.getClass();
        list4.getClass();
        return new gr50(z2, i3, list3, list4, i4, mdmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr50)) {
            return false;
        }
        gr50 gr50Var = (gr50) obj;
        return this.f11764a == gr50Var.f11764a && this.b == gr50Var.b && Intrinsics.d(this.c, gr50Var.c) && Intrinsics.d(this.d, gr50Var.d) && this.e == gr50Var.e && Intrinsics.d(this.f, gr50Var.f);
    }

    public final int hashCode() {
        int iA = twn.a(this.e, dw9.a(dw9.a(twn.a(this.b, Boolean.hashCode(this.f11764a) * 31, 31), 31, this.c), 31, this.d), 31);
        mdm mdmVar = this.f;
        return iA + (mdmVar == null ? 0 : mdmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = ohs0.t(this.b, "NewsCatalogChipsCategoriesState(loading=", ", selectedChipIndex=", ", cmsBannerItems=", this.f11764a);
        b1j.y(", bannerItems=", ", lottieTypeId=", sbT, this.c, this.d);
        sbT.append(this.e);
        sbT.append(", errorLottieConfig=");
        sbT.append(this.f);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
