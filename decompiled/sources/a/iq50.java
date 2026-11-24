package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class iq50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15192a;
    public final List b;
    public final List c;
    public final int d;
    public final mdm e;

    public iq50(boolean z, List list, List list2, int i, mdm mdmVar) {
        list.getClass();
        list2.getClass();
        this.f15192a = z;
        this.b = list;
        this.c = list2;
        this.d = i;
        this.e = mdmVar;
    }

    public static iq50 a(iq50 iq50Var, boolean z, List list, List list2, mdm mdmVar, int i) {
        if ((i & 2) != 0) {
            list = iq50Var.b;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = iq50Var.c;
        }
        List list4 = list2;
        int i2 = iq50Var.d;
        if ((i & 16) != 0) {
            mdmVar = iq50Var.e;
        }
        iq50Var.getClass();
        list3.getClass();
        list4.getClass();
        return new iq50(z, list3, list4, i2, mdmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq50)) {
            return false;
        }
        iq50 iq50Var = (iq50) obj;
        return this.f15192a == iq50Var.f15192a && Intrinsics.d(this.b, iq50Var.b) && Intrinsics.d(this.c, iq50Var.c) && this.d == iq50Var.d && Intrinsics.d(this.e, iq50Var.e);
    }

    public final int hashCode() {
        int iA = twn.a(this.d, dw9.a(dw9.a(Boolean.hashCode(this.f15192a) * 31, 31, this.b), 31, this.c), 31);
        mdm mdmVar = this.e;
        return iA + (mdmVar == null ? 0 : mdmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsCatalogCategoryState(loading=");
        sb.append(this.f15192a);
        sb.append(", cmsBannerItems=");
        sb.append(this.b);
        sb.append(", bannerItems=");
        brm0.v(this.d, ", lottieTypeId=", ", errorLottieConfig=", sb, this.c);
        return cs0.m(sb, this.e, Separators.RPAREN);
    }
}
