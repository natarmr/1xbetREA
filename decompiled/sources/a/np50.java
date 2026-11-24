package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class np50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23896a;
    public final List b;
    public final List c;
    public final int d;
    public final mdm e;

    public np50(boolean z, List list, List list2, int i, mdm mdmVar) {
        list.getClass();
        list2.getClass();
        this.f23896a = z;
        this.b = list;
        this.c = list2;
        this.d = i;
        this.e = mdmVar;
    }

    public static np50 a(np50 np50Var, boolean z, List list, List list2, mdm mdmVar, int i) {
        if ((i & 2) != 0) {
            list = np50Var.b;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = np50Var.c;
        }
        List list4 = list2;
        int i2 = np50Var.d;
        if ((i & 16) != 0) {
            mdmVar = np50Var.e;
        }
        np50Var.getClass();
        list3.getClass();
        list4.getClass();
        return new np50(z, list3, list4, i2, mdmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np50)) {
            return false;
        }
        np50 np50Var = (np50) obj;
        return this.f23896a == np50Var.f23896a && Intrinsics.d(this.b, np50Var.b) && Intrinsics.d(this.c, np50Var.c) && this.d == np50Var.d && Intrinsics.d(this.e, np50Var.e);
    }

    public final int hashCode() {
        int iA = twn.a(this.d, dw9.a(dw9.a(Boolean.hashCode(this.f23896a) * 31, 31, this.b), 31, this.c), 31);
        mdm mdmVar = this.e;
        return iA + (mdmVar == null ? 0 : mdmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsCatalogCardsState(loading=");
        sb.append(this.f23896a);
        sb.append(", cmsBannerItems=");
        sb.append(this.b);
        sb.append(", bannerItems=");
        brm0.v(this.d, ", lottieTypeId=", ", errorLottieConfig=", sb, this.c);
        return cs0.m(sb, this.e, Separators.RPAREN);
    }
}
