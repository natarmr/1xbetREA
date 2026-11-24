package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nzo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wcb f24383a;
    public final List b;
    public final v5l0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public nzo0(wcb wcbVar, List list, v5l0 v5l0Var, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f24383a = wcbVar;
        this.b = list;
        this.c = v5l0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzo0)) {
            return false;
        }
        nzo0 nzo0Var = (nzo0) obj;
        return Intrinsics.d(this.f24383a, nzo0Var.f24383a) && Intrinsics.d(this.b, nzo0Var.b) && this.c == nzo0Var.c && this.d == nzo0Var.d && this.e == nzo0Var.e && this.f == nzo0Var.f;
    }

    public final int hashCode() {
        wcb wcbVar = this.f24383a;
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(axq.c(this.c, dw9.a((wcbVar == null ? 0 : wcbVar.hashCode()) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamBetEventsScreenConfig(champImagesHolder=");
        sb.append(this.f24383a);
        sb.append(", specialEventList=");
        sb.append(this.b);
        sb.append(", sportEventCardStyle=");
        sb.append(this.c);
        sb.append(", isBettingDisabled=");
        sb.append(this.d);
        sb.append(", hasStream=");
        return ohs0.p(", supportRtl=", Separators.RPAREN, sb, this.e, this.f);
    }
}
