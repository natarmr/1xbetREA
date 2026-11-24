package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yo50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42968a;
    public final int b;
    public final boolean c;
    public final List d;
    public final List e;
    public final int f;
    public final mdm g;

    public yo50(boolean z, int i, boolean z2, List list, List list2, int i2, mdm mdmVar) {
        list.getClass();
        list2.getClass();
        this.f42968a = z;
        this.b = i;
        this.c = z2;
        this.d = list;
        this.e = list2;
        this.f = i2;
        this.g = mdmVar;
    }

    public static yo50 a(yo50 yo50Var, boolean z, int i, boolean z2, List list, List list2, mdm mdmVar, int i2) {
        if ((i2 & 1) != 0) {
            z = yo50Var.f42968a;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            i = yo50Var.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z2 = yo50Var.c;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            list = yo50Var.d;
        }
        List list3 = list;
        if ((i2 & 16) != 0) {
            list2 = yo50Var.e;
        }
        List list4 = list2;
        int i4 = yo50Var.f;
        if ((i2 & 64) != 0) {
            mdmVar = yo50Var.g;
        }
        yo50Var.getClass();
        list3.getClass();
        list4.getClass();
        return new yo50(z3, i3, z4, list3, list4, i4, mdmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo50)) {
            return false;
        }
        yo50 yo50Var = (yo50) obj;
        return this.f42968a == yo50Var.f42968a && this.b == yo50Var.b && this.c == yo50Var.c && Intrinsics.d(this.d, yo50Var.d) && Intrinsics.d(this.e, yo50Var.e) && this.f == yo50Var.f && Intrinsics.d(this.g, yo50Var.g);
    }

    public final int hashCode() {
        int iA = twn.a(this.f, dw9.a(dw9.a(brm0.e(twn.a(this.b, Boolean.hashCode(this.f42968a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31);
        mdm mdmVar = this.g;
        return iA + (mdmVar == null ? 0 : mdmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = ohs0.t(this.b, "NewsCatalogBigBannerState(loading=", ", topBannerCurrentIndex=", ", topBannerAnimationPaused=", this.f42968a);
        vqd.y(sbT, ", cmsBannerItems=", this.d, ", bannerItems=", this.c);
        brm0.v(this.f, ", lottieTypeId=", ", errorLottieConfig=", sbT, this.e);
        return cs0.m(sbT, this.g, Separators.RPAREN);
    }
}
