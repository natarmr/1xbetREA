package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5l0 f42767a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final y78 e;
    public final wcb f;
    public final List g;
    public final boolean h;
    public final g2v i;
    public final boolean j;
    public final xte k;
    public final boolean l;

    public yk2(v5l0 v5l0Var, boolean z, boolean z2, boolean z3, y78 y78Var, wcb wcbVar, List list, boolean z4, g2v g2vVar, boolean z5, xte xteVar, boolean z6) {
        y78Var.getClass();
        wcbVar.getClass();
        list.getClass();
        g2vVar.getClass();
        xteVar.getClass();
        this.f42767a = v5l0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = y78Var;
        this.f = wcbVar;
        this.g = list;
        this.h = z4;
        this.i = g2vVar;
        this.j = z5;
        this.k = xteVar;
        this.l = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk2)) {
            return false;
        }
        yk2 yk2Var = (yk2) obj;
        return this.f42767a == yk2Var.f42767a && this.b == yk2Var.b && this.c == yk2Var.c && this.d == yk2Var.d && Intrinsics.d(this.e, yk2Var.e) && Intrinsics.d(this.f, yk2Var.f) && Intrinsics.d(this.g, yk2Var.g) && this.h == yk2Var.h && Intrinsics.d(this.i, yk2Var.i) && this.j == yk2Var.j && this.k == yk2Var.k && this.l == yk2Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + ((this.k.hashCode() + brm0.e((this.i.hashCode() + brm0.e(dw9.a((this.f.hashCode() + ((this.e.hashCode() + brm0.e(brm0.e(brm0.e(this.f42767a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h)) * 31, 31, this.j)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltSportTrackedConfig(sportEventCardStyle=");
        sb.append(this.f42767a);
        sb.append(", hasStream=");
        sb.append(this.b);
        sb.append(", isNewEventParams=");
        ua80.u(", bettingDisabled=", ", gameUtilsProvider=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", champImagesHolder=");
        sb.append(this.f);
        sb.append(", specialEvents=");
        rz4.z(sb, ", isTablet=", this.g, ", lottieEmptyConfigurator=", this.h);
        sb.append(this.i);
        sb.append(", supportRtl=");
        sb.append(this.j);
        sb.append(", couponCardStyleType=");
        sb.append(this.k);
        sb.append(", altStyleEnabled=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
