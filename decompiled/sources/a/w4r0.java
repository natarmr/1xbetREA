package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w4r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5l0 f38556a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final y78 e;
    public final wcb f;
    public final List g;

    public w4r0(v5l0 v5l0Var, boolean z, boolean z2, boolean z3, y78 y78Var, wcb wcbVar, List list) {
        v5l0Var.getClass();
        y78Var.getClass();
        wcbVar.getClass();
        list.getClass();
        this.f38556a = v5l0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = y78Var;
        this.f = wcbVar;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4r0)) {
            return false;
        }
        w4r0 w4r0Var = (w4r0) obj;
        return this.f38556a == w4r0Var.f38556a && this.b == w4r0Var.b && this.c == w4r0Var.c && this.d == w4r0Var.d && Intrinsics.d(this.e, w4r0Var.e) && Intrinsics.d(this.f, w4r0Var.f) && Intrinsics.d(this.g, w4r0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + brm0.e(brm0.e(brm0.e(this.f38556a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopGamesByStatBottomSheetConfig(sportEventCardStyle=");
        sb.append(this.f38556a);
        sb.append(", hasStream=");
        sb.append(this.b);
        sb.append(", bettingDisabled=");
        ua80.u(", supportRtl=", ", gameUtilsProvider=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", champImagesHolder=");
        sb.append(this.f);
        sb.append(", specialEvents=");
        return dw9.r(sb, this.g, Separators.RPAREN);
    }
}
