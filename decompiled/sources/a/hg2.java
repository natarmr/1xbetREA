package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5l0 f12998a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final y78 f;
    public final wcb g;
    public final List h;
    public final boolean i;
    public final g2v j;
    public final boolean k;

    public hg2(v5l0 v5l0Var, boolean z, boolean z2, boolean z3, boolean z4, y78 y78Var, wcb wcbVar, List list, boolean z5, g2v g2vVar, boolean z6) {
        y78Var.getClass();
        wcbVar.getClass();
        list.getClass();
        g2vVar.getClass();
        this.f12998a = v5l0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = y78Var;
        this.g = wcbVar;
        this.h = list;
        this.i = z5;
        this.j = g2vVar;
        this.k = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg2)) {
            return false;
        }
        hg2 hg2Var = (hg2) obj;
        return this.f12998a == hg2Var.f12998a && this.b == hg2Var.b && this.c == hg2Var.c && this.d == hg2Var.d && this.e == hg2Var.e && Intrinsics.d(this.f, hg2Var.f) && Intrinsics.d(this.g, hg2Var.g) && Intrinsics.d(this.h, hg2Var.h) && this.i == hg2Var.i && Intrinsics.d(this.j, hg2Var.j) && this.k == hg2Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + brm0.e(dw9.a((this.g.hashCode() + ((this.f.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(this.f12998a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltSportEventsConfig(sportEventCardStyle=");
        sb.append(this.f12998a);
        sb.append(", hasStream=");
        sb.append(this.b);
        sb.append(", isNewEventParams=");
        ua80.u(", bettingDisabled=", ", hasResults=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", gameUtilsProvider=");
        sb.append(this.f);
        sb.append(", champImagesHolder=");
        sb.append(this.g);
        sb.append(", specialEvents=");
        sb.append(this.h);
        sb.append(", isTablet=");
        sb.append(this.i);
        sb.append(", lottieEmptyConfigurator=");
        sb.append(this.j);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.k, Separators.RPAREN);
    }
}
