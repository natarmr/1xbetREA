package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ym2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5l0 f42866a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final y78 e;
    public final wcb f;
    public final List g;
    public final boolean h;

    public ym2(v5l0 v5l0Var, boolean z, boolean z2, boolean z3, y78 y78Var, wcb wcbVar, List list, boolean z4) {
        y78Var.getClass();
        wcbVar.getClass();
        list.getClass();
        this.f42866a = v5l0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = y78Var;
        this.f = wcbVar;
        this.g = list;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym2)) {
            return false;
        }
        ym2 ym2Var = (ym2) obj;
        return this.f42866a == ym2Var.f42866a && this.b == ym2Var.b && this.c == ym2Var.c && this.d == ym2Var.d && Intrinsics.d(this.e, ym2Var.e) && Intrinsics.d(this.f, ym2Var.f) && Intrinsics.d(this.g, ym2Var.g) && this.h == ym2Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + dw9.a((this.f.hashCode() + ((this.e.hashCode() + brm0.e(brm0.e(brm0.e(this.f42866a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltViewedRecommendGamesConfig(sportEventCardStyle=");
        sb.append(this.f42866a);
        sb.append(", hasStream=");
        sb.append(this.b);
        sb.append(", isNewEventParams=");
        ua80.u(", bettingDisabled=", ", gameUtilsProvider=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", champImagesHolder=");
        sb.append(this.f);
        sb.append(", specialEvents=");
        sb.append(this.g);
        sb.append(", supportRtl=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
