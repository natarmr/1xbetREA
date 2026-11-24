package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feature.promo_aggregator.impl.presentation.compose.PromoCodeCacheContentState;

/* JADX INFO: loaded from: classes4.dex */
public final class iac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14432a;
    public final PromoCodeCacheContentState b;
    public final boolean c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final boolean m;

    public iac0(String str, PromoCodeCacheContentState promoCodeCacheContentState, boolean z, String str2, String str3, List list, String str4, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6) {
        str.getClass();
        list.getClass();
        this.f14432a = str;
        this.b = promoCodeCacheContentState;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = list;
        this.g = str4;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = i;
        this.m = z6;
    }

    public static iac0 a(iac0 iac0Var, PromoCodeCacheContentState promoCodeCacheContentState, boolean z, String str, String str2, ArrayList arrayList, String str3, boolean z2, boolean z3, boolean z4, int i) {
        String str4 = iac0Var.f14432a;
        PromoCodeCacheContentState promoCodeCacheContentState2 = (i & 2) != 0 ? iac0Var.b : promoCodeCacheContentState;
        boolean z5 = (i & 4) != 0 ? iac0Var.c : z;
        String str5 = (i & 8) != 0 ? iac0Var.d : str;
        String str6 = (i & 16) != 0 ? iac0Var.e : str2;
        List list = (i & 32) != 0 ? iac0Var.f : arrayList;
        String str7 = (i & 64) != 0 ? iac0Var.g : str3;
        boolean z6 = (i & 128) != 0 ? iac0Var.h : z2;
        boolean z7 = (i & 256) != 0 ? iac0Var.i : z3;
        boolean z8 = iac0Var.j;
        boolean z9 = iac0Var.k;
        int i2 = iac0Var.l;
        boolean z10 = (i & 4096) != 0 ? iac0Var.m : z4;
        iac0Var.getClass();
        str4.getClass();
        str6.getClass();
        list.getClass();
        return new iac0(str4, promoCodeCacheContentState2, z5, str5, str6, list, str7, z6, z7, z8, z9, i2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iac0)) {
            return false;
        }
        iac0 iac0Var = (iac0) obj;
        return Intrinsics.d(this.f14432a, iac0Var.f14432a) && Intrinsics.d(this.b, iac0Var.b) && this.c == iac0Var.c && this.d.equals(iac0Var.d) && this.e.equals(iac0Var.e) && Intrinsics.d(this.f, iac0Var.f) && this.g.equals(iac0Var.g) && this.h == iac0Var.h && this.i == iac0Var.i && this.j == iac0Var.j && this.k == iac0Var.k && this.l == iac0Var.l && this.m == iac0Var.m;
    }

    public final int hashCode() {
        int iHashCode = this.f14432a.hashCode() * 31;
        PromoCodeCacheContentState promoCodeCacheContentState = this.b;
        return Boolean.hashCode(this.m) + twn.a(this.l, brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(dw9.a(ua80.b(ua80.b(brm0.e((iHashCode + (promoCodeCacheContentState == null ? 0 : promoCodeCacheContentState.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCheckState(title=");
        sb.append(this.f14432a);
        sb.append(", contentCache=");
        sb.append(this.b);
        sb.append(", progressState=");
        f140.s(", errorText=", this.d, ", promoCode=", sb, this.c);
        cs0.y(this.e, ", descriptions=", ", parentScreen=", sb, this.f);
        brm0.C(this.g, ", cancelImmediateOnboarding=", ", lastAuthorized=", sb, this.h);
        ua80.u(", hasAggregatorPlayerTasks=", ", hasAggregatorPlayerTasksHistory=", sb, this.i, this.j);
        ua80.q(this.l, ", aggregatorPlayerTasksRequestsTimeout=", ", wasKeyboardOpen=", sb, this.k);
        return rw2.p(sb, this.m, Separators.RPAREN);
    }
}
